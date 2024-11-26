package org.avesdefinitivo.aves_definitivo.services;

import org.avesdefinitivo.aves_definitivo.entities.Ave;
import org.avesdefinitivo.aves_definitivo.entities.Direccion;
import org.avesdefinitivo.aves_definitivo.repositories.AveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AveService {

    @Autowired
    private AveRepository avesRepository;

    @Transactional
    public Ave save(Ave ave) {

        return avesRepository.save(ave);
    }




}
