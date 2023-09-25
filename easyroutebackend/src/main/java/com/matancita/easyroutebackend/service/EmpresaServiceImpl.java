/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.matancita.easyroutebackend.service;

import com.matancita.easyroutebackend.dao.EmpresaDao;
import com.matancita.easyroutebackend.domain.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author manue
 */
@Service
public class EmpresaServiceImpl implements EmpresaService {

    @Autowired
    private EmpresaDao empresadao;
            
            

}
