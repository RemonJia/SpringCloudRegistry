package com.jym.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.jym.bean.DatabaseInfo;
import com.jym.dao.DatabaseInfoDao;

@RestController
@RequestMapping("/ms")
public class MicroserviceController {
	
	@Autowired
	private DatabaseInfoDao diDao;	

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
		System.out.println(di.getUsername());		
		return di;
	}
}
