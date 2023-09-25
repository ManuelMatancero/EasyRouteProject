package com.matancita.easyroutebackend.dao;


import com.matancita.easyroutebackend.domain.Prestamo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="prestamos")
public interface PrestamoDao extends CrudRepository<Prestamo, Long> {
}
