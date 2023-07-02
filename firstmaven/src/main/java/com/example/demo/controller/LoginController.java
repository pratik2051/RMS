package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Controller

public class LoginController {
	@Autowired 
	private UserRepository userRepo;
	
	@GetMapping("/login")
	public String showLogin() {
		return "loginForm";
		
	}
	 
	@PostMapping("/login")
	public String doLogin(@ModelAttribute User user, Model model) {
	
		user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()));
		User usr=userRepo.findByUsernameAndPassword(user.getUsername(), user.getPassword());
		if(usr !=null) {
			model.addAttribute("uname",user.getUsername());
	
		return"home";
		}
		model.addAttribute("message","user not found !!");
		return"loginForm";
	}
			
	}

		
	
