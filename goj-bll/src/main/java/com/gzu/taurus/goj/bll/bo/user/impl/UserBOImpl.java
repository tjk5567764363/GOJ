package com.gzu.taurus.goj.bll.bo.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gzu.taurus.goj.bll.bo.user.interfaces.UserBO;
import com.gzu.taurus.goj.dal.dao.user.UserDAO;
import com.gzu.taurus.goj.dal.dataobject.user.UserDO;

/**
 * UserBOImpl
 *
 * @Author tangjunkai
 * @CreateDate 2016年3月22日
 */
@Service
public class UserBOImpl implements UserBO {
	@Autowired
	private UserDAO userDAO;

	public Long createUser(UserDO user) {
		// TODO Auto-generated method stub
		return 0L;
	}

	public UserDO getUser(UserDO user) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<UserDO> findUsers(UserDO user) {
		// TODO Auto-generated method stub
		return null;
	}

	public int modifyUser(UserDO user) {
		// TODO Auto-generated method stub
		return 0;
	}
}
