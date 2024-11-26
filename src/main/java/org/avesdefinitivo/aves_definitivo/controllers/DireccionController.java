package org.avesdefinitivo.aves_definitivo.controllers;

import org.avesdefinitivo.aves_definitivo.entities.Direccion;
import org.avesdefinitivo.aves_definitivo.services.DireccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/direccion")
public class DireccionController {

    @Autowired
    private DireccionService direccionService;



    @PostMapping
    public ResponseEntity<Direccion> createDireccion(@RequestBody Direccion direccion) {
        Direccion newDireccion = this.direccionService.save(direccion);
        return ResponseEntity.status(HttpStatus.CREATED).body(newDireccion);
    }

}
