package com.crud.poo.dtos.userdtos;

import com.crud.poo.entities.UserModel;

import java.util.ArrayList;
import java.util.List;

public class UserMapper {
    public static UserModel toUser(UserRequestDTO request){
        UserModel user = new UserModel();

        user.setEmail(request.email());
        user.setNome(request.nome());
        user.setSenha(request.senha());

        return user;
    }

    public static List<UserResponseDTO> toUserResponse(List<UserModel> requests){
        List<UserResponseDTO> response = new ArrayList<UserResponseDTO>();
        for(UserModel request : requests){
            UserResponseDTO user = new UserResponseDTO(request.getEmail(), request.getNome());

            response.add(user);
        }

        return response;
    }

    public static UserCreateResponseDTO toUserCreateResponse(UserModel request){
        return new UserCreateResponseDTO(request.getNome(), request.getEmail());
    }
}
