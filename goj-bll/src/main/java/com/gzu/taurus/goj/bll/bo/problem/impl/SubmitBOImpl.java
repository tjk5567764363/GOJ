package com.gzu.taurus.goj.bll.bo.problem.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gzu.taurus.goj.bll.bo.problem.interfaces.SubmitBO;
import com.gzu.taurus.goj.common.enums.Status;
import com.gzu.taurus.goj.common.enums.Submit.Verdict;
import com.gzu.taurus.goj.common.util.AssertUtil;
import com.gzu.taurus.goj.dal.dao.problem.SubmitDAO;
import com.gzu.taurus.goj.dal.dataobject.problem.SubmitDO;

/**
 * SubmitBOImpl
 *
 * @Author tangjunkai
 * @CreateDate 2016年3月22日
 */
@Service
@Transactional
public class SubmitBOImpl implements SubmitBO {
	@Autowired
	private SubmitDAO submitDAO;

	public Long createSubmit(SubmitDO submit) {
		AssertUtil.notNull(submit);

		submit.setVerdict(Verdict.Queuing.getValue());
		submit.setStatus(Status.NOMARL.getValue());

		return submitDAO.createSubmit(submit);
	}

	@Transactional(readOnly = true)
	public SubmitDO getSubmit(SubmitDO submit) {
		AssertUtil.notNull(submit);

		return submitDAO.getSubmit(submit);
	}

	@Transactional(readOnly = true)
	public List<SubmitDO> findSubmits(SubmitDO submit) {
		AssertUtil.notNull(submit);

		return submitDAO.findSubmits(submit);
	}

	public int modifySubmit(SubmitDO submit) {
		AssertUtil.notNull(submit);

		return submitDAO.modifySubmit(submit);
	}

	public int modifySubmitVerdict(Long submitId, Verdict verdict) {
		SubmitDO submitTemp = new SubmitDO();
		submitTemp.setId(submitId);
		submitTemp.setVerdict(verdict.getValue());

		return modifySubmit(submitTemp);
	}
}
