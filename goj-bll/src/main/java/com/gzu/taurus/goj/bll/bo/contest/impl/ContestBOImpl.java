package com.gzu.taurus.goj.bll.bo.contest.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gzu.taurus.goj.bll.bo.contest.interfaces.ContestBO;
import com.gzu.taurus.goj.dal.dao.contest.ContestDAO;
import com.gzu.taurus.goj.dal.dataobject.contest.ContestDO;

/**
 * ContestBOImpl
 *
 * @Author tangjunkai
 * @CreateDate 2016年3月22日
 */
@Service
public class ContestBOImpl implements ContestBO {
	@Autowired
	private ContestDAO contestDAO;

	public Long createContest(ContestDO contest) {
		// TODO Auto-generated method stub
		return null;
	}

	public ContestDO getContest(ContestDO contest) {

		return null;
	}

	public List<ContestDO> findContests(ContestDO contest) {
		// TODO Auto-generated method stub
		return null;
	}

	public int modifyContest(ContestDO contest) {
		// TODO Auto-generated method stub
		return 0;
	}

}
