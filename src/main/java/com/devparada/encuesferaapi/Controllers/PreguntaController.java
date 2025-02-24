package com.devparada.encuesferaapi.Controllers;

import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.Collections;
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
public class PreguntaController {

    @Autowired
    private PreguntaRepository preguntaRepository;

    @GetMapping
    public List<Pregunta> obtenerTodos() {
        return preguntaRepository.findAll();
    }

    @GetMapping("/dia")
    public ResponseEntity<Map<String, String>> preguntaDia() {
        return obtenerRespuesta("textoPregunta", preguntaRepository.findTextoPreguntaByFecha(LocalDate.now()));
    }

    @GetMapping("/dia/id")
    public ResponseEntity<Map<String, String>> preguntaIdDia() {
        return obtenerRespuesta("idPregunta", preguntaRepository.findIdPreguntaByFecha(LocalDate.now()));
    }

    @PostMapping
    public ResponseEntity<?> crearPregunta(@RequestBody Pregunta preguntaCreada) {
        preguntaCreada.setIdPregunta(null);
        preguntaCreada.setFechaPregunta(null);
        try {
            preguntaRepository.save(preguntaCreada);
            return ResponseEntity.ok(preguntaCreada);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error al crear la pregunta: " + e.getMessage());
        }
    }

    private ResponseEntity<Map<String, String>> obtenerRespuesta(String clave, String valor) {
        if (valor == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(Collections.singletonMap(clave, valor));
    }
}
