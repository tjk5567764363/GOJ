package com.gzu.taurus.goj.dal.dao.sys;

import java.util.List;

import com.gzu.taurus.goj.dal.dataobject.sys.SysEventQueueDO;

/**
 * SysEventQueueDAO
 *
 * @Author tangjunkai
 * @CreateDate 2016年3月29日
 */
public interface SysEventQueueDAO {
	/**
	 * createSysEventQueue
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年3月29日
	 * @param eventQueue
	 * @return
	 */
	int createSysEventQueue(SysEventQueueDO eventQueue);

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