/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.matancita.easyroutebackend.domain;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author manue
 */
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Prestamo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id_prestamo")
    private Long idPrestamo;

    private LocalDateTime fecha;

    private double monto;

    @Column(name = "tipo_prestamo")
    private String tipoPrestamo;

    private LocalDateTime vencimiento;

    private double interes;

    private int cuotas;

    private int estado;

    @JsonIgnore
    @OneToMany(mappedBy = "prestamo", cascade = CascadeType.PERSIST, orphanRemoval = true)
    private List<Pagare> pagares;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "cliente")
    private Cliente cliente;

    public Prestamo() {
    }

    public Prestamo(LocalDateTime fecha, double monto, String tipoPrestamo, LocalDateTime vencimiento, double interes, int cuotas, int estado, Cliente cliente) {
        this.fecha = fecha;
        this.monto = monto;
        this.tipoPrestamo = tipoPrestamo;
        this.vencimiento = vencimiento;
        this.interes = interes;
        this.cuotas = cuotas;
        this.estado = estado;
        this.cliente = cliente;
    }

    public Long getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(Long idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getTipoPrestamo() {
        return tipoPrestamo;
    }

    public void setTipoPrestamo(String tipoPrestamo) {
        this.tipoPrestamo = tipoPrestamo;
    }

    public LocalDateTime getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(LocalDateTime vencimiento) {
        this.vencimiento = vencimiento;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public List<Pagare> getPagares() {
        return pagares;
    }

    public void setPagares(List<Pagare> pagares) {
        this.pagares = pagares;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
}
