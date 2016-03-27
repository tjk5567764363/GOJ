package com.gzu.taurus.goj.common.util;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMethod;

/**
 * UrlUtil
 *
 * @Author tangjunkai
 * @CreateDate 2016年3月28日
 */
public class UrlUtil {

	/**
	 * getUrlContent
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年3月28日
	 * @param url
	 * @param params
	 * @param method
	 * @return
	 */
	public static String getUrlContent(String url, Map<String, String> params, RequestMethod method) {
		switch (method) {
		case GET:
			return getUrlContent(url);
		case POST:
			return getUrlContent(url, params);
		default:
			return null;
		}
	}

	/**
	 * getUrlContent
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年3月28日
	 * @param url
	 * @return
	 */
	public static String getUrlContent(String url) {
		return "";
	}

	/**
	 * getUrlContent
	 *
	 * @Author tangjunkai
	 * @CreateDate 2016年3月28日
	 * @param url
	 * @param params
	 * @return
	 */
	public static String getUrlContent(String url, Map<String, String> params) {
		return "";
	}
}
