package com.gzu.taurus.goj.bll.bo.problem.interfaces;

import java.util.List;

import com.gzu.taurus.goj.dal.dataobject.problem.ProblemDO;

/**
 * ProblemBO
 *
 * @Author tangjunkai
 * @CreateDate 2016年3月22日
 */
public interface ProblemBO {
	/**
	 * createProblem
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年3月22日
	 * @param problem
	 * @return
	 */
	Long createProblem(ProblemDO problem);

	/**
	 * getProblem
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年3月22日
	 * @param problem
	 * @return
	 */
	ProblemDO getProblem(ProblemDO problem);

	/**
	 * findProblems
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年3月22日
	 * @param problem
	 * @return
	 */
	List<ProblemDO> findProblems(ProblemDO problem);

	/**
	 * modifyProblem
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年3月22日
	 * @param problem
	 * @return
	 */
	int modifyProblem(ProblemDO problem);
}
