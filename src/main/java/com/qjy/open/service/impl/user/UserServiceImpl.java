package com.qjy.open.service.impl.user;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.qjy.open.dao.user.UserMapper;
import com.qjy.open.entity.user.User;
import com.qjy.open.service.user.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	@Override
	@Cacheable("selectAllList")
	public List<User> selectAllList(Map map) {
		return userMapper.selectAllList(map);
	}

}
