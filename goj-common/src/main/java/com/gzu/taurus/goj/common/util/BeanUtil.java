package com.gzu.taurus.goj.common.util;

import org.dozer.DozerBeanMapper;

/**
 * BeanUtil
 *
 * @Author tangjunkai
 * @CreateDate 2016年3月31日
 */
public class BeanUtil {

	private static DozerBeanMapper mapper = new DozerBeanMapper();

	/**
	 * 将对象formObject的所有属性值拷贝到对象toObject中.
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年3月31日
	 * @param formObject
	 * @param toObject
	 */
	public static void copy(Object formObject, Object toObject) {
		mapper.map(formObject, toObject);
	}
}
