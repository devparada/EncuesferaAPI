package com.devparada.encuesferaapi.Repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.devparada.encuesferaapi.Database.Opcion;
import com.devparada.encuesferaapi.Projections.OpcionProjection;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OpcionRepository extends JpaRepository<Opcion, Integer> {
    @Query("SELECT p.idOpcion AS idOpcion, p.textoOpcion AS textoOpcion FROM Opcion p WHERE p.idPreguntaPreguntas = :idPregunta")
    List<OpcionProjection> findOpcionesPregunta(@Param("idPregunta") String idPregunta);
}
