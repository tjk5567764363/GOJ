package com.gzu.taurus.goj.controller;

import org.springframework.web.servlet.ModelAndView;

import com.gzu.taurus.goj.dal.dataobject.user.UserDO;

/**
 * BaseController
 *
 * @Author tangjunkai
 * @CreateDate 2016年3月28日
 */
public abstract class BaseController {

	private ModelAndView mav;

	protected UserDO getLoginUser() {
		return null;
	}

	protected Long getLoginUserId() {
		return 1L;
	}

	public ModelAndView getMav(String view) {
		mav = new ModelAndView(view);
		return doMav(mav);
	}

	public ModelAndView getMavRedir(String view) {
		mav = new ModelAndView(view);
		return mav;
	}

	abstract ModelAndView doMav(ModelAndView mav);
}
