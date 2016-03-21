package com.gzu.taurus.goj.dal.dao.contest;

import java.util.List;

import com.gzu.taurus.goj.dal.dataobject.contest.ContestDO;

/**
 * ContestDAO
 *
 * @Author tangjunkai
 * @CreateDate 2016年3月22日
 */
public interface ContestDAO {
	/**
	 * createContest
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年3月22日
	 * @param contest
	 * @return
	 */
	int createContest(ContestDO contest);

	/**
	 * getContest
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年3月22日
	 * @param contest
	 * @return
	 */
	ContestDO getContest(ContestDO contest);

	/**
	 * findContests
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年3月22日
	 * @param contest
	 * @return
	 */
	List<ContestDO> findContests(ContestDO contest);

	/**
	 * modifyContest
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年3月22日
	 * @param contest
	 * @return
	 */
	int modifyContest(ContestDO contest);
}
