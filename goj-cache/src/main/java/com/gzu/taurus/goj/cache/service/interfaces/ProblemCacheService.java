package com.gzu.taurus.goj.cache.service.interfaces;

/**
 * ProblemCacheService
 *
 * @Author tangjunkai
 * @CreateDate 2016年4月9日
 */
public interface ProblemCacheService {

	String getProblem(Long id);

	void setProblem(Long id, String json);
}
