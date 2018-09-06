package com.jym.microservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jym.bean.User;
import com.jym.dao.UserDao;

@Controller
public class CommonController {
	private static Logger log = LoggerFactory.getLogger(CommonController.class);
	
	@Autowired
	private UserDao userDao;
	
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
	//登录页
	@RequestMapping("/login")
	public String login(){
		return "login";
	}
	//登录动作
	@RequestMapping("/logon")
	public String logon(@RequestBody User user){
		User u = userDao.getUserByUsername(user.getUsername());
		log.info(u.getUsername());
		System.out.println(u.getPassword());
		
		return "index";
	}
}
