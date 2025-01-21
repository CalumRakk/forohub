package com.example.forohub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.forohub.topico.Topico;
import com.example.forohub.topico.TopicoDTO;
import com.example.forohub.topico.TopicoRepository;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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

}