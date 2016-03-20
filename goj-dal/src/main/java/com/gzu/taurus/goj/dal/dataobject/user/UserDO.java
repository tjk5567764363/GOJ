package com.gzu.taurus.goj.dal.dataobject.user;

import com.gzu.taurus.goj.dal.dataobject.BaseDO;


/**
 * UserDO
 *
 * @Author tangjunkai
 * @CreateDate 2016年3月20日
 */
public class UserDO extends BaseDO {
	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

	/** 账号 */
	private String account;

	/** 密码 */
	private String password;

	/** 昵称 */
	private String nick_name;

	/** 年龄 */
	private Integer age;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNick_name() {
		return nick_name;
	}

	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
