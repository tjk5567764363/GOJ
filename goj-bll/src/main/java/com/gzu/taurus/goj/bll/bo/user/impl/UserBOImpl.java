package com.gzu.taurus.goj.bll.bo.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import com.gzu.taurus.goj.bll.bo.user.interfaces.UserBO;
import com.gzu.taurus.goj.common.enums.Status;
import com.gzu.taurus.goj.common.util.AssertUtil;
import com.gzu.taurus.goj.dal.dao.user.UserDAO;
import com.gzu.taurus.goj.dal.dataobject.user.UserDO;

/**
 * UserBOImpl
 *
 * @Author tangjunkai
 * @CreateDate 2016年3月22日
 */
@Service
@Transactional
public class UserBOImpl implements UserBO {
	@Autowired
	private UserDAO userDAO;

	public Long createUser(UserDO user) {
		AssertUtil.notNull(user);

		user.setSolved(0);
		user.setSubmit(0);
		user.setStatus(Status.NOMARL.getValue());

		userDAO.createUser(user);
		return 0L;
	}

	@Transactional(readOnly = true)
	public UserDO getUser(UserDO user) {
		AssertUtil.notNull(user);

		return userDAO.getUser(user);
	}

	@Transactional(readOnly = true)
	public List<UserDO> findUsers(UserDO user) {
		AssertUtil.notNull(user);

		return userDAO.findUsers(user);
	}

	public int modifyUser(UserDO user) {
		AssertUtil.notNull(user);
		Assert.notNull(user.getId(), "Id不能为空.");

		return userDAO.modifyUser(user);
	}
}
