package com.matancita.easyroutebackend.service;

import org.springframework.http.ResponseEntity;

import com.matancita.easyroutebackend.domain.Prestamo;

public interface PrestamoService {

    public ResponseEntity<?> savePrestamo(Prestamo prestamo);;
    
}
