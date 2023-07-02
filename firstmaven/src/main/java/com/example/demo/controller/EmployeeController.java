package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeRepository employeerepo;
	@GetMapping("/employee")
	public String showEmployeeForm() {
		return "Employeeform";
	}
	@PostMapping("/employee")
	public String saveEmp(@ModelAttribute Employee emp) {
		
		employeerepo.save(emp);
		return "Employeeform";
	}

}
