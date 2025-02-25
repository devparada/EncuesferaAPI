package com.devparada.encuesferaapi.Database;

public class RespuestaCountDTO {
    private String textoOpcion;
    private Long totalRespuestas;

    public RespuestaCountDTO(String textoOpcion, Long totalRespuestas) {
        this.textoOpcion = textoOpcion;
        this.totalRespuestas = totalRespuestas;
    }

    public String getTextoOpcion() {
        return textoOpcion;
    }

    public void setTextoOpcion(String textoOpcion) {
        this.textoOpcion = textoOpcion;
    }

    public Long getTotalRespuestas() {
        return totalRespuestas;
    }

    public void setTotalRespuestas(Long totalRespuestas) {
        this.totalRespuestas = totalRespuestas;
    }
}
