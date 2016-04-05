package com.gzu.taurus.goj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.gzu.taurus.goj.bll.bo.user.interfaces.UserBO;
import com.gzu.taurus.goj.common.constant.WebConstant;
import com.gzu.taurus.goj.dal.dataobject.user.UserDO;

/**
 * RankListController
 *
 * @Author tangjunkai
 * @CreateDate 2016年3月29日
 */
@RestController
@RequestMapping("/ranklist")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class RankListController extends BaseController {
	@Autowired
	private UserBO userBO;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView findRankLists(Model model) {

		List<UserDO> list = userBO.findUsers(new UserDO());

		return getMav(WebConstant.RANKLIST).addObject("userList", list);
	}

	@Override
	ModelAndView doMav(ModelAndView mav) {
		return mav.addObject(WebConstant.MENU, WebConstant.RANKLIST);
	}
}
