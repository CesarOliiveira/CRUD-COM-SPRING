package com.crud.poo.services.interfaces;

import com.crud.poo.dtos.userdtos.UserRequest;

import java.util.List;

public interface iUserServices {
    List<UserRequest> findAll();
}
