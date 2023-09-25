package com.matancita.easyroutebackend.dao;


import com.matancita.easyroutebackend.domain.Cobrador;
import com.matancita.easyroutebackend.domain.Ruta;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RutaDao extends CrudRepository<Ruta, Long> {
    
    //fetch rutas by cobrador
    List<Ruta> findByCobradorIdCobrador(@Param("idCobrador") Long idCobrador);
    
    //fetch rutas by dia
    List<Ruta> findByDia(@Param("dia") String dia);
    
    
}
