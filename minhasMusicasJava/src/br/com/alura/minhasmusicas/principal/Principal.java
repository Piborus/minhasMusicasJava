package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
	public static void main(String[] args) {
		Musica minhaMusica = new Musica();
		minhaMusica.setCantor("Cold Play");
		minhaMusica.setTitulo("YELLOW");
		minhaMusica.setAlbum("Ghost Stories");
		minhaMusica.setGenero("POP/DANCE");

		for (int i = 0; i < 1000; i++) {
			minhaMusica.reproduz();

		}

		for (int i = 0; i < 50; i++) {
			minhaMusica.curte();

		}

		Podcast meuPodCast = new Podcast();
		meuPodCast.setTitulo("BolhaDev");
		meuPodCast.setApresentador("Marcus Mendes");

		for (int i = 0; i < 5000; i++) {
			meuPodCast.reproduz();
		}

		for (int i = 0; i < 1000; i++) {
			meuPodCast.curte();

		}
		
		MinhasPreferidas preferidas = new MinhasPreferidas();
		preferidas.inclui(meuPodCast);
		preferidas.inclui(minhaMusica);
		
	}
}
