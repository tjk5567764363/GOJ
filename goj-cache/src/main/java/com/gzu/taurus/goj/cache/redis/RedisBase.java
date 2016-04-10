package com.gzu.taurus.goj.cache.redis;

import java.util.Set;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisSentinelPool;

/**
 * RedisBase
 *
 * @Author tangjunkai
 * @CreateDate 2016年4月9日
 */
public class RedisBase {
	private JedisSentinelPool jedisSentinelPool;

	private Jedis jedis;

	public Keys KEYS;

	public Strings STRING;

	public Lists LIST;

	public Sets SET;

	public Hash HASH;

	public SortSet SORTSET;

	class Keys {
	}

	class Strings {
	}

	class Lists {

	}

	class Sets {

	}

	class Hash {
		/**
		 * set
		 *
		 * @Author tangjunkai
		 * @CreateDate 2016年4月10日
		 * @param key
		 * @param field
		 * @param value
		 * @return 该field已存在返回 0，不存在返回 1
		 */
		Long set(String key, String field, String value) {
			return jedis.hset(key, field, value);
		}

		String get(String key, String field) {
			return jedis.hget(key, field);
		}

		Set<String> keys(String key) {
			return jedis.hkeys(key);
		}

		Boolean exist(String key, String field) {
			return jedis.hexists(key, field);
		}

		/**
		 * del
		 *
		 * @Author tangjunkai
		 * @CreateDate 2016年4月10日
		 * @param key
		 * @param fields
		 * @return 删除成功返回 1，否则返回 0
		 */
		Long del(String key, String... fields) {
			return jedis.hdel(key, fields);
		}
	}

	class SortSet {

	}
}
