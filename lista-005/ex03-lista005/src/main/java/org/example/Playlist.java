package org.example;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String nome;
    private List<Musica> musicas;

    public Playlist(String nome) {
        this.nome = nome;
        this.musicas = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica) {
        this.musicas.add(musica);
    }

    public void imprimirPlaylist() {
        System.out.println("Playlist: " + this.nome);
        for (Musica musica : this.musicas) {
            System.out.println("- " + musica.getTitulo() + " de " + musica.getArtista());
        }
    }
}
