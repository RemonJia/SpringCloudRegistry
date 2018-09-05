package com.jym.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jym.bean.DatabaseInfo;
import com.jym.dao.DatabaseInfoDao;

@RestController
@RequestMapping("/microservice")
public class MicroserviceController {
	
	@Autowired
	private DatabaseInfoDao diDao;
	  
	@RequestMapping("/register")
	public String hello(){
		//你还哦
		return "注册成功";
	}
	@RequestMapping("/login")
	public DatabaseInfo haha(){
		DatabaseInfo di = diDao.getDatabaseInfoById(1);
		System.out.println(di.getUsername());		
		return di;
	}
}
