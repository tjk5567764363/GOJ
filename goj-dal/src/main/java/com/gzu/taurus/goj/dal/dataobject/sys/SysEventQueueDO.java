package com.gzu.taurus.goj.dal.dataobject.sys;

import com.gzu.taurus.goj.dal.dataobject.BaseDO;

/**
 * SysEventQueueDO
 *
 * @Author tangjunkai
 * @CreateDate 2016年3月29日
 */
public class SysEventQueueDO extends BaseDO {
	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

	/** Id */
	private Long id;

	/** 用户Id */
	private Long user_id;

	/** 事件类型 */
	private String event_type;

	/** json格式存储 */
	private String event_data;

	/** 状态：0：待处理 1：处理中 2：正常处理结束 3：处理出现异常 */
	private int process_status;

	/** 处理次数，每次处理完回写时加1 */
	private int process_cnt;

	/** 处理开始时间 */
	private String process_begin_time;

	/** 处理结束时间 */
	private String process_end_time;

	public SysEventQueueDO() {
		super();
	}

	public SysEventQueueDO(String event_type) {
		super();
		this.event_type = event_type;
	}

	// *************************************************************************//
	// ***************************** 以下为Get/Set方法 **************************//
	// *************************************************************************//

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public String getEvent_type() {
		return event_type;
	}

	public void setEvent_type(String event_type) {
		this.event_type = event_type;
	}

	public String getEvent_data() {
		return event_data;
	}

	public void setEvent_data(String event_data) {
		this.event_data = event_data;
	}

	public int getProcess_status() {
		return process_status;
	}

	public void setProcess_status(int process_status) {
		this.process_status = process_status;
	}

	public int getProcess_cnt() {
		return process_cnt;
	}

	public void setProcess_cnt(int process_cnt) {
		this.process_cnt = process_cnt;
	}

	public String getProcess_begin_time() {
		return process_begin_time;
	}

	public void setProcess_begin_time(String process_begin_time) {
		this.process_begin_time = process_begin_time;
	}

	public String getProcess_end_time() {
		return process_end_time;
	}

	public void setProcess_end_time(String process_end_time) {
		this.process_end_time = process_end_time;
	}
}