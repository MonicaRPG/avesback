package org.avesdefinitivo.aves_definitivo.repositories;

import org.avesdefinitivo.aves_definitivo.entities.Clasificacion;
import org.springframework.data.repository.CrudRepository;

public interface ClasificacionRepository extends CrudRepository<Clasificacion, Integer> {
    Clasificacion findByNombreCientificoAndNombreComun(String nombreCientifico,
                                                   String nombreComun);


}
