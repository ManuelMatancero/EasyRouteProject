/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.matancita.easyroutebackend.domain;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author manue
 */
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Logs implements Serializable{
    
     private static final long serialVersionUID = 1L;
     
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name="id_logs")
     private Long idLogs;
     
     private String action;
     
     private LocalDateTime date;
     
     @ManyToOne(fetch=FetchType.LAZY)
     @JoinColumn(name = "usuario")
     private Usuario usuario;

    public Logs() {
    }

    public Logs(String action, LocalDateTime date, Usuario usuario) {
        this.action = action;
        this.date = date;
        this.usuario = usuario;
    }

    public Long getIdLogs() {
        return idLogs;
    }

    public void setIdLogs(Long idLogs) {
        this.idLogs = idLogs;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
     
     
     
}
