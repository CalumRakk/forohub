package com.example.forohub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.forohub.topico.DatoTopicoRegistro;
import com.example.forohub.topico.Topico;
import com.example.forohub.topico.TopicoDTO;
import com.example.forohub.topico.TopicoRepository;

import jakarta.transaction.Transactional;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class TopicoController {

    @Autowired
    TopicoRepository TopicoRepository;

    @PostMapping("/topicos")
    public void crearTopico(@RequestBody TopicoDTO topicoDTO) {
        var topico = new Topico(topicoDTO);
        TopicoRepository.save(topico);

    }

    @GetMapping("/topicos/{id}")
    public ResponseEntity getTopico(@PathVariable Long id) {
        var topico = TopicoRepository.findById(id);
        return ResponseEntity.ok(topico);
    }

    @PutMapping("/topicos/{id}")
    @Transactional
    public ResponseEntity putTopico(@PathVariable Long id, @RequestBody DatoTopicoRegistro dato) {
        var topico = TopicoRepository.findById(id);
        if (topico.isPresent()) {
            var result = topico.get();
            result.actualizarDato(dato);
            return ResponseEntity.ok(result);
        } else {
            return ResponseEntity.notFound().build();
        }

    }

    @DeleteMapping("/topicos/{id}")
    @Transactional
    public ResponseEntity deleteTopico(@PathVariable Long id) {
        var topico = TopicoRepository.findById(id);
        if (topico.isPresent()) {
            var result = topico.get();
            TopicoRepository.delete(result);
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.notFound().build();

    }

}