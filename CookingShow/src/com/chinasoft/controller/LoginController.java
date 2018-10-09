package com.chinasoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chinasoft.pojo.Person;

@Controller
public class LoginController {
   
//	@RequestMapping("/LoginServlet")
//	public String login(String name,String pwd) {
//		if("jichangshuang".equals(name) && "666".equals(pwd)) {
//			System.out.println("wochenggongle");
//			return "loginSucess";
//		} else {
//			return "loginFail";
//		}
//		
//	}
	
	@RequestMapping("/LoginServletModel")
	public String loginModel(Person p) {
		if("jichangshuang".equals(p.getName()) && "666".equals(p.getPwd())) {
			System.out.println("loginModel");
			System.out.println("p.getName()"+p.getName());
			return "loginSucess";
		} else {
			return "loginFail";
		}
		
	}
}
