package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Catagory;

public interface FoodRepository extends JpaRepository<Catagory, Integer > {

}

