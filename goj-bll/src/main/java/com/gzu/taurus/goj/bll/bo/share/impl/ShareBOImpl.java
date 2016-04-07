package com.gzu.taurus.goj.bll.bo.share.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import com.gzu.taurus.goj.bll.bo.share.interfaces.ShareBO;
import com.gzu.taurus.goj.common.enums.Status;
import com.gzu.taurus.goj.common.util.AssertUtil;
import com.gzu.taurus.goj.dal.dao.share.ShareDAO;
import com.gzu.taurus.goj.dal.dataobject.share.ShareDO;

/**
 * ShareBOImpl
 *
 * @Author tangjunkai
 * @CreateDate 2016年4月7日
 */
@Service
@Transactional
public class ShareBOImpl implements ShareBO {
	@Autowired
	private ShareDAO shareDAO;

	public long createShare(ShareDO share) {
		AssertUtil.notNull(share);
		Assert.notNull(share.getUser_id(), "用户Id不能为空.");
		Assert.notNull(share.getTitle(), "标题不能为空.");
		Assert.notNull(share.getSyntax(), "语法不能为空.");
		Assert.notNull(share.getTheme(), "主题不能为空.");
		Assert.notNull(share.getContent(), "内容不能为空.");

		share.setStatus(Status.NOMARL.getValue());
		shareDAO.createShare(share);

		return share.getId();
	}

	@Transactional(readOnly = true)
	public ShareDO getShare(ShareDO share) {
		AssertUtil.notNull(share);

		return shareDAO.getShare(share);
	}

	@Transactional(readOnly = true)
	public ShareDO getShareCount(ShareDO share) {
		AssertUtil.notNull(share);

		return shareDAO.getShareCount(share);
	}

	@Transactional(readOnly = true)
	public List<ShareDO> findShares(ShareDO share) {
		AssertUtil.notNull(share);

		return shareDAO.findShares(share);
	}

	public int modifyShare(ShareDO share) {
		AssertUtil.notNull(share);

		return shareDAO.modifyShare(share);
	}

}
