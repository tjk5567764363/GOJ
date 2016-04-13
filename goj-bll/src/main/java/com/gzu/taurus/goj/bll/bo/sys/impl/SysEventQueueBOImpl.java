package com.gzu.taurus.goj.bll.bo.sys.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gzu.taurus.goj.bll.bo.sys.interfaces.SysEventQueueBO;
import com.gzu.taurus.goj.common.enums.Status;
import com.gzu.taurus.goj.common.util.AssertUtil;
import com.gzu.taurus.goj.dal.dao.sys.SysEventQueueDAO;
import com.gzu.taurus.goj.dal.dataobject.sys.SysEventQueueDO;

/**
 * SysEventQueueBOImpl
 *
 * @Author tangjunkai
 * @CreateDate 2016年4月13日
 */
@Service
public class SysEventQueueBOImpl implements SysEventQueueBO {
	@Autowired
	private SysEventQueueDAO sysEventQueueDAO;

	public long createSysEventQueue(SysEventQueueDO eventQueue) {
		AssertUtil.notNull(eventQueue);

		eventQueue.setProcess_cnt(0);
		eventQueue.setStatus(Status.NOMARL.getValue());
		sysEventQueueDAO.createSysEventQueue(eventQueue);
		return 0;
	}

	public SysEventQueueDO getSysEventQueue(SysEventQueueDO eventQueue) {
		AssertUtil.notNull(eventQueue);

		return sysEventQueueDAO.getSysEventQueue(eventQueue);
	}

	public List<SysEventQueueDO> findSysEventQueues(SysEventQueueDO eventQueue) {
		AssertUtil.notNull(eventQueue);

		return sysEventQueueDAO.findSysEventQueues(eventQueue);
	}

	public int modifySysEventQueue(SysEventQueueDO eventQueue) {
		AssertUtil.notNull(eventQueue);

		return sysEventQueueDAO.modifySysEventQueue(eventQueue);
	}
}