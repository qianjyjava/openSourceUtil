package com.qjy.open.core.listener;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import com.qjy.open.core.Constants;
import com.qjy.open.core.util.RedisUtil;

/**
 * 会话监听器
 */
public class SessionListener implements HttpSessionListener {
	private Logger logger = LogManager.getLogger(SessionListener.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.servlet.http.HttpSessionListener#sessionCreated(javax.servlet.http
	 * .HttpSessionEvent)
	 */
	public void sessionCreated(HttpSessionEvent event) {
		HttpSession session = event.getSession();
		session.setAttribute(Constants.WEBTHEME, "default");
		logger.info("创建了一个Session连接:[" + session.getId() + "]");
		setAllUserNumber(1);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.servlet.http.HttpSessionListener#sessionDestroyed(javax.servlet
	 * .http.HttpSessionEvent)
	 */
	public void sessionDestroyed(HttpSessionEvent event) {
		HttpSession session = event.getSession();
		logger.info("销毁了一个Session连接:[" + session.getId() + "]");
		session.removeAttribute(Constants.CURRENT_USER);
		setAllUserNumber(-1);
	}

	private void setAllUserNumber(int n) {
		Long number = getAllUserNumber() + n;
		logger.info("用户数：" + number);
		RedisUtil.set(Constants.ALLUSER_NUMBER, 60 * 60 * 24, number);
	}

	/** 获取在线用户数量 */
	public static Long getAllUserNumber() {
		String v = RedisUtil.get(Constants.ALLUSER_NUMBER);
		if (v != null) {
			return Long.valueOf(v);
		}
		return 0L;
	}
}
