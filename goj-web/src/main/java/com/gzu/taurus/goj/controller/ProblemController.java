package com.gzu.taurus.goj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gzu.taurus.goj.bll.bo.problem.interfaces.ProblemBO;
import com.gzu.taurus.goj.dal.dataobject.problem.ProblemDO;

@Controller
@RequestMapping
public class ProblemController {
	@Autowired
	private ProblemBO problemBO;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String problem(@PathVariable("id") Long id, Model model) {

		ProblemDO problemDB = problemBO.getProblem(new ProblemDO(id));

		model.addAttribute("problem", problemDB);

		if (problemDB == null)
			return "problemlist";
		else
			return "problem";
	}
}
