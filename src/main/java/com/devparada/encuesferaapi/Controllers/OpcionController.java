package com.devparada.encuesferaapi.Controllers;

import java.util.List;
import com.devparada.encuesferaapi.Database.Opcion;
import com.devparada.encuesferaapi.Projections.OpcionProjection;
import com.devparada.encuesferaapi.Repositories.OpcionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/opciones")
public class OpcionController {

    @Autowired
    private OpcionRepository opcionRepository;

    @GetMapping
    public List<Opcion> obtenerTodos() {
        return opcionRepository.findAll();
    }

    @GetMapping("/{idPregunta}")
    public ResponseEntity<List<OpcionProjection>> obtenerOpcionesPorPregunta(@PathVariable String idPregunta) {
        List<OpcionProjection> opciones = opcionRepository.findOpcionesPregunta(idPregunta);
        if (opciones.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(opciones);
    }
}
