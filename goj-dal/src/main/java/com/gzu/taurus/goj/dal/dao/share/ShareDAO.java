package com.gzu.taurus.goj.dal.dao.share;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gzu.taurus.goj.dal.dataobject.share.ShareDO;

/**
 * ShareDAO
 *
 * @Author tangjunkai
 * @CreateDate 2016年4月7日
 */
@Repository
public interface ShareDAO {
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
