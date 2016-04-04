package com.gzu.taurus.goj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;
import com.gzu.taurus.goj.bll.bo.contest.interfaces.ContestBO;
import com.gzu.taurus.goj.bll.bo.contest.interfaces.ContestProblemBO;
import com.gzu.taurus.goj.bll.bo.problem.interfaces.ProblemBO;
import com.gzu.taurus.goj.bll.bo.problem.interfaces.SubmitBO;
import com.gzu.taurus.goj.bll.vo.problem.ProblemVO;
import com.gzu.taurus.goj.common.constant.WebConstant;
import com.gzu.taurus.goj.common.enums.Contest.Type;
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
public class ContestController extends BaseController {
	@Autowired
	private ContestBO contestBO;

	@Autowired
	private ContestProblemBO contestProblemBO;

	@Autowired
	private ProblemBO problemBO;

	@Autowired
	private SubmitBO submitBO;

	/**
	 * 获取比赛列表
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年3月29日
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String findContests(Model model) {

		List<ContestDO> list = contestBO.findContests(new ContestDO());

		model.addAttribute("contestList", list);
		model.addAttribute("menu", "contest");

		return WebConstant.CONTESTLIST;
	}

	/**
	 * 进入单个比赛
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年3月29日
	 * @param id
	 * @param pwd
	 * @param model
	 * @return
	 * @throws BOException
	 */
	@RequestMapping(value = "/{id}", method = { RequestMethod.GET, RequestMethod.POST })
	public String getContest(@PathVariable("id") Long id, ContestDO query, Model model) throws BOException {
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
		char c = 'A';
		int i = 0;
		List<ProblemVO> problemList = Lists.newArrayList();
		for (ContestProblemDO iter : contestProblemList) {
			problemVO = new ProblemVO();
			problemDB = problemBO.getProblem(new ProblemDO(iter.getProblem_id()));
			BeanUtil.copy(problemDB, problemVO);

			SubmitDO submitQuery = new SubmitDO();
			submitQuery.setProblem_id(iter.getId());
			int submit = submitBO.getSubmitCount(submitQuery);
			submitQuery.setVerdict(Verdict.Accepted.getValue());
			int solved = submitBO.getSubmitCount(submitQuery);
			submitQuery.setUser_id(getLoginUserId());
			int count = submitBO.getSubmitCount(submitQuery);

			problemVO.setSolved(solved);
			problemVO.setSubmit(submit);
			problemVO.setIsSolved(count > 0 ? 1 : 0);
			problemVO.setContestNo(String.valueOf(c + i++));

			problemList.add(problemVO);
		}

		model.addAttribute("problemList", problemList);

		return WebConstant.CONTEST;
	}

	/**
	 * 添加一个比赛
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年3月29日
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/addcontest", method = RequestMethod.POST)
	public String addContest(ContestDO contest, Model model) {
		return WebConstant.ADDCONTEST;
	}
}
