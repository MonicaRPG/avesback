package org.avesdefinitivo.aves_definitivo.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@DiscriminatorValue("INTERESADO")
@Getter
@Setter
@NoArgsConstructor
public class Interesado extends Persona {

    public Interesado(String email,
                      String telefono,
                      LocalDate fechaNacimiento,
                      String numeroDocumento,
                      String tipoDocumento,
                      String apellidos,
                      String nombres,
                      String estado) {
        super(email,
                telefono,
                fechaNacimiento,
                numeroDocumento,
                tipoDocumento,
                apellidos,
                nombres);
        this.estado = estado;
    }

    private String estado;
}
