package com.qjy.open.controller.sys;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.qjy.open.entity.user.User;
import com.qjy.open.service.user.UserService;
import com.qjy.open.core.Constants;
import com.qjy.open.core.util.RedisUtil;

@Controller
@RequestMapping("index")
public class IndexController {
	
	@Autowired
	private UserService userService;
	
	/**
	 * 
	 * @param request
	 * @param reponse
	 * @param map
	 * @return
	 */
	@RequestMapping("/index")
	public String searchDetail(HttpServletRequest request,HttpServletResponse reponse,ModelMap modelMap){
		return "sys/index";
	}
	/**
	 * 
	 * @param request
	 * @param reponse
	 * @param map
	 * @return
	 */
	@RequestMapping("/loginPage")
	public String loginPage(HttpServletRequest request,HttpServletResponse reponse,ModelMap modelMap){
		String userStr="";
		if(request.getSession().getAttribute("userInfo")!=null ){
			userStr=request.getSession().getAttribute("userInfo").toString();			
		}
		if(userStr!=null && !"".equals(userStr)){
			return userCenters(request,reponse,modelMap);
		}else{
			return "sys/loginpage";			
		}
	}
	/**
	 * 
	 * @param request
	 * @param reponse
	 * @param map
	 * @return
	 */
	@RequestMapping("/dologin")
	@ResponseBody
	public String dologin(String userName,String password,HttpServletRequest request,HttpServletResponse reponse,ModelMap modelMap){
		String userStr="";
		if(request.getSession().getAttribute("userInfo")!=null ){
			userStr=request.getSession().getAttribute("userInfo").toString();			
		}
		String resultJson="";
		if(userStr==null || "".equals(userStr)){
//			if(("qjy".equals(userName) && "123".equals(password)) 
//					|| ("my".equals(userName) && "123".equals(password))){
//				user.setUserName(userName);
//				user.setPassword(password);
//				request.getSession().setAttribute("userInfo", JSON.toJSONString(user));
//				resultJson="用户"+userName+"登录成功！";
//			}else{
//				resultJson="用户名或者密码不存在或者错误！";
//			} 
			Map map=new HashMap();
			map.put("start", 0);
			map.put("size", 1);
			map.put("userName", userName);
			map.put("password", password);
			List<User> resultList=userService.selectAllList(map);
			if(resultList!=null && !resultList.isEmpty()){
				//RedisUtil.set("redisTestqjy", 600, "3424234fsdfsd");
				//RedisUtil.setnx("redisTestqjy1111", "3424234fsdfsd");
				request.getSession().setAttribute("userInfo", JSON.toJSONString(resultList.get(0)));
				resultJson="用户"+(resultList.get(0)).getRealName()+"登录成功！";
				setAllUserNumber(1);
			}else{
				
			}
		}else{
			
		}
		return resultJson;
	}
	/**
	 * 
	 * @param request
	 * @param reponse
	 * @param map
	 * @return
	 */
	@RequestMapping("/dologout")
	public String dologout(HttpServletRequest request,HttpServletResponse reponse,ModelMap modelMap){
		if(request.getSession().getAttribute("userInfo")!=null ){
			//request.getSession().invalidate();
			request.getSession().removeAttribute("userInfo");
			setAllUserNumber(-1);			
		}
		String resultJson="您已退出！";
		return loginPage(request,reponse,modelMap);
	}
	/**
	 * 
	 * @param request
	 * @param reponse
	 * @param map
	 * @return
	 */
	@RequestMapping("/userCenters")
	public String userCenters(HttpServletRequest request,HttpServletResponse reponse,ModelMap modelMap){
		String userStr="";
		if(request.getSession().getAttribute("userInfo")!=null ){
			userStr=request.getSession().getAttribute("userInfo").toString();			
			User user=JSON.parseObject(userStr, User.class);
			modelMap.put("userInfo", user);
			
//			Map map=new HashMap();
//			map.put("start", 0);
//			map.put("size", 1);
//			List<User> resultList=userService.selectAllList(map);
			
			return "sys/userDetail";
		}else{
			return loginPage(request,reponse,modelMap);
		}
	}
	private void setAllUserNumber(int n) {
		Long number = getAllUserNumber() + n;
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
