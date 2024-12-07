package org.avesdefinitivo.aves_definitivo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "direccion_ave")
public class DireccionAve {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ave_id")
    private Ave ave;


    @ManyToOne()
    @JoinColumn(name = "direccion_id")
    private Direccion direccion;
}
