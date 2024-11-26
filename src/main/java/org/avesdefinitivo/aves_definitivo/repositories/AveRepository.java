package org.avesdefinitivo.aves_definitivo.repositories;

import org.avesdefinitivo.aves_definitivo.entities.Ave;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AveRepository extends CrudRepository<Ave, Integer> {

    List<Ave> findByClasificacionNombreComun(String nomnreComun);
}
