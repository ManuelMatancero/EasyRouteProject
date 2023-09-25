/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.matancita.easyroutebackend.dao;

import com.matancita.easyroutebackend.domain.Logs;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author manue
 */
@RepositoryRestResource(path="logs")
public interface LogsDao extends CrudRepository<Logs, Long>{
    
}
