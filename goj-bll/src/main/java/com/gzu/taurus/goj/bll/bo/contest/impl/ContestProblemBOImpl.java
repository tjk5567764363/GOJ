package com.gzu.taurus.goj.bll.bo.contest.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gzu.taurus.goj.bll.bo.contest.interfaces.ContestProblemBO;
import com.gzu.taurus.goj.dal.dao.contest.ContestDAO;
import com.gzu.taurus.goj.dal.dataobject.contest.ContestDO;

/**
 * ContestProblemBOImpl
 *
 * @Author tangjunkai
 * @CreateDate 2016年3月22日
 */
@Service
public class ContestProblemBOImpl implements ContestProblemBO {
	@Autowired
	private ContestDAO contestDAO;

	public Long createContestProblem(ContestDO contest) {
		// TODO Auto-generated method stub
		return null;
	}

	public ContestDO getContestProblem(ContestDO contest) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ContestDO> findContestProblems(ContestDO contest) {
		// TODO Auto-generated method stub
		return null;
	}

	public int modifyContestProblem(ContestDO contest) {
		// TODO Auto-generated method stub
		return 0;
	}
}
