package org.avesdefinitivo.aves_definitivo.services;

import org.avesdefinitivo.aves_definitivo.entities.Direccion;
import org.avesdefinitivo.aves_definitivo.repositories.DireccionRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.stream.Collectors;

import java.util.List;

@Service
public class DireccionService {

    @Autowired
    private DireccionRepository direccionRepository;

    @Transactional
    public Direccion save(Direccion direccion) {
        return direccionRepository.save(direccion);
    }

    @Transactional
    public List<Direccion> findAll() {
        return (List<Direccion>) this.direccionRepository.findAll();

    }


    @Transactional(readOnly = true)
    public Optional<Direccion> findOne(Integer id) {
        return this.direccionRepository.findById(id);
    }

    @Transactional
    public Optional<Direccion> delete(Direccion dir) {
        Optional<Direccion> direccionDB = this.direccionRepository.findById(dir.getId());
        direccionDB.ifPresent(direccion -> {
            this.direccionRepository.delete(dir);
        });
        return direccionDB;
    }




}
