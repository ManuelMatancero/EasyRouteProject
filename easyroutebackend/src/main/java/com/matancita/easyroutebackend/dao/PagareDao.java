package com.matancita.easyroutebackend.dao;


import com.matancita.easyroutebackend.domain.Pagare;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface PagareDao extends CrudRepository<Pagare, Long> {

    //Fetch pagares by prestamo id
    List<Pagare> findByPrestamoIdPrestamo(@Param("idPrestamo") Long idPrestamo);

    //Count pagares by prestamo id
    @Query("SELECT COUNT(p) FROM Pagare p WHERE p.prestamo.idPrestamo= :idPrestamo")
    long countPagaresByPrestamoIdPrestamo(@Param("idPrestamo") Long idPrestamo);


}
