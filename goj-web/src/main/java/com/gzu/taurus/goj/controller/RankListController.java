package com.gzu.taurus.goj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
public class RankListController extends BaseController {
	@Autowired
	private UserBO userBO;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String findRankLists(Model model) {

		List<UserDO> list = userBO.findUsers(new UserDO());

		model.addAttribute("userList", list);

		return WebConstant.RANKLIST;
	}
}
