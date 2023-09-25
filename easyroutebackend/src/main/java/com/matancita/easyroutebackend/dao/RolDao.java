package com.matancita.easyroutebackend.dao;


import com.matancita.easyroutebackend.domain.Rol;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="roles")
public interface RolDao extends CrudRepository<Rol, Long> {
}
