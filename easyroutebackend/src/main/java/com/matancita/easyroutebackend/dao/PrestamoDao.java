package com.matancita.easyroutebackend.dao;


import com.matancita.easyroutebackend.domain.Prestamo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="prestamos")
public interface PrestamoDao extends CrudRepository<Prestamo, Long> {

    //Fetch prestamos by cliente id
    List<Prestamo> findByClienteIdCliente(@Param("idCliente") Long idCliente);

    //Count prestamos by cliente id
    @Query("SELECT COUNT(p) FROM Prestamo p")
    long countPrestamos();
    //Sum monto prestamos general
    @Query("SELECT SUM(p.monto) FROM Prestamo p")
    double sumMontoPrestamos();
    //Sum interes prestamos general
    @Query("SELECT SUM(p.interes) FROM Prestamo p")
    double sumInteresPrestamos();
    //Sum monto prestamos by cliente
    @Query("SELECT SUM(p.monto) FROM Prestamo p WHERE p.cliente.idCliente= :idCliente")
    double sumMontoPrestamosByCliente(@Param("idCliente") Long idCliente);
    //Sum interes prestamos by cliente
    @Query("SELECT SUM(p.interes) FROM Prestamo p WHERE p.cliente.idCliente= :idCliente")
    double sumInteresPrestamosByCliente(@Param("idCliente") Long idCliente);
}
