package org.avesdefinitivo.aves_definitivo.services;

import org.avesdefinitivo.aves_definitivo.entities.Clasificacion;
import org.avesdefinitivo.aves_definitivo.entities.Direccion;
import org.avesdefinitivo.aves_definitivo.entities.Edb;
import org.avesdefinitivo.aves_definitivo.repositories.EdbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class EdbService {

    @Autowired
    private EdbRepository edbRepository;

    public Optional<Edb> getEdbById(int id) {
        return edbRepository.findById(id);
    }

}
