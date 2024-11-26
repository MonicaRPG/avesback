package org.avesdefinitivo.aves_definitivo.repositories;

import org.avesdefinitivo.aves_definitivo.entities.Direccion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DireccionRepository extends CrudRepository<Direccion, Integer> {


}
