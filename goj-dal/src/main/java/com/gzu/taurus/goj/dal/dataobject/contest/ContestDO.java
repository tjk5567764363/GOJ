package com.gzu.taurus.goj.dal.dataobject.contest;

import java.util.Date;

import com.gzu.taurus.goj.dal.dataobject.BaseDO;

/**
 * ContestDO
 *
 * @Author tangjunkai
 * @CreateDate 2016年3月21日
 */
public class ContestDO extends BaseDO {
	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

	/** ID */
	private Long id;

	/** 标题 */
	private String title;

	/** 描述 */
	private String description;

	/** 公告 */
	private String announcement;

	/** 密码 */
	private String password;

	/** 时长 */
	private Long duration;

	/** 类型 {@link com.gzu.taurus.goj.common.enums.Contest.Type} */
	private Integer type;

	/** 管理员 */
	private String manager;

	/** 开始时间 */
	private Date start_time;

	public ContestDO() {
	}

	public ContestDO(Long id) {
		this.id = id;
	}

	/***************************************************************************/
	/*************************** Getter Setter *********************************/
	/***************************************************************************/

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAnnouncement() {
		return announcement;
	}

	public void setAnnouncement(String announcement) {
		this.announcement = announcement;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getDuration() {
		return duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		type = type;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public Date getStart_time() {
		return start_time;
	}

	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	}
}
