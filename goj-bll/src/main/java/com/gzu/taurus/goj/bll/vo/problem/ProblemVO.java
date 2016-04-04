package com.gzu.taurus.goj.bll.vo.problem;

import com.gzu.taurus.goj.dal.dataobject.problem.ProblemDO;

/**
 * ProblemVO
 *
 * @Author tangjunkai
 * @CreateDate 2016年3月30日
 */
public class ProblemVO extends ProblemDO {
	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

	/** 是否已解决 */
	private Integer isSolved;

	/** 比赛题目编号 */
	private String contestNo;

	/** AC数 */
	private Integer solved;

	/** 提交数 */
	private Integer submit;

	/***************************************************************************/
	/*************************** Getter Setter *********************************/
	/***************************************************************************/

	public Integer getSolved() {
		return solved;
	}

	public void setSolved(Integer solved) {
		this.solved = solved;
	}

	public Integer getSubmit() {
		return submit;
	}

	public void setSubmit(Integer submit) {
		this.submit = submit;
	}

	public Integer getIsSolved() {
		return isSolved;
	}

	public void setIsSolved(Integer isSolved) {
		this.isSolved = isSolved;
	}

	public String getContestNo() {
		return contestNo;
	}

	public void setContestNo(String contestNo) {
		this.contestNo = contestNo;
	}
}
