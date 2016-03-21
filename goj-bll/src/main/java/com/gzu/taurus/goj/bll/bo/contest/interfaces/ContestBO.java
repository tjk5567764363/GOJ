package com.gzu.taurus.goj.bll.bo.contest.interfaces;

import java.util.List;

import com.gzu.taurus.goj.dal.dataobject.contest.ContestDO;

/**
 * ContestBO
 *
 * @Author tangjunkai
 * @CreateDate 2016年3月22日
 */
public interface ContestBO {
	/**
	 * createContest
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年3月22日
	 * @param contest
	 * @return
	 */
	Long createContest(ContestDO contest);

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
