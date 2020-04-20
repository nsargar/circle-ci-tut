package com.example.demo.controller;

import com.example.demo.entity.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController
{


    @PostMapping(value = { "/create", "/" })
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Employee e) {

    }

}