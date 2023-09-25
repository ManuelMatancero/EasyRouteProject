package com.matancita.easyroutebackend.dao;


import com.matancita.easyroutebackend.domain.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UsuarioDao extends CrudRepository<Usuario, Long> {
    Usuario findByUsername(String usuario);
    
}
