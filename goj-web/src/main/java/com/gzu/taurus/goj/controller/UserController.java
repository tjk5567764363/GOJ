package com.gzu.taurus.goj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gzu.taurus.goj.bll.bo.user.interfaces.UserBO;
import com.gzu.taurus.goj.common.constant.WebConstant;
import com.gzu.taurus.goj.dal.dataobject.user.UserDO;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController {
	@Autowired
	private UserBO userBO;

	@RequestMapping(value = "/{account}", method = RequestMethod.GET)
	public String getUser(@PathVariable("account") String account, Model model) {

		UserDO userDB = userBO.getUser(new UserDO(account));

		model.addAttribute("user", userDB);

		if (userDB == null) {
			return WebConstant.PROBLEMLIST;
		} else {
			return WebConstant.PROFILE;
		}
	}

	@RequestMapping(value = "/{acount}/{password}/{nickname}", method = RequestMethod.PUT)
	public String regedit( //
			@PathVariable("acount") String account, //
			@PathVariable("password") String password, //
			@PathVariable("nickname") String nickname, //
			Model model) {

		UserDO userTemp = new UserDO();
		userTemp.setAccount(account);
		userTemp.setPassword(password);
		userTemp.setNick_name(nickname);
		userBO.createUser(userTemp);

		return WebConstant.PROBLEMLIST;
	}
}
