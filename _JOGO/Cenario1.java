package jogo;

import jplay.Scene;
import jplay.URL;
import jplay.Window;
import jplay.Keyboard;

public class Cenario1 {
	private Window janela;
	private Scene cena;
	private Player player;
	private Keyboard teclado;
	/**
	 * Construtor de Cenario1: Incializa o cenário desenhando a janela.
	 * @param window  janela
	 */
	public Cenario1(Window window) {
		janela= window;
		cena = new Scene();
		cena.loadFromFile(URL.scenario("Cenario1.scn"));
		player = new Player(640,350);
		teclado = janela.getKeyboard();
		run();
	}
	
	/**
	 * Função correr
	 */
	private void run() {
		while(true) {
			//cena.draw();
			player.mover(janela, teclado);
			player.caminho(cena);
			
			cena.moveScene(player);
			player.x += cena.getXOffset();
			player.y += cena.getYOffset();
			player.draw();
			
			janela.update();
		
		}
	}
}

