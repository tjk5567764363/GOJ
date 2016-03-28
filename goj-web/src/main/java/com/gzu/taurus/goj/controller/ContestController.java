package com.gzu.taurus.goj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gzu.taurus.goj.common.constant.WebConstant;

@RestController
@RequestMapping("/contest")
public class ContestController {

	@RequestMapping()
	public String getContest() {
		return WebConstant.CONTEST;
	}
}
