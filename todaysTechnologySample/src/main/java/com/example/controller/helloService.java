package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloService {
    @GetMapping("/hello")
    @PreAuthorize("hasAnyAuthority('SCOPE_StudentService-write')")
    public ResponseEntity<String> getHelloWorld(){
        System.out.println("hello");
        return new ResponseEntity<String>("Hello World",HttpStatus.OK);
    }
    @GetMapping("/bye")
    public ResponseEntity<String> getbye(){
        System.out.println("bye");
        return new ResponseEntity<String>("bye bye!",HttpStatus.OK);
    }
}
