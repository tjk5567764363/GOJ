package com.gzu.taurus.goj.dal.dataobject.problem;

import com.gzu.taurus.goj.dal.dataobject.BaseDO;

/**
 * SubmitDO
 *
 * @Author tangjunkai
 * @CreateDate 2016年3月20日
 */
public class SubmitDO extends BaseDO {
	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

	/** ID */
	private Long id;

	/** 用户ID */
	private Long user_id;

	/** 问题ID */
	private Long problem_id;

	/** 源代码 */
	private String source_code;

	/** 判定结果 */
	private String verdict;

	/** 用时 */
	private Long time;

	/** 使用空间大小 */
	private Long memory;

	/** 提交语言 */
	private String language;

	/** 代码长度 */
	private Long length;

	/***************************************************************************/
	/*************************** Getter Setter *********************************/
	/***************************************************************************/

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

	public Long getProblem_id() {
		return problem_id;
	}

	public void setProblem_id(Long problem_id) {
		this.problem_id = problem_id;
	}

	public String getVerdict() {
		return verdict;
	}

	public void setVerdict(String verdict) {
		this.verdict = verdict;
	}

	public Long getTime() {
		return time;
	}

	public void setTime(Long time) {
		this.time = time;
	}

	public Long getMemory() {
		return memory;
	}

	public void setMemory(Long memory) {
		this.memory = memory;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Long getLength() {
		return length;
	}

	public void setLength(Long length) {
		this.length = length;
	}

	public String getSource_code() {
		return source_code;
	}

	public void setSource_code(String source_code) {
		this.source_code = source_code;
	}
}
