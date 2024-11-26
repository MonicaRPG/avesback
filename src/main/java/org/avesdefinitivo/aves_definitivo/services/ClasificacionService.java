package org.avesdefinitivo.aves_definitivo.services;

import org.avesdefinitivo.aves_definitivo.entities.Clasificacion;
import org.avesdefinitivo.aves_definitivo.repositories.ClasificacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClasificacionService {

    @Autowired
    private ClasificacionRepository clasificacionRepository;

    public Optional<Clasificacion> getClasificacionById(int id) {
        return clasificacionRepository.findById(id);
    }
}
