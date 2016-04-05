package com.gzu.taurus.goj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.ui.Model;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.gzu.taurus.goj.bll.bo.contest.interfaces.ContestBO;
import com.gzu.taurus.goj.bll.bo.contest.interfaces.ContestProblemBO;
import com.gzu.taurus.goj.bll.bo.problem.interfaces.ProblemBO;
import com.gzu.taurus.goj.bll.bo.problem.interfaces.SubmitBO;
import com.gzu.taurus.goj.bll.vo.problem.ProblemVO;
import com.gzu.taurus.goj.common.constant.WebConstant;
import com.gzu.taurus.goj.common.enums.Contest.Type;
import com.gzu.taurus.goj.common.enums.Submit;
import com.gzu.taurus.goj.common.enums.Submit.Verdict;
import com.gzu.taurus.goj.common.exception.BOException;
import com.gzu.taurus.goj.common.util.BeanUtil;
import com.gzu.taurus.goj.dal.dataobject.contest.ContestDO;
import com.gzu.taurus.goj.dal.dataobject.contest.ContestProblemDO;
import com.gzu.taurus.goj.dal.dataobject.problem.ProblemDO;
import com.gzu.taurus.goj.dal.dataobject.problem.SubmitDO;

/**
 * ContestController
 *
 * @Author tangjunkai
 * @CreateDate 2016年3月29日
 */
@RestController
@RequestMapping("/contest")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ContestController extends BaseController {
	@Autowired
	private ContestBO contestBO;

	@Autowired
	private ContestProblemBO contestProblemBO;

	@Autowired
	private ProblemBO problemBO;

	@Autowired
	private SubmitBO submitBO;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView findContests() {
		List<ContestDO> list = contestBO.findContests(new ContestDO());

		return getMav(WebConstant.CONTESTLIST).addObject("contestList", list);
	}

	@RequestMapping(value = "/{id}", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView getContest(@PathVariable("id") Long id, ContestDO query) throws BOException {
		Assert.notNull(id, "Id不能为空.");

		ContestDO contestDB = contestBO.getContest(new ContestDO(id));
		if (contestDB.getType().equals(Type.PRIVATE.getValue())) {
			Assert.hasText(query.getPassword(), "密码不能为空.");
			if (!query.getPassword().equals(contestDB.getPassword())) {
				throw new BOException("密码不正确.");
			}
		}
		ContestProblemDO contestProblemQuery = new ContestProblemDO();
		contestProblemQuery.setContest_id(contestDB.getId());
		List<ContestProblemDO> contestProblemList = contestProblemBO.findContestProblems(contestProblemQuery);

		ProblemDO problemDB;
		ProblemVO problemVO;
		int no = 65;
		List<ProblemVO> problemList = Lists.newArrayList();
		for (ContestProblemDO iter : contestProblemList) {
			problemVO = new ProblemVO();
			problemDB = problemBO.getProblem(new ProblemDO(iter.getProblem_id()));
			BeanUtil.copy(problemDB, problemVO);

			SubmitDO submitQuery = new SubmitDO();
			submitQuery.setType(Submit.Type.CONTEST.getValue());
			submitQuery.setProblem_id(iter.getProblem_id());
			int submit = submitBO.getSubmitCount(submitQuery);
			submitQuery.setVerdict(Verdict.Accepted.getValue());
			int solved = submitBO.getSubmitCount(submitQuery);
			submitQuery.setUser_id(getLoginUserId());
			int count = submitBO.getSubmitCount(submitQuery);

			problemVO.setSolved(solved);
			problemVO.setSubmit(submit);
			problemVO.setIsSolved(count > 0 ? 1 : 0);
			problemVO.setContestNo(String.valueOf((char) (no++)));

			problemList.add(problemVO);
		}

		return getMav(WebConstant.CONTEST).addAllObjects(ImmutableMap.of("contest", contestDB, "problemList", problemList));
	}

	@RequestMapping(value = "/addcontest", method = RequestMethod.POST)
	public ModelAndView addContest(ContestDO contest, Model model) {
		return getMav(WebConstant.ADDCONTEST);
	}

	@RequestMapping(value = "/{id}/{pid}", method = RequestMethod.GET)
	public ProblemDO getContestProblem(//
			@PathVariable("id") Long id, // 比赛id
			@PathVariable("pid") Long pid) { // 题目id
		ProblemDO problemDB = problemBO.getProblem(new ProblemDO(pid));
		return problemDB;
	}

	@RequestMapping(value = "/{id}/status", method = RequestMethod.GET)
	public List<SubmitDO> getContestStatus(@PathVariable("id") Long id) {
		SubmitDO submitQuery = new SubmitDO();
		List<SubmitDO> submitList = submitBO.findSubmits(submitQuery);

		return submitList;
	}

	@Override
	ModelAndView doMav(ModelAndView mav) {
		return mav.addObject(WebConstant.MENU, WebConstant.CONTEST);
	}
}
