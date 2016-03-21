package com.gzu.taurus.goj.dal.dao.problem;

import java.util.List;

import com.gzu.taurus.goj.dal.dataobject.problem.ProblemDO;

/**
 * ProblemDAO
 *
 * @Author tangjunkai
 * @CreateDate 2016年3月20日
 */
public interface ProblemDAO {
	/**
	 * createProblem
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年3月22日
	 * @param problem
	 * @return
	 */
	int createProblem(ProblemDO problem);

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
