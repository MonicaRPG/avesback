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
public class Edb {

    @Override
    public String toString() {
        return "Edb{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                '}';
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, nullable = false , name="nombre" , length = 100)
    private String nombre;

    public Edb(String nombre) {
        this.nombre = nombre;
    }

    @OneToMany(mappedBy = "edb",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.EAGER
    )
    private List<Ave> aves = new ArrayList<>();


}
