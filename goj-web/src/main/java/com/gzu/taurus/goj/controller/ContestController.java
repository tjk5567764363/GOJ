package com.gzu.taurus.goj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gzu.taurus.goj.bll.bo.contest.interfaces.ContestBO;
import com.gzu.taurus.goj.bll.bo.contest.interfaces.ContestProblemBO;
import com.gzu.taurus.goj.common.constant.WebConstant;
import com.gzu.taurus.goj.common.enums.Contest.Type;
import com.gzu.taurus.goj.common.exception.BOException;
import com.gzu.taurus.goj.dal.dataobject.contest.ContestDO;
import com.gzu.taurus.goj.dal.dataobject.contest.ContestProblemDO;

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
	@RequestMapping(value = "/{id}/{pwd}", method = RequestMethod.GET)
	public String getContest(@PathVariable("id") Long id, @PathVariable("pwd") String pwd, Model model) throws BOException {
		Assert.notNull(id, "Id不能为空.");

		ContestDO contestDB = contestBO.getContest(new ContestDO(id));
		if (contestDB.getType().equals(Type.PRIVATE)) {
			Assert.hasText(pwd, "密码不能为空.");
			if (!pwd.equals(contestDB.getPassword())) {
				throw new BOException("密码不正确.");
			}
		}
		ContestProblemDO contestProblemQuery = new ContestProblemDO();
		contestProblemQuery.setContest_id(contestDB.getId());
		List<ContestProblemDO> list = contestProblemBO.findContestProblems(contestProblemQuery);

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
	@RequestMapping(value = "/addcontest", method = RequestMethod.GET)
	public String addContest(Model model) {
		return WebConstant.ADDCONTEST;
	}
}
