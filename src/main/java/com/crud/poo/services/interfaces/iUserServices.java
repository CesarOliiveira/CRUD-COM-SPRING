package com.crud.poo.services.interfaces;

import com.crud.poo.dtos.UserResponseRecordDTO;
import com.crud.poo.entities.UserModel;

import java.util.List;
import java.util.UUID;

public interface iUserServices {
    List<UserResponseRecordDTO> findAll();
}
