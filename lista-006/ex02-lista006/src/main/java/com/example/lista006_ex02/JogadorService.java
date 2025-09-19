package com.example.lista006_ex02;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class JogadorService {

    List<String> nomes = List.of("Ronaldo", "Pelé", "Zico", "Roberto", "Neymar");
    List<String> sobrenomes = List.of("Silva", "Souza", "Fenômeno", "Carlos", "Junior");

    Random random = new Random();

    public org.example.lista006_ex02.Jogador gerarJogador(String time, String posicao) {

        String nome = nomes.get(random.nextInt(nomes.size()));
        String sobrenome = sobrenomes.get(random.nextInt(sobrenomes.size()));
        int idade = 18 + random.nextInt(23); // 18 a 40 anos

        return new org.example.lista006_ex02.Jogador(nome, sobrenome, idade, posicao, time);
    }
}
