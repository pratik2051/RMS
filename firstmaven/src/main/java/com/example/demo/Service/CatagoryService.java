package com.example.demo.Service;


import com.example.demo.model.Catagory;
import com.example.demo.repository.CatagoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CatagoryService {

    @Autowired
    private CatagoryRepository catagoryRepository;

    public List<Catagory> getAllCatagories() {
        return catagoryRepository.findAll();
    }

    public Optional<Catagory> getCatagoryById(Long id) {
        return catagoryRepository.findById(id);
    }

    public Catagory saveCatagory(Catagory catagory) {
        return catagoryRepository.save(catagory);
    }

    public void deleteCatagory(Long id) {
        catagoryRepository.deleteById(id);
    }

    public Catagory updateCatagory(Long id, Catagory catagory) {
        if (catagoryRepository.existsById(id)) {
            catagory.setId(id);
            return catagoryRepository.save(catagory);
        }
        return null;
    }
}