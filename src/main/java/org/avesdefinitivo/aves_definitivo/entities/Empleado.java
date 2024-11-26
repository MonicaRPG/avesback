package org.avesdefinitivo.aves_definitivo.entities;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@DiscriminatorValue("EMPLEADO")
@Getter
@Setter
@NoArgsConstructor
public class Empleado extends Persona {

    public Empleado(String email, String telefono, LocalDate fechaNacimiento, String numeroDocumento, String tipoDocumento, String apellidos, String nombres, String cargo) {
        super(email, telefono, fechaNacimiento, numeroDocumento, tipoDocumento, apellidos, nombres);
        this.cargo = cargo;
    }

    private String cargo;
}
