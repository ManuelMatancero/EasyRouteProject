package com.matancita.easyroutebackend.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.matancita.easyroutebackend.domain.Prestamo;
import com.matancita.easyroutebackend.service.PrestamoService;

@RestController
public class ControladorPrestamos {

    @Autowired
    private PrestamoService prestamoService;

    @PostMapping("/savePrestamo")
    public ResponseEntity<?> savePrestamo(@RequestBody Prestamo prestamo){  
        prestamoService.savePrestamo(prestamo);
        return ResponseEntity.ok(prestamo);
    }
    
}
