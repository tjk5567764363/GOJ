package com.gzu.taurus.goj.dal.dataobject.problem;

import com.gzu.taurus.goj.dal.dataobject.BaseDO;

/**
 * ProblemDO
 *
 * @Author tangjunkai
 * @CreateDate 2016年3月20日
 */
public class ProblemDO extends BaseDO {
	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

	/** ID */
	private Long id;

	/** 标题 */
	private String title;

	/** 描述 */
	private String description;

	/** 输入描述 */
	private String input;

	/** 输出描述 */
	private String output;

	/** 输入样例 */
	private String sample_input;

	/** 输出样例 */
	private String sample_output;

	/** 来源 */
	private String source;

	/** 创建人 */
	private String manager;

	/** 时间限制 */
	private Long time_limit;

	/** 空间限制 */
	private Long memory_limit;

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

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	public String getSample_input() {
		return sample_input;
	}

	public void setSample_input(String sample_input) {
		this.sample_input = sample_input;
	}

	public String getSample_output() {
		return sample_output;
	}

	public void setSample_output(String sample_output) {
		this.sample_output = sample_output;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public Long getTime_limit() {
		return time_limit;
	}

	public void setTime_limit(Long time_limit) {
		this.time_limit = time_limit;
	}

	public Long getMemory_limit() {
		return memory_limit;
	}

	public void setMemory_limit(Long memory_limit) {
		this.memory_limit = memory_limit;
	}
}
