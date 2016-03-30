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

	/** AC数 */
	private Integer solved;

	/** 提交数 */
	private Integer submit;

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
}
