package com.example.demo.service.impl;
import java.util.List;

import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;
import com.example.demo.entity.studentEntity;


import com.example.demo.repository.*;

@Service
public class StudentServiceImpl implements studentService{
    
    @Autowired
    studentRepo repo;

    public List<studentEntity> getAll(){
        return repo.findAll();
    }
 

}