package org.avesdefinitivo.aves_definitivo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name="cita_veterinaria")
@NoArgsConstructor
public class CitaVeterinaria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    LocalDateTime fecha;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ave_id")
    private Ave ave;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "interesado_id")
    private Interesado interesado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "empleado_id")
    private Empleado empleado;

    @Column(columnDefinition = "TEXT")
    private String diagnostico;

    @Column(columnDefinition = "TEXT")
    private String tratamiento;



    public CitaVeterinaria(String diagnostico, LocalDateTime fecha, String tratamiento, Double precio) {
        this.diagnostico = diagnostico;
        this.fecha = fecha;
        this.tratamiento = tratamiento;
        this.precio = precio;
    }

    private Double precio;


}
