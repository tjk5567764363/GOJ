package com.gzu.taurus.goj.dal.dao.contest;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gzu.taurus.goj.dal.dataobject.contest.ContestDO;

/**
 * ContestProblemDAO
 *
 * @Author tangjunkai
 * @CreateDate 2016年3月22日
 */
@Repository
public interface ContestProblemDAO {
	/**
	 * createContestProblem
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年3月22日
	 * @param contest
	 * @return
	 */
	int createContestProblem(ContestDO contest);

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
