package com.gzu.taurus.goj.dal.dao.contest;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gzu.taurus.goj.dal.dataobject.contest.ContestProblemDO;

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
