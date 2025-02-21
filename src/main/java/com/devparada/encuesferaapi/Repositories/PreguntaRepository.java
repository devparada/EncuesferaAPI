package com.devparada.encuesferaapi.Repositories;

import java.time.LocalDate;
import org.springframework.data.jpa.repository.JpaRepository;
import com.devparada.encuesferaapi.Database.Pregunta;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PreguntaRepository extends JpaRepository<Pregunta, Integer> {
    @Query("SELECT p.textoPregunta FROM Pregunta p WHERE CAST(p.fechaPregunta AS LocalDate) = :fecha")
    String findTextoPreguntaByFecha(@Param("fecha") LocalDate fecha);

    @Query("SELECT p.idPregunta FROM Pregunta p WHERE CAST(p.fechaPregunta AS LocalDate) = :fecha")
    String findIdPreguntaByFecha(@Param("fecha") LocalDate fecha);
}
