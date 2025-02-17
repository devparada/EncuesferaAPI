package com.devparada.encuesferaapi.Database;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "opciones")
public class Opcion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idOpcion;
    private String textoOpcion;
    private Integer idPreguntaPreguntas;

    public Integer getIdOpcion() {
        return idOpcion;
    }

    public void setIdOpcion(Integer idOpcion) {
        this.idOpcion = idOpcion;
    }

    public String getTextoOpcion() {
        return textoOpcion;
    }

    public void setTextoOpcion(String textoOpcion) {
        this.textoOpcion = textoOpcion;
    }

    public Integer getIdPreguntaPreguntas() {
        return idPreguntaPreguntas;
    }

    public void setIdPreguntaPreguntas(Integer idPreguntaPreguntas) {
        this.idPreguntaPreguntas = idPreguntaPreguntas;
    }
}
