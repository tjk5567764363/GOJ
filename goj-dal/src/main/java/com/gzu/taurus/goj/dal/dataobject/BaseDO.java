package com.gzu.taurus.goj.dal.dataobject;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

/**
 * BaseDO
 *
 * @Author tangjunkai
 * @CreateDate 2016年3月20日
 */
public class BaseDO implements Serializable, Cloneable {
	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

	/** 每页最大显示的记录数大小: 20000条 */
	public static final int MAX_PAGE_SIZE = 20000;

	/** 每页默认显示的记录数大小: 60条 */
	private static final int DEFAULT_PAGE_SIZE = 60;

	private int start_row;

	private int page_size;

	private Date begin_date;

	private Date end_date;

	private List<Integer> statusList;

	private int status;

	/** 创建时间 */
	private Date create_time;

	/** 更新时间 */
	private Date update_time;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	/***************************************************************************/
	/*************************** Getter Setter *********************************/
	/***************************************************************************/

	public int getStart_row() {
		if (start_row < 0)
			start_row = 0;

		return start_row;
	}

	public void setStart_row(int start_row) {
		this.start_row = start_row;
	}

	public int getPage_size() {
		if (page_size <= 0)
			page_size = DEFAULT_PAGE_SIZE;
		if (page_size > MAX_PAGE_SIZE)
			page_size = MAX_PAGE_SIZE;

		return page_size;
	}

	public void setPage_size(int page_size) {
		this.page_size = page_size;
	}

	public List<Integer> getStatusList() {
		return statusList;
	}

	public void setStatusList(List<Integer> statusList) {
		this.statusList = statusList;
	}

	public Date getBegin_date() {
		return begin_date;
	}

	public void setBegin_date(Date begin_date) {
		this.begin_date = begin_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}
}
