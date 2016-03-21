package com.gzu.taurus.goj.bll.bo.problem.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gzu.taurus.goj.bll.bo.problem.interfaces.ProblemBO;
import com.gzu.taurus.goj.dal.dao.problem.ProblemDAO;
import com.gzu.taurus.goj.dal.dataobject.problem.ProblemDO;

/**
 * ProblemBOImpl
 *
 * @Author tangjunkai
 * @CreateDate 2016年3月22日
 */
@Service
public class ProblemBOImpl implements ProblemBO {
	@Autowired
	private ProblemDAO problemDAO;

	public Long createProblem(ProblemDO problem) {
		// TODO Auto-generated method stub
		return null;
	}

	public ProblemDO getProblem(ProblemDO problem) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ProblemDO> findProblems(ProblemDO problem) {
		// TODO Auto-generated method stub
		return null;
	}

	public int modifyProblem(ProblemDO problem) {
		// TODO Auto-generated method stub
		return 0;
	}

}
