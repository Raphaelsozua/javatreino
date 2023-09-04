package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelo.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelo.Musica;
import br.com.alura.minhasmusicas.modelo.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("Kiss");

        for (int i = 0; i < 100; i++) {
            minhaMusica.reproduz();
        }
        for (int i = 0; i < 20; i++) {
            minhaMusica.curte();
        }
        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Bolha Dev");
        meuPodcast.setApresentdor("Marcus Mendes");

        for (int i = 0; i < 500; i++) {
            meuPodcast.reproduz();
        }
        for (int i = 0; i < 50; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}
