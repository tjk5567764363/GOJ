package com.gzu.taurus.goj.dal.dao.problem;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gzu.taurus.goj.dal.dataobject.problem.SubmitDO;

/**
 * SubmitDAO
 *
 * @Author tangjunkai
 * @CreateDate 2016年3月22日
 */
@Repository
public interface SubmitDAO {
	/**
	 * createSubmit
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年3月22日
	 * @param submit
	 * @return
	 */
	Long createSubmit(SubmitDO submit);

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
	 * getSubmitCount
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年3月31日
	 * @param submit
	 * @return
	 */
	int getSubmitCount(SubmitDO submit);

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
