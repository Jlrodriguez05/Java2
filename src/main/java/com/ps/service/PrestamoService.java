package com.ps.service;

import com.ps.model.Cliente;
import com.ps.model.Prestamo;
import com.ps.repository.PrestamoRepository;
import org.springframework.stereotype.Service;

@Service
public class PrestamoService implements IPrestamoService{

    public final PrestamoRepository prestamoRepository;

    public PrestamoService(PrestamoRepository prestamoRepository) {
        this.prestamoRepository = prestamoRepository;
    }

    @Override
    public Prestamo getPrestamoById(Long id) {
        return prestamoRepository.getReferenceById(id);
    }

    @Override
    public Prestamo createPrestamo(Prestamo prestamo) {
        return prestamoRepository.save(prestamo);
    }

    @Override
    public Prestamo updatePrestamo(Prestamo prestamo) {
        return prestamoRepository.save(prestamo);
    }

    @Override
    public void deletePrestamo(Long id) {
        prestamoRepository.deleteById(id);
    }

}
