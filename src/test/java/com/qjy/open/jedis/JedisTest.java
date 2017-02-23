package com.qjy.open.jedis;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.qjy.open.core.util.RedisUtil;

@ComponentScan
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/spring-context.xml" })
public class JedisTest {
	@Test
	public void test1(){
		try {
//			RedisUtil.set("redisTestqjy", 0, "3424234fsdfsd");
//			RedisUtil.setnx("redisTestqjy1111", "3424234fsdfsd");
			Map ddd=new HashMap();
			ddd.put("1", "youxiao");
			Map dddd=new HashMap();
			dddd.put("1", ddd);
			RedisUtil.set("terwerwr", 24*60*60, dddd);
			//JedisUtils.set("redisTest", "413j23j5k345jk", 0);			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
