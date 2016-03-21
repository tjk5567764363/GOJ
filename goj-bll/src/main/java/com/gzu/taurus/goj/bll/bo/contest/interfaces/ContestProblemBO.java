package com.gzu.taurus.goj.bll.bo.contest.interfaces;

import java.util.List;

import com.gzu.taurus.goj.dal.dataobject.contest.ContestDO;

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
	Long createContestProblem(ContestDO contest);

	/**
	 * getContestProblem
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年3月22日
	 * @param contest
	 * @return
	 */
	ContestDO getContestProblem(ContestDO contest);

	/**
	 * findContestProblems
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年3月22日
	 * @param contest
	 * @return
	 */
	List<ContestDO> findContestProblems(ContestDO contest);

	/**
	 * modifyContestProblem
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年3月22日
	 * @param contest
	 * @return
	 */
	int modifyContestProblem(ContestDO contest);
}
