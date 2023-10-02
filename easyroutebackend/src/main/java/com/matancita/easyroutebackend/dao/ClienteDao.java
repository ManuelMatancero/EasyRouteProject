package com.matancita.easyroutebackend.dao;

import com.matancita.easyroutebackend.domain.Cliente;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface ClienteDao extends CrudRepository<Cliente, Long> {

    //Fetch Clientes by Ruta
    List<Cliente> findByRutaIdRuta(@Param("idRuta")Long idRuta);

    //Count Clientes by Ruta
    @Query("SELECT COUNT(c) FROM Cliente c WHERE c.ruta.idRuta = :idRuta")
    long countClientesByRutaIdRuta(@Param("idRuta")Long idRuta);

}
