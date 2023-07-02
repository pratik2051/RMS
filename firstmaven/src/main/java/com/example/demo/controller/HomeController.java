package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/home")
	public String showdashboard(){
		return"home";
	}
	
	@GetMapping("/pos")
	public String showpos(){
		return"pos";
	}
	@GetMapping("/catagories")
	public String showcatagories(){
		return"catagories";
	}
		
	@GetMapping("/products")
	public String showproducts(){
		return"Products";
	}
	@GetMapping("/tables")
	public String showtables(){
		return"Tables";
	}
	@GetMapping("/staffs")
	public String showstaffs(){
		return"staffs";
	}
	@GetMapping("/kitchen")
	public String showkitchen(){
		return"kitchen";
	}
	@GetMapping("/inventory")
	public String showinventory(){
		return"Inventory";
	}
	@GetMapping("/reports")
	public String showreports(){
		return"reports";
	}
	@GetMapping("/settings")
	public String showsettings(){
		return"settings";
	}
	@GetMapping("/info")
	public String showinfo(){
		return"information";
	}

}
