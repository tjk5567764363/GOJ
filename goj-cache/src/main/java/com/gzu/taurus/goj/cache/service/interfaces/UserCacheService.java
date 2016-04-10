package com.gzu.taurus.goj.cache.service.interfaces;

/**
 * UserCacheService
 *
 * @Author tangjunkai
 * @CreateDate 2016年4月9日
 */
public interface UserCacheService {

	String getUser(Long id);

	void setUser(Long id, String json);
}
