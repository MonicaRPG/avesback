package org.avesdefinitivo.aves_definitivo.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name="hogar_paso")
@NoArgsConstructor
public class HogarPaso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Double costo;

    @Column(name="tipo_transporte")
    private String tipoTransporte;

    @Column(name="tiempo_transporte")
    private Integer tiempoTransporte;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ave_id")
    private Ave ave;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "direccion_id")
    private Direccion direccion;

    public HogarPaso(Double costo, String lugarReubicacion, String tipoTransporte, Integer tiempoTransporte) {
        this();
        this.costo = costo;

        this.tipoTransporte = tipoTransporte;
        this.tiempoTransporte = tiempoTransporte;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "adopcion_id", referencedColumnName = "id")
    private Adopcion adopcion;


}
