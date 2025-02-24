package com.devparada.encuesferaapi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devparada.encuesferaapi.Database.Respuesta;

public interface RespuestaRepository extends JpaRepository<Respuesta, Integer> {
}
