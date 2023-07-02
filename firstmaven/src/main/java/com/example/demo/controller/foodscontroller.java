
  package com.example.demo.controller;
 
  import org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.stereotype.Controller; import
  org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.catagory;
import com.example.demo.repository.FoodRepository;
  
 @Controller public class foodscontroller {
  
	 @Autowired
  private FoodRepository fooRepos;
  
  @GetMapping("/addcatagory")
  public String addcatagory() { 
	  return"addcatagory"; }
  
  @PostMapping("/addcatagory")
  public String SaveCatagory(@ModelAttribute catagory cat) {
	  fooRepos.save(cat);
  return"catagories";
  }
  
 
  }
  
 
 