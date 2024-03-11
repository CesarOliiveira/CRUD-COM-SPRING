package com.crud.poo.controller;



import com.crud.poo.dtos.userdtos.UserResponseDTO;
import com.crud.poo.services.UserService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping
    public ResponseEntity<List<UserResponseDTO>> getAllUser(){
        return ResponseEntity.ok(userService.findAll());
    }
    
    @PostMapping
    public ResponseEntity<String> createUser(){
        return ResponseEntity.ok("Tudo ok");
    }

}
