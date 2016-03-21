package com.gzu.taurus.goj.dal.dao.user;

import java.util.List;

import com.gzu.taurus.goj.dal.dataobject.user.UserDO;

/**
 * UserDAO
 *
 * @Author tangjunkai
 * @CreateDate 2016年3月20日
 */
public interface UserDAO {
	/**
	 * 创建User
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年3月20日
	 * @param user
	 * @return
	 */
	int createUser(UserDO user);

	/**
	 * getUser
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年3月20日
	 * @param user
	 * @return
	 */
	UserDO getUser(UserDO user);

	/**
	 * findUsers
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年3月20日
	 * @param user
	 * @return
	 */
	List<UserDO> findUsers(UserDO user);

	/**
	 * modifyUser
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年3月20日
	 * @param user
	 * @return
	 */
	int modifyUser(UserDO user);
}
