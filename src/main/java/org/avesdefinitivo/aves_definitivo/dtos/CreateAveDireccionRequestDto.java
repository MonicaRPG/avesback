package org.avesdefinitivo.aves_definitivo.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateAveDireccionRequestDto extends CreateAveRequestDto {

    private String pais;
    private String departamento;
    private String ciudad;
    private String localidad;
    private String barrio;
    private String tipoVia;
    private String numero;
    private String estado;

    public CreateAveDireccionRequestDto(String nombre,
                                        String edad,
                                        String sexo,
                                        String foto,
                                        String notas,
                                        Integer clasificacionId,
                                        Integer edbId,
                                        String pais,
                                        String departamento,
                                        String ciudad,
                                        String localidad,
                                        String barrio,
                                        String tipoVia,
                                        String numero,
                                        String estado) {
        super(nombre, edad, sexo, foto, notas, clasificacionId, edbId);
        this.pais = pais;
        this.departamento = departamento;
        this.ciudad = ciudad;
        this.localidad = localidad;
        this.barrio = barrio;
        this.tipoVia = tipoVia;
        this.numero = numero;
        this.estado = estado;
    }
}
