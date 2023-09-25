/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.matancita.easyroutebackend.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.io.Serializable;

/**
 *
 * @author manue
 */
@Entity
public class Config implements Serializable{
    
     private static final long serialVersionUID = 1L;

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name="id_config")
     private Long idConfig;
     
     private double interes;
     
     private int status;   

    public Config() {
    }

    public Config(double interes, int status) {
        this.interes = interes;
        this.status = status;
    }

    public Long getIdConfig() {
        return idConfig;
    }

    public void setIdConfig(Long idConfig) {
        this.idConfig = idConfig;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
     
     
    
}
