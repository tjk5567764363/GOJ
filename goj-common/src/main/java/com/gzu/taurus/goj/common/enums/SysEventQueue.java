package com.gzu.taurus.goj.common.enums;

/**
 * SysEventQueue
 *
 * @Author tangjunkai
 * @CreateDate 2016年4月13日
 */
public interface SysEventQueue {

	public enum EventType {
		/** 评测 */
		JUDGE(1);

		private Integer value;

		private EventType(Integer value) {
			this.value = value;
		}

		public static EventType getEventType(Integer value) {
			if (value == null) {
				return null;
			}
			for (EventType e : values()) {
				if (value.equals(e.getValue())) {
					return e;
				}
			}
			return null;
		}

		public Integer getValue() {
			return value;
		}

		public void setValue(Integer value) {
			this.value = value;
		}
	}
}
