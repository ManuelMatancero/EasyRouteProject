/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.matancita.easyroutebackend.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author manue
 */
@Entity
public class Pagare implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_pagare")
    private Long idPagare;

    @Column(name = "no_pagare")
    private int noPagare;

    private double capital;

    private double interes;

    private double total;

    private LocalDateTime vencimiento;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "prestamo")
    private Prestamo prestamo;

    @OneToOne(cascade = CascadeType.MERGE, orphanRemoval = true)
    @JoinColumn(name = "id_recibo_gen", referencedColumnName = "id_recibos_gen")
    private RecibosGen reciboGen;

    public Pagare() {
    }

    public Pagare(int noPagare, double capital, double interes, double total, LocalDateTime vencimiento, Prestamo prestamo, RecibosGen reciboGen) {
        this.noPagare = noPagare;
        this.capital = capital;
        this.interes = interes;
        this.total = total;
        this.vencimiento = vencimiento;
        this.prestamo = prestamo;
        this.reciboGen = reciboGen;
    }

    public Long getIdPagare() {
        return idPagare;
    }

    public void setIdPagare(Long idPagare) {
        this.idPagare = idPagare;
    }

    public int getNoPagare() {
        return noPagare;
    }

    public void setNoPagare(int noPagare) {
        this.noPagare = noPagare;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public LocalDateTime getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(LocalDateTime vencimiento) {
        this.vencimiento = vencimiento;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public RecibosGen getReciboGen() {
        return reciboGen;
    }

    public void setReciboGen(RecibosGen reciboGen) {
        this.reciboGen = reciboGen;
    }
    
    
}
