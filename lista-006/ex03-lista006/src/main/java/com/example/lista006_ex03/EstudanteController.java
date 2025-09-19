package com.example.lista006_ex03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estudantes")
public class EstudanteController {

    private final EstudanteService estudanteService;

    @Autowired
    public EstudanteController(EstudanteService estudanteService) {
        this.estudanteService = estudanteService;
    }

    @PostMapping
    public ResponseEntity<Estudante> salvarEstudante(@RequestBody Estudante estudante) {
        Estudante novoEstudante = estudanteService.salvar(estudante);
        return new ResponseEntity<>(novoEstudante, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Estudante>> buscarEstudantes() {
        List<Estudante> estudantes = estudanteService.buscarTodos();
        return ResponseEntity.ok(estudantes);
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<Estudante> buscarEstudantePorCodigo(@PathVariable int codigo) {
        Optional<Estudante> estudante = estudanteService.buscarPorCodigo(codigo);
        return estudante.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}