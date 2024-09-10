package br.com.screenMatchfrases.controller;

import br.com.screenMatchfrases.model.DTO.FraseDTO;
import br.com.screenMatchfrases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series")
public class FrasesController {
    @Autowired
    private FraseService service;

    @GetMapping("/frases")
    public FraseDTO buscaFrase() {
        return service.buscarFraseAleatoria();
    }
}
