package com.jym.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jym.bean.DatabaseInfo;
import com.jym.bean.User;
import com.jym.dao.DatabaseInfoDao;
import com.jym.dao.UserDao;

@RestController
@RequestMapping("/ms")
public class MicroserviceController {
	
	@Autowired
	private DatabaseInfoDao diDao;	
	@Autowired
	private UserDao userDao;
	
	@RequestMapping("/index")
	public String index(){
		return "index";
	}  
	
	@RequestMapping("/register")
	public String hello(){
		//你还哦
		return "注册成功";
	}
	@RequestMapping("/login")
	public DatabaseInfo haha(){
		DatabaseInfo di = diDao.getDatabaseInfoById(1);
		User u = userDao.getUserById(0);
		System.out.println(u.getUsername());		
		return di;
	}
}
