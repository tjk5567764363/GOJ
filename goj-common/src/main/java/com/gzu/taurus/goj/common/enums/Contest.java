package com.gzu.taurus.goj.common.enums;

/**
 * Contest
 *
 * @Author tangjunkai
 * @CreateDate 2016年3月29日
 */
public interface Contest {
	/**
	 * Type
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年3月29日
	 */
	public enum Type {
		/** 私有 */
		PRIVATE(1),

		/** 公有 */
		PUBLIC(2);

		private Integer value;

		private Type(Integer value) {
			this.value = value;
		}

		public Integer getValue() {
			return value;
		}

		public void setValue(Integer value) {
			this.value = value;
		}
	}
}
