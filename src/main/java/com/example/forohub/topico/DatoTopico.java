package com.example.forohub.topico;

public record DatoTopico(
        Long id,
        String titulo,
        String mensaje,
        String fechaCreacion,
        String status,
        String autor,
        String curso) {

}