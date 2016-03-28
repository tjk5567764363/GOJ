package com.gzu.taurus.goj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gzu.taurus.goj.bll.bo.problem.interfaces.ProblemBO;
import com.gzu.taurus.goj.common.constant.WebConstant;
import com.gzu.taurus.goj.dal.dataobject.problem.ProblemDO;

@RestController
@RequestMapping("/")
public class ProblemController extends BaseController {
	@Autowired
	private ProblemBO problemBO;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String getProblem(@PathVariable("id") Long id, Model model) {

		ProblemDO problemDB = problemBO.getProblem(new ProblemDO(id));

		if (problemDB == null) {
			return findProblems(model);
		} else {
			model.addAttribute("problem", problemDB);
			return WebConstant.PROBLEM;
		}
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String findProblems(Model model) {
		model.addAttribute("problemList", problemBO.findProblems(new ProblemDO()));
		return WebConstant.PROBLEMLIST;
	}
}
