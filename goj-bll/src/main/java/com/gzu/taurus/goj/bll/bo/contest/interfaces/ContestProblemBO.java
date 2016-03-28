package com.gzu.taurus.goj.bll.bo.contest.interfaces;

import java.util.List;

import com.gzu.taurus.goj.dal.dataobject.contest.ContestProblemDO;

/**
 * ContestProblemBO
 *
 * @Author tangjunkai
 * @CreateDate 2016年3月22日
 */
public interface ContestProblemBO {
	/**
	 * createContestProblem
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年3月22日
	 * @param contest
	 * @return
	 */
	Long createContestProblem(ContestProblemDO contestProblem);

	/**
	 * getContestProblem
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年3月22日
	 * @param contest
	 * @return
	 */
	ContestProblemDO getContestProblem(ContestProblemDO contestProblem);

	/**
	 * findContestProblems
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年3月22日
	 * @param contest
	 * @return
	 */
	List<ContestProblemDO> findContestProblems(ContestProblemDO contestProblem);

	/**
	 * modifyContestProblem
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年3月22日
	 * @param contest
	 * @return
	 */
	int modifyContestProblem(ContestProblemDO contestProblem);
}
