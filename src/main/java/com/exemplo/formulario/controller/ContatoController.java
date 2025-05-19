package com.exemplo.formulario.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemplo.formulario.model.Contato;
import com.exemplo.formulario.service.ContatoService;

@RestController
@RequestMapping("/api/contatos")
public class ContatoController {

    private final ContatoService service;

    public ContatoController(ContatoService service) {
        this.service = service;
    }

    @PostMapping
    public void adicionar(@RequestBody Contato contato) {
        service.adicionar(contato);
    }

    @GetMapping
    public List<Contato> listar() {
        return service.listar();
    }
}
