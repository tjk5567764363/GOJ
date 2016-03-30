package com.gzu.taurus.goj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gzu.taurus.goj.bll.bo.problem.interfaces.SubmitBO;
import com.gzu.taurus.goj.bll.bo.user.interfaces.UserBO;
import com.gzu.taurus.goj.common.constant.WebConstant;
import com.gzu.taurus.goj.dal.dataobject.problem.SubmitDO;
import com.gzu.taurus.goj.dal.dataobject.user.UserDO;

@RestController
@RequestMapping("/status")
public class StatusController extends BaseController {
	@Autowired
	private SubmitBO submitBO;

	@Autowired
	private UserBO userBO;

	@Autowired
	private Shell s;

	@RequestMapping(value = "/{id}", method = RequestMethod.POST)
	public String createStatus( //
			@PathVariable("id") Long id, // 题目编号
			@RequestParam("lang") Integer lang, // 题目语言
			@RequestParam("source") String source, // 源代码
			Model model) {

		SubmitDO submitTemp = new SubmitDO();
		submitTemp.setUser_id(getLoginUserId());
		submitTemp.setProblem_id(id);
		submitTemp.setLanguage(lang);
		submitTemp.setSource_code(source);
		submitTemp.setLength(source.length());
		Long submitId = submitBO.createSubmit(submitTemp);

		/************* Judge 之后考虑放在task *************/
		s.judge(submitId);
		/************************************************/

		UserDO userTemp = new UserDO();
		userTemp.setId(getLoginUserId());
		userTemp.setSubmit(1);
		userBO.modifyUser(userTemp);

		return "redirect:/goj/status/";
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String getStatus(@PathVariable("id") Long id, Model model) {

		SubmitDO submitQuery = new SubmitDO();
		submitQuery.setId(id);
		submitBO.getSubmit(submitQuery);

		return WebConstant.STATUS;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String findStatuss(Model model) {

		List<SubmitDO> list = submitBO.findSubmits(new SubmitDO());

		model.addAttribute("statusList", list);

		return WebConstant.STATUS;
	}
}
