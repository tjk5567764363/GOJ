package com.gzu.taurus.goj.bll.bo.problem.interfaces;

import java.util.List;

import com.gzu.taurus.goj.dal.dataobject.problem.SubmitDO;

/**
 * SubmitBO
 *
 * @Author tangjunkai
 * @CreateDate 2016年3月22日
 */
public interface SubmitBO {
	/**
	 * createSubmit
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年3月22日
	 * @param submit
	 * @return
	 */
	int createSubmit(SubmitDO submit);

	/**
	 * getSubmit
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年3月22日
	 * @param submit
	 * @return
	 */
	SubmitDO getSubmit(SubmitDO submit);

	/**
	 * findSubmits
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年3月22日
	 * @param submit
	 * @return
	 */
	List<SubmitDO> findSubmits(SubmitDO submit);

	/**
	 * modifySubmit
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年3月22日
	 * @param submit
	 * @return
	 */
	int modifySubmit(SubmitDO submit);
}