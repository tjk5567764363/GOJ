package com.gzu.taurus.goj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gzu.taurus.goj.bll.bo.user.interfaces.UserBO;
import com.gzu.taurus.goj.common.constant.WebConstant;
import com.gzu.taurus.goj.dal.dataobject.user.UserDO;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserBO userBO;

	@RequestMapping(value = "/{account}", method = RequestMethod.GET)
	public String toIndex(@PathVariable("account") String account, Model model) {

		UserDO userDB = userBO.getUser(new UserDO(account));

		model.addAttribute("user", userDB);

		if (userDB == null) {
			return WebConstant.PROBLEMLIST;
		} else {
			return "profile";
		}
	}
}
