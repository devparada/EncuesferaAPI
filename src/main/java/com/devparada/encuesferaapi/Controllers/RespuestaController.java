package com.devparada.encuesferaapi.Controllers;

import java.time.ZonedDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.devparada.encuesferaapi.Database.Respuesta;
import com.devparada.encuesferaapi.Database.RespuestaDTO;
import com.devparada.encuesferaapi.Projections.RespuestaCountProjection;
import com.devparada.encuesferaapi.Repositories.RespuestaRepository;

@RestController
@RequestMapping("/respuestas")
public class RespuestaController {

    @Autowired
    private RespuestaRepository respuestaRepository;

    @GetMapping("/{idPregunta}")
    public ResponseEntity<?> obtenerOpcionesPorPregunta(@PathVariable Integer idPregunta) {
        List<RespuestaCountProjection> opciones = respuestaRepository.countOpcionesByIdPregunta(idPregunta);
        if (opciones.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(opciones);
    }

    @PostMapping("/enviarOpcion")
    public String saveOption(@RequestBody RespuestaDTO respuestaDTO) {
        Respuesta respuesta = new Respuesta();

        respuesta.setidPreguntaPreguntas(respuestaDTO.getIdPreguntaPreguntas());
        respuesta.setIdOpcionOpciones(respuestaDTO.getIdOpcionOpciones());
        respuesta.setIdUsuarioUsuarios(respuestaDTO.getIdUsuarioUsuarios());
        respuesta.setFechaRespuesta(ZonedDateTime.now());

        respuestaRepository.save(respuesta);
        return "Opción guardada con éxito";
    }
}
