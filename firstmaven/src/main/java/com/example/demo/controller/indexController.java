package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//controller is used to request processing 

public class indexController {
	//@RequestMapping(value="/",method = RequestMethod.GET)
	@GetMapping("/index")
	public String indexPage() {
		return "index";
		
	}
	/*
	 * public class LoginController {
	 * 
	 * @GetMapping("/login") public String showLogin() { return "loginForm";
	 */
			
		
	

}
  