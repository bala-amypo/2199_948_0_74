package com.example.demo.service.impl;

import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.*;

import com.example.demo.repository.*;

@Service
public class studentServiceImpl implements studentService{
    
    @Autowired
    studentRepo repo;

    public List<studentEntity> getAll(){
        return repo.findAll();
    }
 

}