package com.qjy.open.core.support.jedis;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

public class JedisTemplate {
	private static final Logger logger = LoggerFactory.getLogger(JedisTemplate.class);

	private static ShardedJedisPool shardedJedisPool = null;
	private static Integer EXPIRE = 60 * 60 * 1; // 1小时

	// 获取线程
	private static ShardedJedis getJedis() {
		if (shardedJedisPool == null) {
			synchronized (EXPIRE) {
				if (shardedJedisPool == null) {
					WebApplicationContext wac = ContextLoader.getCurrentWebApplicationContext();
					shardedJedisPool = wac.getBean(ShardedJedisPool.class);
				}
			}
		}
		return shardedJedisPool.getResource();
	}

	public static <K> K run(String key, Executor<K> executor, boolean... expired) {
		ShardedJedis jedis = getJedis();
		if (jedis == null) {
			return null;
		}
		try {
			K result = executor.execute(jedis);
			if (jedis.exists(key) && expired == null) {
				jedis.expire(key, EXPIRE);
			}
			return result;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		} finally {
			if (jedis != null) {
				jedis.close();
			}
		}
		return null;
	}

	public static <K> K run(byte[] key, Executor<K> executor, boolean... expired) {
		ShardedJedis jedis = getJedis();
		if (jedis == null) {
			return null;
		}
		try {
			K result = executor.execute(jedis);
			if (jedis.exists(key) && expired == null) {
				jedis.expire(key, EXPIRE);
			}
			return result;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		} finally {
			if (jedis != null) {
				jedis.close();
			}
		}
		return null;
	}
}
