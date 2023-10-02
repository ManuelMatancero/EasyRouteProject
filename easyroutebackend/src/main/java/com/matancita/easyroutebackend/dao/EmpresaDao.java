package com.matancita.easyroutebackend.dao;


import com.matancita.easyroutebackend.domain.Empresa;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EmpresaDao extends CrudRepository<Empresa, Long> {

    @Override
    java.util.List<Empresa> findAll();
}
