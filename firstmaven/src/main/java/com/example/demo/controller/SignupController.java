package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Controller
public class SignupController {
		@Autowired
		private UserRepository userRepo;
	@GetMapping("/Signup")
	public String Signupform() {
		return "Signup";
	}
	@PostMapping("/Signup")
	public String saveuser(@ModelAttribute User user) {
		//password encrypt 	
		user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()));
		userRepo.save(user);
		
		return"costomerlogin";
	}

}


