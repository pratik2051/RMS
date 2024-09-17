package com.example.demo.repository;

import com.example.demo.model.Catagory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Locale;

public interface CatagoryRepository extends JpaRepository<Catagory, Long> {
}
