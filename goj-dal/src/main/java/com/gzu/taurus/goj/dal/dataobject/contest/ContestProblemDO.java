package com.gzu.taurus.goj.dal.dataobject.contest;

import com.gzu.taurus.goj.dal.dataobject.BaseDO;

/**
 * ContestProblemDO
 *
 * @Author tangjunkai
 * @CreateDate 2016年3月21日
 */
public class ContestProblemDO extends BaseDO {
	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

	/** ID */
	private Long id;

	/** 问题ID */
	private Long problem_id;

	/** 比赛ID */
	private Long contest_id;

	/***************************************************************************/
	/*************************** Getter Setter *********************************/
	/***************************************************************************/

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProblem_id() {
		return problem_id;
	}

	public void setProblem_id(Long problem_id) {
		this.problem_id = problem_id;
	}

	public Long getContest_id() {
		return contest_id;
	}

	public void setContest_id(Long contest_id) {
		this.contest_id = contest_id;
	}
}
