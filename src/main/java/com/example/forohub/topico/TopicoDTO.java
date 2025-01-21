package com.example.forohub.topico;

public record TopicoDTO(
        String titulo,
        String mensaje,
        String fechaCreacion,
        String status,
        String autor,
        String curso) {
    public TopicoDTO(Topico topico) {

        this(topico.getTitulo(), topico.getMensaje(), topico.getFechaCreacion(), topico.getStatus(), topico.getAutor(),
                topico.getCurso());
    }
}
