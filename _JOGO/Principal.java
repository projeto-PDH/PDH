package jogo;

import jplay.GameImage;
import jplay.Keyboard;
import jplay.URL;
import jplay.Window;


public class Principal {

	public void iniciarJogo() {
		Window janela = new Window(1280,720);
		GameImage plano = new GameImage(URL.sprite("FundoMenu.jpg"));
		Keyboard teclado = janela.getKeyboard();
		
		while( true) {
			
			plano.draw();
			janela.update();
			new Cenario1(janela);
			if(teclado.keyDown(Keyboard.ENTER_KEY)) {
				Cenario1 cenario1 = new Cenario1(janela);
				System.out.println("Chegou");
			}
			if(teclado.keyDown(Keyboard.ESCAPE_KEY)) {
				break;
			}
		}
		janela.exit();
	}
		
}
