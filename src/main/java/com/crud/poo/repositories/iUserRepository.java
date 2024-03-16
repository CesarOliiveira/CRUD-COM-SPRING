package com.crud.poo.repositories;

import com.crud.poo.entities.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface iUserRepository extends JpaRepository<UserModel, UUID> {
    Optional<UserModel> findByNome(String nome);
}