/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.matancita.easyroutebackend.service;

import com.matancita.easyroutebackend.dao.RolDao;
import com.matancita.easyroutebackend.domain.Rol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author manue
 */
@Service
public class RolServiceImpl implements RolService {

    
    @Autowired
    private RolDao roldao;
    

}
