package com.example.appjenkins.controller;

import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@RequestMapping(value = "/devops")
@CrossOrigin(origins = "*")
public class DevOpsDemoController {

    @GetMapping("/{employeeID}")
    public String getOrdersById(@PathVariable(name = "employeeID") long employeeID) {
        try {
            return "Done";
        } catch (NoSuchElementException e) {
            return null;
        }
    }

    @GetMapping
    public String sayHello() {
        try {
            return "Hello";
        } catch (NoSuchElementException e) {
            return null;
        }
    }
}


