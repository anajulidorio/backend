package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Personagem> inimigos = new ArrayList<>();
        inimigos.add(new Personagem("Capitão América", 50, 10));
        inimigos.add(new Personagem("Homem de Ferro", 60, 12));
        inimigos.add(new Personagem("Thor", 40, 8));

        Personagem jogador = new Personagem("Viúva Negra", 100, 12);

        Random random = new Random();

        while (jogador.getVida() > 0) {
            Personagem alvo = null;
            while (alvo == null) {
                Personagem p = inimigos.get(random.nextInt(inimigos.size()));
                if (p.getVida() > 0) {
                    alvo = p;
                }
            }

            System.out.println("\n" + jogador.getNome() + " ataca " + alvo.getNome());
            jogador.atacar(alvo);

            for (Personagem inimigo : inimigos) {
                if (inimigo.getVida() > 0) {
                    System.out.println("\n" + inimigo.getNome() + " ataca " + jogador.getNome());
                    inimigo.atacar(jogador);
                    if (jogador.getVida() == 0) {
                        System.out.println("\n" + jogador.getNome() + " foi derrotada!");
                        break;
                    }
                }
            }

            if (jogador.getVida() == 0) {
                break;
            }
        }

        System.out.println("\nEstado final dos inimigos:");
        for (Personagem inimigo : inimigos) {
            System.out.println(inimigo.getNome() + " - Vida: " + inimigo.getVida());
        }
    }
}
