package com.jym.microservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.JsonObject;
import com.jym.bean.DatabaseInfo;
import com.jym.bean.User;
import com.jym.dao.DatabaseInfoDao;
import com.jym.dao.UserDao;
import com.jym.util.MD5Util;

@RestController
@RequestMapping("/ms")
public class MicroserviceController {
	private static Logger log = LoggerFactory.getLogger(MicroserviceController.class);

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
	
	//登录动作
	@RequestMapping("/logon")
	public String logon(@RequestBody User user){
		User u = userDao.getUserByUsername(user.getUsername());
		String s = MD5Util.encryptPassword(u.getPassword());
		log.info(s);
		if(MD5Util.encryptPassword(user.getPassword()).equals(u.getPassword())
				|| MD5Util.encryptPassword(user.getPassword()) == u.getPassword()){//验证密码
			JsonObject json = new JsonObject();
			json.addProperty("res", "success");
			return json.toString();
		}else{
			JsonObject json = new JsonObject();
			json.addProperty("res", "error");
			return json.toString();
		}		
		
	}
}
