package com.matancita.easyroutebackend.dao;


import com.matancita.easyroutebackend.domain.Pagare;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface PagareDao extends CrudRepository<Pagare, Long> {
}
