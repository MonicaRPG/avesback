package org.avesdefinitivo.aves_definitivo.services;

import org.avesdefinitivo.aves_definitivo.entities.Direccion;
import org.avesdefinitivo.aves_definitivo.repositories.DireccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DireccionService {

    @Autowired
    private DireccionRepository direccionRepository;

    @Transactional
    public Direccion save(Direccion direccion) {
        return direccionRepository.save(direccion);
    }
}
