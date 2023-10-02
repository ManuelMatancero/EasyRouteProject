package com.matancita.easyroutebackend.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.matancita.easyroutebackend.domain.Role;
import com.matancita.easyroutebackend.specialfunctions.ERole;

public interface RoleDao extends CrudRepository<Role, Long>{

    Optional<Role> findByName(ERole name);
    
}
