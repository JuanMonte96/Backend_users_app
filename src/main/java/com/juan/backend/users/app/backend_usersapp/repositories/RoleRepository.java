package com.juan.backend.users.app.backend_usersapp.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.juan.backend.users.app.backend_usersapp.models.entities.Role;




public interface RoleRepository
        extends CrudRepository<Role, Long> {
        Optional<Role> findByName(String name);    
}
