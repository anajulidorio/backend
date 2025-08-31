package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MusicCloud musicCloud = new MusicCloud();

        System.out.print("Digite o nome da playlist: ");
        String nomePlaylist = scanner.nextLine();
        Playlist minhaPlaylist = new Playlist(nomePlaylist);

        String continuar = "sim";
        while (continuar.equalsIgnoreCase("sim")) {
            System.out.print("Digite o nome da música: ");
            String tituloMusica = scanner.nextLine();

            Musica musicaEncontrada = musicCloud.buscarMusica(tituloMusica);

            if (musicaEncontrada != null) {
                minhaPlaylist.adicionarMusica(musicaEncontrada);
                System.out.println("Você adicionou a música " + musicaEncontrada.getTitulo() + " na playlist.");
            } else {
                System.out.println("A música " + tituloMusica + " não foi encontrada no sistema.");
            }

            System.out.print("Deseja adicionar outra música? (sim/não): ");
            continuar = scanner.nextLine();
        }

        System.out.println("---");
        minhaPlaylist.imprimirPlaylist();

        scanner.close();
    }
}