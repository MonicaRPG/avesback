package org.avesdefinitivo.aves_definitivo.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CreateAveRequestDto {

    @JsonProperty("nombre")
    protected String nombre;

    @JsonProperty("edad")
    protected String edad;

    @JsonProperty("sexo")
    protected String sexo;

    @JsonProperty("foto")
    protected String foto;

    @JsonProperty("notas")
    protected String notas;

    @JsonProperty("clasificacionId")
    protected Integer clasificacionId;

    @JsonProperty("edbId")
    protected Integer edbId;


}
