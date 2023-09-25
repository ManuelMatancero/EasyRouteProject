package com.matancita.easyroutebackend.dao;


import com.matancita.easyroutebackend.domain.RecibosGen;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="recibosGen")
public interface RecibosGenDao extends CrudRepository<RecibosGen, Long> {
}
