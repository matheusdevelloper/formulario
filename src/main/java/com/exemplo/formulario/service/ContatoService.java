package com.exemplo.formulario.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.exemplo.formulario.model.Contato;

@Service
public class ContatoService {

     private final List<Contato> contatos = new ArrayList<>();

    public void adicionar(Contato contato) {
        contatos.add(contato);
    }

    public List<Contato> listar() {
        return contatos;
    }
}
