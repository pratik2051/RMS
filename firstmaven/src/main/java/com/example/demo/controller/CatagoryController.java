package com.example.demo.controller;

import com.example.demo.Service.CatagoryService;
import com.example.demo.model.Catagory;
import jdk.jfr.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/catagories")
public class CatagoryController {

    @Autowired
    private CatagoryService catagoryService;

    @GetMapping("/getallcatagory")
    public List<Catagory> getAllCatagories() {
        return catagoryService.getAllCatagories();
    }

    @GetMapping("/getcatagory /{id}")
    public ResponseEntity<Catagory> getCatagoryById(@PathVariable Long id) {
        Optional<Catagory> catagory = catagoryService.getCatagoryById(id);
        return catagory.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Catagory> createCatagory(@RequestBody Catagory catagory) {
        Catagory savedCatagory = catagoryService.saveCatagory(catagory);
        return new ResponseEntity<>(savedCatagory, HttpStatus.CREATED);
    }

    @PutMapping("/updatecatagory/{id}")
    public ResponseEntity<Catagory> updateCatagory(@PathVariable Long id, @RequestBody Catagory catagory) {
        Catagory updatedCatagory = catagoryService.updateCatagory(id, catagory);
        if (updatedCatagory != null) {
            return ResponseEntity.ok(updatedCatagory);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/deletecatagory/{id}")
    public ResponseEntity<Void> deleteCatagory(@PathVariable Long id) {
        catagoryService.deleteCatagory(id);
        return ResponseEntity.noContent().build();
    }
}