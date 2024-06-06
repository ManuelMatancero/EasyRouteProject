package com.matancita.easyroutebackend.service;

import org.springframework.http.ResponseEntity;

import com.matancita.easyroutebackend.domain.Prestamo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PrestamoService {

    public ResponseEntity<?> savePrestamo(Prestamo prestamo);
    public Page<Prestamo> findAllByPage(Pageable pageable);
    
}
