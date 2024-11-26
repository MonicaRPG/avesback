package org.avesdefinitivo.aves_definitivo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Adopcion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDate fecha;

    private String firma;

    private String videoVivienda;

    private String observacionesVivienda;

    @Column(columnDefinition = "TINYINT")
    private Boolean Aprobado;

    @OneToOne(mappedBy = "adopcion")
    private HogarPaso hogarPaso;
}
