package org.avesdefinitivo.aves_definitivo.controllers;

import jakarta.persistence.PostRemove;
import org.avesdefinitivo.aves_definitivo.entities.Direccion;
import org.avesdefinitivo.aves_definitivo.services.DireccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/direccion")
public class DireccionController {

    @Autowired
    private DireccionService direccionService;


    @CrossOrigin
    @PostMapping
    public ResponseEntity<Direccion> createDireccion(@RequestBody Direccion direccion) {
        Direccion newDireccion = this.direccionService.save(direccion);
        return ResponseEntity.status(HttpStatus.CREATED).body(newDireccion);
    }

    @CrossOrigin
    @GetMapping
    public ResponseEntity<List<Direccion>> getAllDireccion() {
        List<Direccion> direccions = this.direccionService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(direccions);
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Integer id){
        Optional<Direccion>  direccionOptional = this.direccionService.findOne(id);
        if(direccionOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(direccionOptional.get());
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @CrossOrigin
    @PutMapping("/{id}")
    public ResponseEntity<Direccion> actualizarProducto(@PathVariable Integer id,
                                                        @RequestBody Direccion direccion) {

        direccion.setId(id);
        return ResponseEntity.status(HttpStatus.OK).body(this.direccionService.save(direccion));
    }


    @CrossOrigin
    @DeleteMapping("/{id}")
    public ResponseEntity<Direccion> eliminar(@PathVariable Integer id) {
        Direccion d = new Direccion();
        d.setId(id);
        Optional<Direccion> direccionOptional = this.direccionService.delete(d);
        if(direccionOptional.isPresent()){
            return ResponseEntity.ok(direccionOptional.orElseThrow());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

}
