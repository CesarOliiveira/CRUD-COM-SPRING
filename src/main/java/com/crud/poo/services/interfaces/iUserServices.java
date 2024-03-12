package com.crud.poo.services.interfaces;

import com.crud.poo.dtos.userdtos.UserRequestDTO;

import java.util.List;

public interface iUserServices {
    List<UserRequestDTO> findAll();
}
