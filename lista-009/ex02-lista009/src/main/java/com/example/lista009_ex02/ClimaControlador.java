package com.example.lista009_ex02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clima")
public class ClimaControlador {

    @Autowired
    private ClimaServico servico;

    @GetMapping("/{cidade}")
    public RespostaClima obterClima(@PathVariable String cidade) {
        return servico.buscarClima(cidade);
    }
}