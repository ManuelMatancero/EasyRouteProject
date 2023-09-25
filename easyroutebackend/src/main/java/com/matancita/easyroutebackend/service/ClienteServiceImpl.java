/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.matancita.easyroutebackend.service;

import com.matancita.easyroutebackend.dao.ClienteDao;
import com.matancita.easyroutebackend.domain.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author manue
 */
@Service
public class ClienteServiceImpl implements ClienteService {

    
    @Autowired
    private ClienteDao clientedao;
    
  
    
}
