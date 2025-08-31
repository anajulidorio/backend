package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] nomes = {"Bulbasau", "Charmander", "Pikachu", "Poliwhirl", "Poliwrath", "Abra", "Kadabra"};
        String[] tipos = {"Fogo", "Planta", "Água", "Normal", "Elétrico", "Gelo", "Lutador", "Venenoso"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos Pokémon você deseja gerar? ");
        int qtde = scanner.nextInt();
        System.out.println();

        for (int i = 0; i < qtde; i++) {
            Random random = new Random();

            Pokemon pokemon = new Pokemon(
                nomes[random.nextInt(nomes.length)],
                tipos[random.nextInt(tipos.length)],
                random.nextInt(1,100)
            );

            System.out.println("Seu pokémon é um " + pokemon.nome + " do tipo " + pokemon.tipo + " e nível " + pokemon.nivel + ".");
        }
    }
}