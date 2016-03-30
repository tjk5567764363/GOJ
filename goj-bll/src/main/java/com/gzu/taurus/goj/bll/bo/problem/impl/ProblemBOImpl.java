package com.gzu.taurus.goj.bll.bo.problem.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import com.gzu.taurus.goj.bll.bo.problem.interfaces.ProblemBO;
import com.gzu.taurus.goj.common.util.AssertUtil;
import com.gzu.taurus.goj.dal.dao.problem.ProblemDAO;
import com.gzu.taurus.goj.dal.dataobject.problem.ProblemDO;

/**
 * ProblemBOImpl
 *
 * @Author tangjunkai
 * @CreateDate 2016年3月22日
 */
@Service
@Transactional
public class ProblemBOImpl implements ProblemBO {
	@Autowired
	private ProblemDAO problemDAO;

	public Long createProblem(ProblemDO problem) {
		AssertUtil.notNull(problem);
		return null;
	}

	@Transactional(readOnly = true)
	public ProblemDO getProblem(ProblemDO problem) {
		AssertUtil.notNull(problem);
		Assert.notNull(problem.getId(), "Id不能为空.");

		return problemDAO.getProblem(problem);
	}

	@Transactional(readOnly = true)
	public List<ProblemDO> findProblems(ProblemDO problem) {
		AssertUtil.notNull(problem);

		return problemDAO.findProblems(problem);
	}

	public int modifyProblem(ProblemDO problem) {
		AssertUtil.notNull(problem);

		return problemDAO.modifyProblem(problem);
	}

}
