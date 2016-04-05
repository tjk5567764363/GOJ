package com.gzu.taurus.goj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.google.common.collect.Lists;
import com.gzu.taurus.goj.bll.bo.problem.interfaces.ProblemBO;
import com.gzu.taurus.goj.bll.bo.problem.interfaces.SubmitBO;
import com.gzu.taurus.goj.bll.vo.problem.ProblemVO;
import com.gzu.taurus.goj.common.constant.WebConstant;
import com.gzu.taurus.goj.common.enums.Submit.Verdict;
import com.gzu.taurus.goj.common.util.BeanUtil;
import com.gzu.taurus.goj.dal.dataobject.problem.ProblemDO;
import com.gzu.taurus.goj.dal.dataobject.problem.SubmitDO;

/**
 * ProblemController
 *
 * @Author tangjunkai
 * @CreateDate 2016年3月30日
 */
@RestController
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@RequestMapping("/")
public class ProblemController extends BaseController {
	@Autowired
	private ProblemBO problemBO;

	@Autowired
	private SubmitBO submitBO;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ModelAndView getProblem(@PathVariable("id") Long id) {
		ProblemDO problemDB = problemBO.getProblem(new ProblemDO(id));

		return getMav(WebConstant.PROBLEM).addObject("problem", problemDB);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView findProblems() {
		List<ProblemDO> problemVOs = Lists.newArrayList();
		List<ProblemDO> problemlist = problemBO.findProblems(new ProblemDO());

		for (ProblemDO iter : problemlist) {
			ProblemVO problemVOTemp = new ProblemVO();
			BeanUtil.copy(iter, problemVOTemp);

			SubmitDO submitQuery = new SubmitDO();
			submitQuery.setProblem_id(iter.getId());
			int submit = submitBO.getSubmitCount(submitQuery);
			submitQuery.setVerdict(Verdict.Accepted.getValue());
			int solved = submitBO.getSubmitCount(submitQuery);

			problemVOTemp.setSolved(solved);
			problemVOTemp.setSubmit(submit);
			problemVOs.add(problemVOTemp);
		}

		return getMav(WebConstant.PROBLEMLIST).addObject("problemList", problemVOs);
	}

	@Override
	ModelAndView doMav(ModelAndView mav) {
		return mav.addObject(WebConstant.MENU, WebConstant.PROBLEM);
	}
}
