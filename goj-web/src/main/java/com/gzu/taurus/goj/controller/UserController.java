package com.gzu.taurus.goj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.gzu.taurus.goj.bll.bo.problem.interfaces.ProblemBO;
import com.gzu.taurus.goj.bll.bo.user.interfaces.UserBO;
import com.gzu.taurus.goj.common.constant.WebConstant;
import com.gzu.taurus.goj.dal.dataobject.user.UserDO;

/**
 * UserController
 *
 * @Author tangjunkai
 * @CreateDate 2016年4月5日
 */
@RestController
@RequestMapping("/user")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class UserController extends BaseController {
	@Autowired
	private UserBO userBO;

	@Autowired
	private ProblemBO problemBO;

	@RequestMapping(value = "/{account}", method = RequestMethod.GET)
	public ModelAndView getUser(@PathVariable("account") String account) {
		UserDO userDB = userBO.getUser(new UserDO(account));

		return getMav(WebConstant.PROFILE).addObject("user", userDB);
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView regedit(UserDO user, Model model) {
		UserDO userTemp = new UserDO();
		userTemp.setAccount(user.getAccount());
		userTemp.setPassword(user.getPassword());
		userTemp.setNick_name(user.getNick_name());
		userBO.createUser(userTemp);

		return getMavRedir(String.format(WebConstant.REDIRECTUSER, user.getAccount()));
	}

	@Override
	ModelAndView doMav(ModelAndView mav) {
		return mav;
	}
}
