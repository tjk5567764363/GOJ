package com.gzu.taurus.goj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gzu.taurus.goj.bll.bo.problem.interfaces.SubmitBO;
import com.gzu.taurus.goj.common.constant.WebConstant;
import com.gzu.taurus.goj.dal.dataobject.problem.SubmitDO;

@RestController
@RequestMapping("/status")
public class StatusController extends BaseController {
	@Autowired
	private SubmitBO submitBO;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String getStatus(@PathVariable("id") Long id, Model model) {

		SubmitDO submitQuery = new SubmitDO();
		submitQuery.setId(id);
		submitBO.getSubmit(submitQuery);

		return WebConstant.STATUS;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String findStatuss(Model model) {

		submitBO.findSubmits(new SubmitDO());

		return WebConstant.STATUS;
	}
}
