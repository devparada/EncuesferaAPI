package com.devparada.encuesferaapi.Services;

import java.util.List;
import java.time.LocalDate;
import com.devparada.encuesferaapi.Database.Pregunta;
import com.devparada.encuesferaapi.Repositories.PreguntaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/pregunta")
public class PreguntaService {

    @Autowired
    private PreguntaRepository preguntaRepository;

    @GetMapping
    public List<Pregunta> obtenerTodos() {
        return preguntaRepository.findAll();
    }

    @GetMapping("/dia")
    public Pregunta preguntaDia() {
        LocalDate fechaHoy = LocalDate.now();
        return preguntaRepository.findPreguntaByFecha(fechaHoy);
    }

    @PostMapping
    public ResponseEntity<?> crearPregunta(@RequestBody Pregunta preguntaCreada) {
        preguntaCreada.setIdPregunta(null);
        preguntaCreada.setFechaPregunta(null);
        if (preguntaRepository.save(preguntaCreada) == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error al crear la pregunta");
        }
        return ResponseEntity.ok(preguntaCreada);
    }
}
