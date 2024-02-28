package com.crud.poo.services;


import com.crud.poo.dtos.UserResponseRecordDTO;
import com.crud.poo.dtos.convert.convertEntityToDTO;
import com.crud.poo.entities.UserModel;
import com.crud.poo.repositories.iUserRepository;
import com.crud.poo.services.interfaces.iUserServices;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class UserService {

    @Autowired
    private iUserRepository userRepository;

    public List<UserResponseRecordDTO> findAll(){
        return null;
    }

    private List<UserResponseRecordDTO> toDTO(){
        UserResponseRecordDTO userDTO;
        
    }

}
