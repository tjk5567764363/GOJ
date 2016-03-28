package com.gzu.taurus.goj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gzu.taurus.goj.bll.bo.contest.interfaces.ContestBO;
import com.gzu.taurus.goj.common.constant.WebConstant;
import com.gzu.taurus.goj.dal.dataobject.contest.ContestDO;

@RestController
@RequestMapping("/contest")
public class ContestController {
	@Autowired
	private ContestBO contestBO;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getContest(Model model) {

		contestBO.findContests(new ContestDO());

		return WebConstant.CONTEST;
	}

	@RequestMapping(value = "/addcontest", method = RequestMethod.GET)
	public String addContest(Model model) {
		return WebConstant.ADDCONTEST;
	}
}
