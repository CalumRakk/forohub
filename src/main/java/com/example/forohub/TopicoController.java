package com.example.forohub;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TopicoController {

    @GetMapping("/topicos")
    public List<Topico> getTopicos() {
        // Aquí deberías obtener la lista de tópicos desde tu base de datos
        // usando un repositorio JPA o similar.
        // Por ahora, devolvemos una lista de ejemplo:
        List<Topico> topicos = new ArrayList<>();
        topicos.add(new Topico(1L, "Título 1", "Mensaje 1", "2024-07-27", "Abierto", "Autor 1", "Curso 1"));
        topicos.add(new Topico(2L, "Título 2", "Mensaje 2", "2024-07-28", "Cerrado", "Autor 2", "Curso 2"));
        return topicos;
    }
}