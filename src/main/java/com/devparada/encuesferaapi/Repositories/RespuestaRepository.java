package com.devparada.encuesferaapi.Repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.devparada.encuesferaapi.Database.Respuesta;
import com.devparada.encuesferaapi.Projections.RespuestaCountProjection;

public interface RespuestaRepository extends JpaRepository<Respuesta, Integer> {
    @Query("SELECT o.textoOpcion as textoOpcion, COUNT(r) as totalRespuestas " +
       "FROM Respuesta r " +
       "JOIN r.idOpcionOpciones o " +
       "WHERE r.idPreguntaPreguntas = :idPregunta " +
       "GROUP BY o.idOpcion")
    List<RespuestaCountProjection> countOpcionesByIdPregunta(@Param("idPregunta") Integer idPregunta);
}
