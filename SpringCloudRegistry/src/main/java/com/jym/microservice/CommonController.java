package com.jym.microservice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CommonController {
	
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
	
}
