package org.example;

import java.util.ArrayList;
import java.util.List;

public class MusicCloud {
    private List<Musica> musicasDisponiveis;

    public MusicCloud() {
        this.musicasDisponiveis = new ArrayList<>();
        // Adicionando algumas músicas de exemplo
        this.musicasDisponiveis.add(new Musica("Hino do Real Paulista", "Time do Coração"));
        this.musicasDisponiveis.add(new Musica("Macarena", "Los del Río"));
        this.musicasDisponiveis.add(new Musica("Evidências", "Chitãozinho e Xororó"));
    }

    public Musica buscarMusica(String titulo) {
        for (Musica musica : this.musicasDisponiveis) {
            if (musica.getTitulo().equalsIgnoreCase(titulo)) {
                return musica;
            }
        }
        return null;
    }
}
