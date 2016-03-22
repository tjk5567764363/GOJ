package com.gzu.taurus.goj.bll.bo.problem.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gzu.taurus.goj.bll.bo.problem.interfaces.SubmitBO;
import com.gzu.taurus.goj.dal.dao.problem.SubmitDAO;
import com.gzu.taurus.goj.dal.dataobject.problem.SubmitDO;

/**
 * SubmitBOImpl
 *
 * @Author tangjunkai
 * @CreateDate 2016年3月22日
 */
@Service
public class SubmitBOImpl implements SubmitBO {
	@Autowired
	private SubmitDAO submitDAO;

	public int createSubmit(SubmitDO submit) {
		// TODO Auto-generated method stub
		return 0;
	}

	public SubmitDO getSubmit(SubmitDO submit) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<SubmitDO> findSubmits(SubmitDO submit) {
		// TODO Auto-generated method stub
		return null;
	}

	public int modifySubmit(SubmitDO submit) {
		// TODO Auto-generated method stub
		return 0;
	}

}
