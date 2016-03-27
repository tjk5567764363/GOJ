package com.gzu.taurus.goj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gzu.taurus.goj.bll.bo.problem.interfaces.SubmitBO;

@RestController
@RequestMapping("/status")
public class StatusController {
	@Autowired
	private SubmitBO submitBO;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String getStatus(@PathVariable("id") Long id, Model model) {
		return "status";
	}
}
