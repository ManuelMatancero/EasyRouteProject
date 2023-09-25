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
import java.time.LocalDateTime;

/**
 *
 * @author manue
 */
@Entity
public class RecibosGen implements Serializable {

    private static final long serialVersionUID =1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_recibos_gen")
    private Long idRecibosGen;

    private LocalDateTime fecha;

    private double valor;

    public RecibosGen() {
    }

    public RecibosGen(LocalDateTime fecha, double valor) {
        this.fecha = fecha;
        this.valor = valor;
    }

    public Long getIdRecibosGen() {
        return idRecibosGen;
    }

    public void setIdRecibosGen(Long idRecibosGen) {
        this.idRecibosGen = idRecibosGen;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
