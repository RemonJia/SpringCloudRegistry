package com.jym.microservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/microservice")
public class MicroserviceController {
	@RequestMapping("/register")
	public String hello(){
		//你还哦
		return "注册成功";
	}
	@RequestMapping("/login")
	public String haha(){
		return "欢迎大佬";
	}
}
