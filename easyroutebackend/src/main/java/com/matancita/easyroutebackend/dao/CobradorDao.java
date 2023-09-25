package com.matancita.easyroutebackend.dao;


import com.matancita.easyroutebackend.domain.Cobrador;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="cobradores")
public interface CobradorDao extends CrudRepository<Cobrador, Long> {
}
