package com.gzu.taurus.goj.common.enums;

/**
 * Status
 *
 * @Author tangjunkai
 * @CreateDate 2016年3月28日
 */
public enum Status {
	/** 正常 */
	NOMARL(1),

	/** 删除 */
	DELETE(0);

	private Integer value;

	private Status(Integer value) {
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
}
