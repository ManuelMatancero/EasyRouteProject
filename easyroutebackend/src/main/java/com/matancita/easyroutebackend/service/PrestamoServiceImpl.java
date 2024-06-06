package com.matancita.easyroutebackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.matancita.easyroutebackend.dao.PagareDao;
import com.matancita.easyroutebackend.dao.PrestamoDao;
import com.matancita.easyroutebackend.domain.Pagare;
import com.matancita.easyroutebackend.domain.Prestamo;
import com.matancita.easyroutebackend.specialfunctions.WeeklyDatesCalculator;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

@Service
public class PrestamoServiceImpl implements PrestamoService {

    @Autowired
    private PrestamoDao prestamoDao;
    @Autowired
    private PagareDao pagareDao;

    @Override
    public ResponseEntity<?>savePrestamo(Prestamo prestamo) {
        //Save the prestamo first to get the id
        prestamoDao.save(prestamo);
        //Here i creates the pagares asociated with that prestamo
        Iterable<Pagare> pagares = new WeeklyDatesCalculator().weeklyIterator(
                prestamo.getFecha(),
                prestamo.getIdPrestamo(),
                prestamo.getCuotas(),
                prestamo.getMonto(),
                prestamo.getInteres());
        //Now i save the list of pagare
        pagareDao.saveAll(pagares);
        return ResponseEntity.ok(prestamo);
    }

    @Override
    public Page<Prestamo> findAllByPage(Pageable pageable) {
        Pageable firstPageWithTenElements = PageRequest.of(0, 10);
        
        Page<Prestamo> tenPrestamos = prestamoDao.findAll(pageable);
        
        return tenPrestamos;
    }
    
    
    
}
