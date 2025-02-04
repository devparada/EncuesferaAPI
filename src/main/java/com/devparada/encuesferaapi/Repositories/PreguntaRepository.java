package com.devparada.encuesferaapi.Repositories;

import java.time.LocalDate;
import org.springframework.data.jpa.repository.JpaRepository;
import com.devparada.encuesferaapi.Database.Preguntas;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PreguntaRepository extends JpaRepository<Preguntas, Integer> {
    @Query("SELECT p FROM Preguntas p WHERE CAST(p.fechaPregunta AS LocalDate) = :fecha")
    Preguntas findPreguntaByFecha(@Param("fecha") LocalDate fecha);
}
