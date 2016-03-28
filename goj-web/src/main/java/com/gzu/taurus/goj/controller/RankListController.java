package com.gzu.taurus.goj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gzu.taurus.goj.bll.bo.problem.interfaces.SubmitBO;
import com.gzu.taurus.goj.common.constant.WebConstant;

@RestController
@RequestMapping("/ranklist")
public class RankListController extends BaseController {
	@Autowired
	private SubmitBO submitBO;

	public String findRankLists() {
		return WebConstant.RANKLIST;
	}
}
