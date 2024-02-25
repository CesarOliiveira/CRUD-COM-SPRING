package com.crud.poo.controller;



import com.crud.poo.dtos.UserResponseRecordDTO;
import com.crud.poo.entities.UserModel;
import com.crud.poo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping
    public ResponseEntity<List<UserResponseRecordDTO>> getAllUser(){
        return ResponseEntity.ok(userService.findAll());
    }

}
