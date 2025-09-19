package com.example.lista006_ex03;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EstudanteService {

    private final List<Estudante> estudantes = new ArrayList<>();

    public Estudante salvar(Estudante estudante) {
        estudantes.add(estudante);
        return estudante;
    }

    public List<Estudante> buscarTodos() {
        return estudantes;
    }

    public Optional<Estudante> buscarPorCodigo(int codigo) {
        return estudantes.stream()
                .filter(e -> e.getCodigo() == codigo)
                .findFirst();
    }
}
