package com.qjy.open.service.user;

import java.util.List;
import java.util.Map;

import com.qjy.open.entity.user.User;


public interface UserService {

	List<User> selectAllList(Map map);
}
