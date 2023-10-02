package com.matancita.easyroutebackend.dao;


import com.matancita.easyroutebackend.domain.Usuario;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(exported=false)//this exported = false is to avoid generate RESTful(Endpoints) services for this class
public interface UsuarioDao extends CrudRepository<Usuario, Long> {
   Optional<Usuario> findByUsername(String usuario);

   Boolean existsByUsername(String username);
    
}
