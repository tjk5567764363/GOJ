package com.gzu.taurus.goj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gzu.taurus.goj.bll.bo.problem.interfaces.ProblemBO;

@Controller
@RequestMapping()
public class ProblemController {

	private ProblemBO problemBO;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String defaults(@PathVariable("id") Long id, Model model) {
		return "problem";
	}
}
