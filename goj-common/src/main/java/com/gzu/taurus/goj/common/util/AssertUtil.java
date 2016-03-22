package com.gzu.taurus.goj.common.util;

import org.springframework.util.Assert;

/**
 * AssertUtil
 *
 * @Author tangjunkai
 * @CreateDate 2016年3月22日
 */
public class AssertUtil {

	public static void notNull(Object o) {
		Assert.notNull(o, "[" + o.getClass().getSimpleName() + "]不能为空.");
	}

}
