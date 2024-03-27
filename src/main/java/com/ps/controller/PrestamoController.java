package com.ps.controller;

import com.ps.model.Cliente;
import com.ps.model.Prestamo;
import com.ps.service.IClienteService;
import com.ps.service.IPrestamoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //Decir que esta clase es administrada o controlada por SPRING
@RequestMapping("/prestamos") //Agregar una ruta para mi clase

public class PrestamoController {
    private final IPrestamoService iPrestamoService;

    public PrestamoController(IPrestamoService iPrestamoService) {
        this.iPrestamoService = iPrestamoService;
    }

    //ResponseEntity nos sirven para dar respuesta a peticiones con estas... 200 404, 500
  /*  @GetMapping
    public List<Prestamo> getAllPrestamo(){
        return null;
    }*/
    @GetMapping("/{id}")
    public ResponseEntity<Prestamo> getPrestamoById(@PathVariable Long id) {
        Prestamo prestamo = iPrestamoService.getPrestamoById(id);
        return ResponseEntity.ok(prestamo);
    }

    @PostMapping
    public ResponseEntity<Prestamo> createPrestamo(@RequestBody Prestamo prestamo) {
        Prestamo createdPrestamo = iPrestamoService.createPrestamo(prestamo);
        return new ResponseEntity<>(createdPrestamo, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Prestamo> updatePrestamo(/*@PathVariable Long id,*/ @RequestBody Prestamo prestamo) {
        /*prestamo.setPrestamo(id);*/
        Prestamo updatedPrestamo = iPrestamoService.updatePrestamo(prestamo);
        return ResponseEntity.ok(updatedPrestamo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePrestamo(@PathVariable Long id) {
        iPrestamoService.deletePrestamo(id);
        return ResponseEntity.noContent().build();
    }

}
