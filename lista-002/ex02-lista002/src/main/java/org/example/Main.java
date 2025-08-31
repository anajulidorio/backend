package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        String[] nomes = { "William", "Filipe", "Pelé", "Maradona", "Pedro", "Renato" };
        String[] sobrenomes = { "Gaucho", "Geromel", "Paulista", "Silva", "Junior"};
        String[] clubes = { "Criciuma", "Fortaleza", "Vasco", "ABC", "Paysandu", "Brusque"};
        String[] posicoes = { "Goleiro", "Zagueiro", "Lateral", "Meio-campo", "Volante", "Atacante"};

        for (int i = 0; i < 11; i++) {
            Random random = new Random();

            Jogador jogador = new Jogador (
                    nomes[random.nextInt(nomes.length)],
                    sobrenomes[random.nextInt(sobrenomes.length)],
                    clubes[random.nextInt(clubes.length)],
                    posicoes[random.nextInt(posicoes.length)],
                    (short) random.nextInt(18, 65)
            );

            System.out.println(jogador.nome + " " + jogador.sobrenome +
                    " é um futebolista brasileiro de " + jogador.idade +
                    " anos que atua como " + jogador.posicao + ". " +
                    "Atualmente defende o " + jogador.clube + ".");
        }
    }
}