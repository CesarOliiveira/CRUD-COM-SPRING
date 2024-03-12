package com.crud.poo.controller;



import com.crud.poo.dtos.userdtos.UserCreateResponseDTO;
import com.crud.poo.dtos.userdtos.UserRequestDTO;
import com.crud.poo.dtos.userdtos.UserResponseDTO;
import com.crud.poo.entities.UserModel;
import com.crud.poo.services.UserService;
import org.apache.coyote.Response;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public ResponseEntity<UserCreateResponseDTO> createUser(@RequestBody UserModel request){
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.create(request));
    }

}
