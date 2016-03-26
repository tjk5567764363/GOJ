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

	/** ID */
	private Long id;

	/** 账号 */
	private String account;

	/** 密码 */
	private String password;

	/** 昵称 */
	private String nick_name;

	/** 签名 */
	private String signature;

	/** 年龄 */
	private Integer age;

	/** 邮箱地址 */
	private String email;

	/** 电话 */
	private String tel;

	/** 学校 */
	private String school;

	public UserDO() {
	}

	public UserDO(String account) {
		this.account = account;
	}

	/***************************************************************************/
	/*************************** Getter Setter *********************************/
	/***************************************************************************/

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

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
}
