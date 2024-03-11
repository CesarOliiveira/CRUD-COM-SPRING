package com.crud.poo.services;


import com.crud.poo.dtos.userdtos.UserMapper;
import com.crud.poo.dtos.userdtos.UserResponseDTO;
import com.crud.poo.entities.UserModel;
import com.crud.poo.repositories.iUserRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    @Autowired
    private iUserRepository userRepository;

    @Autowired
    private ModelMapper mapper;

    public List<UserResponseDTO> findAll(){
        List<UserModel> list = userRepository.findAll();
        return UserMapper.toUserResponse(list);
    }




}
