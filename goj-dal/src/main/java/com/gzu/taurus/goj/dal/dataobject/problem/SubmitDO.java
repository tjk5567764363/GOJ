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

	/** 判定结果 {@link com.gzu.taurus.goj.common.enums.Submit.Verdict} */
	private Integer verdict;

	/** 用时 */
	private Long time;

	/** 使用空间大小 */
	private Long memory;

	/** 提交语言 {@link com.gzu.taurus.goj.common.enums.Submit.Language} */
	private Integer language;

	/** 代码长度 */
	private Integer length;

	public SubmitDO() {
	}

	public SubmitDO(Long id) {
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

	public Integer getVerdict() {
		return verdict;
	}

	public void setVerdict(Integer verdict) {
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

	public Integer getLanguage() {
		return language;
	}

	public void setLanguage(Integer language) {
		this.language = language;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public String getSource_code() {
		return source_code;
	}

	public void setSource_code(String source_code) {
		this.source_code = source_code;
	}
}
