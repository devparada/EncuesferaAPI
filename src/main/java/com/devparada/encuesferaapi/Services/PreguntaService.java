package com.devparada.encuesferaapi.Services;

import java.util.List;
import java.time.LocalDate;
import com.devparada.encuesferaapi.Database.Preguntas;
import com.devparada.encuesferaapi.Repositories.PreguntaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pregunta")
public class PreguntaService {

    @Autowired
    private PreguntaRepository preguntaRepository;

    @GetMapping
    public List<Preguntas> obtenerTodos() {
        return preguntaRepository.findAll();
    }

    @GetMapping("/dia")
    public Preguntas preguntaDia() {
        LocalDate fechaHoy = LocalDate.now();
        return preguntaRepository.findPreguntaByFecha(fechaHoy);
    }
}
