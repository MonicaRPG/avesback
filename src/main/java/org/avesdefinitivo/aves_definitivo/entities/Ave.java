package org.avesdefinitivo.aves_definitivo.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Ave {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false , name="nombre" , length = 100)
    private String nombre;

    @Column(nullable = true , name="edad" , length = 100)
    private Integer edad;

    @Column(columnDefinition = "varchar(20)" ,  name="sexo")
    private String sexo;

    @Column(nullable = true , name="foto" , columnDefinition = "TEXT")
    private String foto;

    @Column(nullable = true , name="notas" , length = 100)
    private String notas;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "clasificacion_id")
    private Clasificacion clasificacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "edb_id")
    private Edb edb;


    public Ave(Edb edb,
               Clasificacion clasificacion,
               String notas,
               String foto,
               String sexo,
               Integer edad,
               String nombre) {
        this.edb = edb;
        this.clasificacion = clasificacion;
        this.notas = notas;
        this.foto = foto;
        this.sexo = sexo;
        this.edad = edad;
        this.nombre = nombre;
    }


    @OneToMany(mappedBy = "ave",
            cascade = CascadeType.ALL,
            orphanRemoval = true ,
            fetch = FetchType.EAGER)
    private List<CitaVeterinaria> citas = new ArrayList<>();


    @OneToMany(mappedBy = "ave",
            cascade = CascadeType.ALL,
            orphanRemoval = true ,
            fetch = FetchType.EAGER)
    private List<DireccionAve> direccionAves = new ArrayList<>();



    @OneToMany(mappedBy = "ave",
            cascade = CascadeType.ALL,
            orphanRemoval = true ,
            fetch = FetchType.EAGER)
    private List<HogarPaso> hogaresPaso = new ArrayList<>();

    @Override
    public String toString() {
        return "Ave{" +
                "nombre=" + nombre +
                '}';
    }


}
