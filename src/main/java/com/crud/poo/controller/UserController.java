package com.crud.poo.controller;



import com.crud.poo.dtos.userdtos.UserCreateResponseDTO;
import com.crud.poo.dtos.userdtos.UserEditRequestDTO;
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
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping
    public ResponseEntity<List<UserResponseDTO>> getAllUser(){
        return ResponseEntity.ok(userService.findAll());
    }

    @GetMapping("/{name}")
    public ResponseEntity<Object> getUserById(@PathVariable(value = "name") String name){
        Optional<UserModel> user = userService.findByName(name);

        if(user.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User NOT FOUND");
        }

        return ResponseEntity.status(HttpStatus.OK).body(user.get());
    }

    @PostMapping
    public ResponseEntity<UserCreateResponseDTO> createUser(@RequestBody UserModel request){
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.create(request));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> editUser(@PathVariable UUID id, @RequestBody UserEditRequestDTO request){
        Optional<UserModel> user = userService.findById(id);

        if(user.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
        }
        var userModel = user.get();
        BeanUtils.copyProperties(request, userModel);
        return ResponseEntity.status(HttpStatus.OK).body(userService.create(userModel));
    }




}
