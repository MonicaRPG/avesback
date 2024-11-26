package org.avesdefinitivo.aves_definitivo.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import lombok.*;

@Entity
@Getter
@Setter

@NoArgsConstructor
public class Clasificacion {

    @Override
    public String toString() {
        return "Clasificacion{" +
                "nombreCientifico='" + nombreCientifico + '\'' +
                ", nombreComun='" + nombreComun + '\'' +
                '}';
    }

    @Id
    private Integer id;

    @Column(
                nullable = false ,
                name="nombre_cientifico" ,
                length = 100
            )
    private String nombreCientifico;

    @Column(
            nullable = false ,
            name="nombre_comun" ,
            length = 100
    )
    private String nombreComun;

    public Clasificacion(String nombreCientifico,
                         String nombreComun) {
        this.nombreCientifico = nombreCientifico;
        this.nombreComun = nombreComun;
    }

    @OneToMany(mappedBy = "clasificacion",
            cascade = CascadeType.ALL,
            orphanRemoval = true ,
            fetch = FetchType.EAGER)
    private List<Ave> aves = new ArrayList<>();


}
