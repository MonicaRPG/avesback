package org.avesdefinitivo.aves_definitivo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Direccion {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String pais;
    private String departamento;
    private String ciudad;
    private String localidad;
    private String barrio;
    private String tipoVia;
    private String numero;
    private String estado;


    @OneToMany(mappedBy = "direccion",
            cascade = CascadeType.ALL,
            orphanRemoval = true ,
            fetch = FetchType.EAGER)
    private List<Persona> personas = new ArrayList<>();

    @OneToMany(mappedBy = "direccion",
            cascade = CascadeType.ALL,
            orphanRemoval = true ,
            fetch = FetchType.EAGER)
    private List<DireccionAve> direccionAves = new ArrayList<>();


}
