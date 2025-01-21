package com.example.forohub.topico;

import jakarta.persistence.*;

@Entity
@Table(name = "topico")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private String fechaCreacion;
    private String status;
    private String autor;
    private String curso;

    public Topico() {
    }

    public Topico(TopicoDTO topicoDTO) {
        this.titulo = topicoDTO.titulo();
        this.mensaje = topicoDTO.mensaje();
        this.fechaCreacion = topicoDTO.fechaCreacion();
        this.status = topicoDTO.status();
        this.autor = topicoDTO.autor();
        this.curso = topicoDTO.curso();

    }

    public Topico(Long id, String titulo, String mensaje, String fechaCreacion, String status, String autor,
            String curso) {
        this.id = id;
        this.titulo = titulo;
        this.mensaje = mensaje;
        this.fechaCreacion = fechaCreacion;
        this.status = status;
        this.autor = autor;
        this.curso = curso;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public String getStatus() {
        return status;
    }

    public String getAutor() {
        return autor;
    }

    public String getCurso() {
        return curso;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String toString() {
        return "Topico{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", mensaje='" + mensaje + '\'' +
                ", fechaCreacion='" + fechaCreacion + '\'' +
                ", status='" + status + '\'' +
                ", autor='" + autor + '\'' +
                ", curso='" + curso + '\'' +
                '}';
    }

    public void actualizarDato(DatoTopicoRegistro dato) {
        this.titulo = dato.titulo();
        this.mensaje = dato.mensaje();
        this.autor = dato.autor();
        this.curso = dato.curso();
    }

}
