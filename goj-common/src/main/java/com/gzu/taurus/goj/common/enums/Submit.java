package com.gzu.taurus.goj.common.enums;

/**
 * Submit
 *
 * @Author tangjunkai
 * @CreateDate 2016年3月30日
 */
public interface Submit {
	/**
	 * 提交语言
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年3月30日
	 */
	public enum Language {
		/** C */
		C(1),

		/** C++ */
		CC(2),

		/** JAVA */
		JAVA(3);

		private Integer value;

		private Language(Integer value) {
			this.value = value;
		}

		public Integer getValue() {
			return value;
		}

		public void setValue(Integer value) {
			this.value = value;
		}
	}

	/**
	 * 判定结果
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年3月30日
	 */
	public enum Verdict {
		Wrong_Answer(0),

		Accepted(1),

		Queuing(2),

		Compile_Error(3),

		Time_Limit_Exceeded(4),

		Presentation_Error(5),

		Memory_Limit_Exceeded(6),

		Output_Limit_Exceeded(7),

		Non_Zero_Exit_Code(8),

		Out_Of_Contest_Time(9),

		No_Such_Problem(10),

		Segmentation_Fault(11),

		Floating_Point_Error(12),

		Runtime_Error(13),

		System_Error(99);

		Integer value;

		private Verdict(Integer value) {
			this.value = value;
		}

		public Integer getValue() {
			return value;
		}

		public void setValue(Integer value) {
			this.value = value;
		}
	}

	/**
	 * 提交类型
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年4月4日
	 */
	public enum Type {
		/** 非比赛提交 */
		NO_CONTEST(1),

		/** 比赛提交 */
		CONTEST(2);

		Integer value;

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
