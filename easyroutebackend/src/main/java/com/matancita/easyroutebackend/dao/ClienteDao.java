package com.matancita.easyroutebackend.dao;

import com.matancita.easyroutebackend.domain.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface ClienteDao extends CrudRepository<Cliente, Long> {


}
