package com.matancita.easyroutebackend.dao;


import com.matancita.easyroutebackend.domain.Zona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ZonaDao extends CrudRepository<Zona, Long> {
}
