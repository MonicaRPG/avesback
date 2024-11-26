package org.avesdefinitivo.aves_definitivo.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Medicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;

    private String presentacion;

    private Integer contenido;

    @Column(name="unidad_contenido")
    private String unidadContenido;



}
