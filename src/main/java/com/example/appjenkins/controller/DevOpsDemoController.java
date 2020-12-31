package com.example.appjenkins.controller;

import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@RequestMapping(value = "/employee")
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
}


