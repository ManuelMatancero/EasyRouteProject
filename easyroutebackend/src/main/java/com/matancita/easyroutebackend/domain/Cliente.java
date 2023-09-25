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
public class Cliente implements Serializable {
     private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_cliente")
    private Long idCliente;

    private String nombre;

    private String apellido;

    private String cedula;

    private String direccion;

    @Column(name = "fecha_nacimiento")
    private LocalDateTime fechaNacimiento;

    @Column(name="lugar_trabajo")
    private String lugarTrabajo;

    @Column(name="tel_trabajo")
    private String telTrabajo;

    private String celular;

    @Column(name="tel_residencia")
    private String telResidencia;

    private String email;

    private String ocupacion;

    private String recomendado;

    private String observaciones;

    @Column(name = "fecha_ingreso")
    private LocalDateTime fechaIngreso;

    private int estatus;

    @JsonIgnore
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Prestamo> prestamos;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "ruta")
    private Ruta ruta;

    public Cliente() {
    }

    
    
    public Cliente(String nombre, String apellido, String cedula, String direccion, LocalDateTime fechaNacimiento, String lugarTrabajo, String telTrabajo, String celular, String telResidencia, String email, String ocupacion, String recomendado, String observaciones, LocalDateTime fechaIngreso, int estatus, Ruta ruta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.lugarTrabajo = lugarTrabajo;
        this.telTrabajo = telTrabajo;
        this.celular = celular;
        this.telResidencia = telResidencia;
        this.email = email;
        this.ocupacion = ocupacion;
        this.recomendado = recomendado;
        this.observaciones = observaciones;
        this.fechaIngreso = fechaIngreso;
        this.estatus = estatus;
        this.ruta = ruta;
    }

    public Cliente(String nombre, String apellido, String cedula, String direccion, LocalDateTime fechaNacimiento, String lugarTrabajo, String telTrabajo, String celular, String telResidencia, String email, String ocupacion, String recomendado, String observaciones, LocalDateTime fechaIngreso, int estatus) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.lugarTrabajo = lugarTrabajo;
        this.telTrabajo = telTrabajo;
        this.celular = celular;
        this.telResidencia = telResidencia;
        this.email = email;
        this.ocupacion = ocupacion;
        this.recomendado = recomendado;
        this.observaciones = observaciones;
        this.fechaIngreso = fechaIngreso;
        this.estatus = estatus;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getLugarTrabajo() {
        return lugarTrabajo;
    }

    public void setLugarTrabajo(String lugarTrabajo) {
        this.lugarTrabajo = lugarTrabajo;
    }

    public String getTelTrabajo() {
        return telTrabajo;
    }

    public void setTelTrabajo(String telTrabajo) {
        this.telTrabajo = telTrabajo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelResidencia() {
        return telResidencia;
    }

    public void setTelResidencia(String telResidencia) {
        this.telResidencia = telResidencia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getRecomendado() {
        return recomendado;
    }

    public void setRecomendado(String recomendado) {
        this.recomendado = recomendado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public LocalDateTime getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDateTime fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }


    
    
    
}
