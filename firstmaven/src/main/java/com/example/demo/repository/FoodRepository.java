package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.catagory;

public interface FoodRepository extends JpaRepository<catagory, Integer > {

}

