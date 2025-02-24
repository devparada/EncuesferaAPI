package com.devparada.encuesferaapi.Controllers;

import java.time.ZonedDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.devparada.encuesferaapi.Database.Respuesta;
import com.devparada.encuesferaapi.Database.RespuestaDTO;
import com.devparada.encuesferaapi.Repositories.RespuestaRepository;

@RestController
public class RespuestaController {

    @Autowired
    private RespuestaRepository respuestaRepository;

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
