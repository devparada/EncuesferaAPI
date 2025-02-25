package com.devparada.encuesferaapi.Database;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RespuestaDTO {
    @JsonProperty("ip")
    private String idUsuarioUsuarios;
    @JsonProperty("idPregunta")
    private Integer idPreguntaPreguntas;
    @JsonProperty("option")
    private Opcion idOpcionOpciones;

    public String getIdUsuarioUsuarios() {
        return idUsuarioUsuarios;
    }

    public void setIdUsuarioUsuarios(String idUsuarioUsuarios) {
        this.idUsuarioUsuarios = idUsuarioUsuarios;
    }

    public Integer getIdPreguntaPreguntas() {
        return idPreguntaPreguntas;
    }

    public void setIdPreguntaPreguntas(Integer idPreguntaPreguntas) {
        this.idPreguntaPreguntas = idPreguntaPreguntas;
    }

    public Opcion getIdOpcionOpciones() {
        return idOpcionOpciones;
    }

    public void setIdOpcionOpciones(Opcion idOpcionOpciones) {
        this.idOpcionOpciones = idOpcionOpciones;
    }
}
