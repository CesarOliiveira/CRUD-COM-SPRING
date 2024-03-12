package com.crud.poo.services;


import com.crud.poo.dtos.userdtos.UserCreateResponseDTO;
import com.crud.poo.dtos.userdtos.UserMapper;
import com.crud.poo.dtos.userdtos.UserResponseDTO;
import com.crud.poo.entities.UserModel;
import com.crud.poo.repositories.iUserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    @Autowired
    private iUserRepository userRepository;

    public List<UserResponseDTO> findAll(){
        List<UserModel> list = userRepository.findAll();
        return UserMapper.toUserResponse(list);
    }

    public UserCreateResponseDTO create(UserModel request){
        UserModel response = userRepository.save(request);
        return UserMapper.toUserCreateResponse(response);

    }

}
