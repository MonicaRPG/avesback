package org.avesdefinitivo.aves_definitivo.controllers;

import org.avesdefinitivo.aves_definitivo.dtos.CreateAveRequestDto;
import org.avesdefinitivo.aves_definitivo.entities.Ave;
import org.avesdefinitivo.aves_definitivo.entities.Clasificacion;
import org.avesdefinitivo.aves_definitivo.entities.Edb;
import org.avesdefinitivo.aves_definitivo.services.AveService;
import org.avesdefinitivo.aves_definitivo.services.ClasificacionService;
import org.avesdefinitivo.aves_definitivo.services.EdbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ave")
public class AveController {


    @Autowired
    private ClasificacionService clasificacionService;

    @Autowired
    private EdbService edbService;

    @Autowired
    private AveService aveService;


    @GetMapping
    public String getAves() {
        return "Aves";
    }


    @PostMapping
    public ResponseEntity<?> create(@RequestBody CreateAveRequestDto createAveRequestDto) {
        //busquedas de clasificacion y edb
        Clasificacion clasificacion = clasificacionService.
                                      getClasificacionById(createAveRequestDto.getClasificacionId()).
                                      orElseThrow();

        Edb edb = edbService.getEdbById(createAveRequestDto.getEdbId()).orElseThrow();
        //@TODO:Crear nueva ave con categoria y edb
        Ave newAve = new Ave(edb,
                             clasificacion,
                             createAveRequestDto.getNotas(),
                             createAveRequestDto.getFoto(),
                             createAveRequestDto.getSexo(),
                             Integer.parseInt(createAveRequestDto.getEdad()),
                             createAveRequestDto.getNombre()
                );
        return ResponseEntity.ok().body(this.aveService.save(newAve));

    }














}
