package com.gzu.taurus.goj.controller;

import com.gzu.taurus.goj.dal.dataobject.user.UserDO;

/**
 * BaseController
 *
 * @Author tangjunkai
 * @CreateDate 2016年3月28日
 */
public class BaseController {

	protected UserDO getLoginUser() {
		return null;
	}

	protected Long getLoginUserId() {
		return 1L;
	}
}
