package com.gzu.taurus.goj.bll.bo.contest.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gzu.taurus.goj.bll.bo.contest.interfaces.ContestBO;
import com.gzu.taurus.goj.common.util.AssertUtil;
import com.gzu.taurus.goj.dal.dao.contest.ContestDAO;
import com.gzu.taurus.goj.dal.dataobject.contest.ContestDO;

/**
 * ContestBOImpl
 *
 * @Author tangjunkai
 * @CreateDate 2016年3月22日
 */
@Service
@Transactional
public class ContestBOImpl implements ContestBO {
	@Autowired
	private ContestDAO contestDAO;

	public Long createContest(ContestDO contest) {
		AssertUtil.notNull(contest);

		return null;
	}

	@Transactional(readOnly = true)
	public ContestDO getContest(ContestDO contest) {
		AssertUtil.notNull(contest);

		return contestDAO.getContest(contest);
	}

	@Transactional(readOnly = true)
	public List<ContestDO> findContests(ContestDO contest) {
		AssertUtil.notNull(contest);

		return contestDAO.findContests(contest);
	}

	public int modifyContest(ContestDO contest) {
		AssertUtil.notNull(contest);

		return contestDAO.modifyContest(contest);
	}

}
