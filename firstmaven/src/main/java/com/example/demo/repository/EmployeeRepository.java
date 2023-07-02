package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Employee;
import com.example.demo.model.User;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
User findByUsernameAndPassword(String un, String psw);
	
	@Query(value="select* from employee_tbl where username = :un and password=:psw ",nativeQuery = true)
	User login(@Param("un") String username , @Param("psw") String password);
	
}
