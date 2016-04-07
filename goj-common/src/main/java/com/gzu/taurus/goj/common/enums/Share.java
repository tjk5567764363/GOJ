package com.gzu.taurus.goj.common.enums;

/**
 * Share
 *
 * @Author tangjunkai
 * @CreateDate 2016年4月7日
 */
public interface Share {

	public enum Theme {
		Default(0),

		Eclipse(1),

		Midnight(2);

		private Integer value;

		private Theme(Integer value) {
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
