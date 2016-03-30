package com.gzu.taurus.goj.bll.bo.contest.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gzu.taurus.goj.bll.bo.contest.interfaces.ContestProblemBO;
import com.gzu.taurus.goj.common.util.AssertUtil;
import com.gzu.taurus.goj.dal.dao.contest.ContestProblemDAO;
import com.gzu.taurus.goj.dal.dataobject.contest.ContestProblemDO;

/**
 * ContestProblemBOImpl
 *
 * @Author tangjunkai
 * @CreateDate 2016年3月22日
 */
@Service
@Transactional
public class ContestProblemBOImpl implements ContestProblemBO {
	@Autowired
	private ContestProblemDAO contestProblemDAO;

	public Long createContestProblem(ContestProblemDO contestProblem) {
		AssertUtil.notNull(contestProblem);

		return null;
	}

	@Transactional(readOnly = true)
	public ContestProblemDO getContestProblem(ContestProblemDO contestProblem) {
		AssertUtil.notNull(contestProblem);

		return contestProblemDAO.getContestProblem(contestProblem);
	}

	@Transactional(readOnly = true)
	public List<ContestProblemDO> findContestProblems(ContestProblemDO contestProblem) {
		AssertUtil.notNull(contestProblem);

		return contestProblemDAO.findContestProblems(contestProblem);
	}

	public int modifyContestProblem(ContestProblemDO contestProblem) {
		AssertUtil.notNull(contestProblem);

		return contestProblemDAO.modifyContestProblem(contestProblem);
	}
}
