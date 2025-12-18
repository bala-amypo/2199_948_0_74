package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.*;

import com.example.demo.service.*;


@RestController
public class studentController {

    @Autowired
    studentService service;

    @GetMapping("/getAllStudent")
    public List<studentEntity> getAll(){
        return service.getAll();
    }

}