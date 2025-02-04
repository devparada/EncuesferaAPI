package com.devparada.encuesferaapi.Database;

import java.time.ZonedDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Preguntas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPregunta;
    private String textoPregunta;
    private ZonedDateTime fechaPregunta;
    private Integer estado;

    public Integer getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(Integer idPregunta) {
        this.idPregunta = idPregunta;
    }

    public String getTextoPregunta() {
        return textoPregunta;
    }

    public void setTextoPregunta(String textoPregunta) {
        this.textoPregunta = textoPregunta;
    }

    public ZonedDateTime getFechaPregunta() {
        return fechaPregunta;
    }

    public void setFechaPregunta(ZonedDateTime fechaPregunta) {
        this.fechaPregunta = fechaPregunta;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
}
