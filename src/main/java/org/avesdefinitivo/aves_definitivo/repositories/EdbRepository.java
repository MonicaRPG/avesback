package org.avesdefinitivo.aves_definitivo.repositories;

import org.avesdefinitivo.aves_definitivo.entities.Edb;
import org.springframework.data.repository.CrudRepository;

public interface EdbRepository extends CrudRepository<Edb, Integer> {
    Edb findByNombre(String name);
}
