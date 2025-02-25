package com.devparada.encuesferaapi.Database;

import java.time.ZonedDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "respuestas")
public class Respuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRespuesta;
    private String idUsuarioUsuarios;
    private Integer idPreguntaPreguntas;
    @ManyToOne
    @JoinColumn(name = "idOpcionOpciones")
    private Opcion idOpcionOpciones;
    private ZonedDateTime fechaRespuesta;

    public Integer getIdRespuesta() {
        return idRespuesta;
    }

    public void setIdRespuesta(Integer idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    public String getIdUsuarioUsuarios() {
        return idUsuarioUsuarios;
    }

    public void setIdUsuarioUsuarios(String idUsuarioUsuarios) {
        this.idUsuarioUsuarios = idUsuarioUsuarios;
    }

    public Integer getidPreguntaPreguntas() {
        return idPreguntaPreguntas;
    }

    public void setidPreguntaPreguntas(Integer idPreguntaPreguntas) {
        this.idPreguntaPreguntas = idPreguntaPreguntas;
    }

    public Opcion getIdOpcionOpciones() {
        return idOpcionOpciones;
    }

    public void setIdOpcionOpciones(Opcion idOpcionOpciones) {
        this.idOpcionOpciones = idOpcionOpciones;
    }

    public ZonedDateTime getFechaRespuesta() {
        return fechaRespuesta;
    }

    public void setFechaRespuesta(ZonedDateTime fechaRespuesta) {
        this.fechaRespuesta = fechaRespuesta;
    }
}
