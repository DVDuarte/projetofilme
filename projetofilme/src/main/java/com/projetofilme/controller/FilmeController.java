package com.projetofilme.controller;

import com.projetofilme.model.entity.Aluno;
import com.projetofilme.model.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/filme")
public class FilmeController {

    @Autowired
    private FilmeRepository FilmeRepository;

    @GetMapping("/listar")
    public List<Filme> listar() {
        return FilmeRepository.findAll();
    }

}