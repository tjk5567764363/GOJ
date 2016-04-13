package com.gzu.taurus.goj.bll.bo.sys.interfaces;

import java.util.List;

import com.gzu.taurus.goj.dal.dataobject.sys.SysEventQueueDO;

/**
 * SysEventQueueBO
 *
 * @Author tangjunkai
 * @CreateDate 2016年4月13日
 */
public interface SysEventQueueBO {
	/**
	 * createSysEventQueue
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年3月29日
	 * @param eventQueue
	 * @return
	 */
	long createSysEventQueue(SysEventQueueDO eventQueue);

	/**
	 * getSysEventQueue
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年3月29日
	 * @param eventQueue
	 * @return
	 */
	SysEventQueueDO getSysEventQueue(SysEventQueueDO eventQueue);

	/**
	 * findSysEventQueues
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年3月29日
	 * @param eventQueue
	 * @return
	 */
	List<SysEventQueueDO> findSysEventQueues(SysEventQueueDO eventQueue);

	/**
	 * modifySysEventQueue
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年3月29日
	 * @param eventQueue
	 * @return
	 */
	int modifySysEventQueue(SysEventQueueDO eventQueue);
}