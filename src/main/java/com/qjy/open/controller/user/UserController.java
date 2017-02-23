package com.qjy.open.controller.user;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qjy.open.entity.user.User;
import com.qjy.open.service.user.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	/**
	 * 
	 * @param request
	 * @param reponse
	 * @param map
	 * @return
	 */
	@RequestMapping("/detail")
	public String searchDetail(HttpServletRequest request,HttpServletResponse reponse,ModelMap modelMap){
		Map map=new HashMap();
		map.put("start", 0);
		map.put("size", 1);
		map.put("id", 1);
		List<User> resultList=userService.selectAllList(map);
		if(resultList==null || resultList.isEmpty()){
			return "error";
		}
		for(int i=0;i<resultList.size();i++){
			User user=resultList.get(i);
			modelMap.put("user", user);
		}
		return "user/userDetail";
	}
}
