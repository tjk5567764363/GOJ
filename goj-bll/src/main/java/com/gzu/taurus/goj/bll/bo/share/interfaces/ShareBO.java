package com.gzu.taurus.goj.bll.bo.share.interfaces;

import java.util.List;

import com.gzu.taurus.goj.dal.dataobject.share.ShareDO;

/**
 * ShareBO
 *
 * @Author tangjunkai
 * @CreateDate 2016年4月7日
 */
public interface ShareBO {
	/**
	 * createShare
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年4月7日
	 * @param share
	 * @return
	 */
	long createShare(ShareDO share);

	/**
	 * getShare
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年4月7日
	 * @param share
	 * @return
	 */
	ShareDO getShare(ShareDO share);

	/**
	 * getShareCount
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年4月7日
	 * @param share
	 * @return
	 */
	ShareDO getShareCount(ShareDO share);

	/**
	 * findShares
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年4月7日
	 * @param share
	 * @return
	 */
	List<ShareDO> findShares(ShareDO share);

	/**
	 * modifyShare
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年4月7日
	 * @param share
	 * @return
	 */
	int modifyShare(ShareDO share);
}
