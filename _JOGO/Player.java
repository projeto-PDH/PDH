package jogo;

import java.awt.Point;
import java.util.Vector;

import jplay.GameObject;
import jplay.Keyboard;
import jplay.Scene;
import jplay.Sprite;
import jplay.TileInfo;
import jplay.URL;
import jplay.Window;

 
public class Player extends Sprite{


	private double velocidade = 1.3;
	private int direcao = 3;
	private Keyboard teclado;
	private boolean movendo = false;
	/**
	 * Construtor de Player: Inicializa o objeto Player com sua localização (x,y).
	 * @param x		posição no eixo x
	 * @param y		posição no eixo y
	 */
	
	public Player(int x, int y) {
		super(URL.sprite("Player.png"),36);
		this.x =x;
		this.y = y;
		this.setTotalDuration(2000);
	}
	/**
	 * Função mover: identifica a velocidade e recebe o direcionamento do personagem pela leitura das teclas
	 * @param janela	janela do jogo
	 * @param teclado	teclado
	 */
	public void mover(Window janela, Keyboard teclado) {
		if(teclado == null) {
			teclado = janela.getKeyboard();
		}
		if(teclado.keyDown(Keyboard.LEFT_KEY)==true) {
			update();
			if(this.x>0) {
				this.x -= velocidade;
				
			}
			if(direcao != 1) {
				
				setSequence(1,9);
				direcao = 1;
			}movendo = true;
		}else {
			if(teclado.keyDown(Keyboard.RIGHT_KEY)==true) {
				update();
				if(this.x< janela.getWidth() - 60) {
					this.x += velocidade;
					
				}
				if(direcao != 2) {
					
					setSequence(28,36);
					direcao = 2;
				}movendo = true;
			
			}else {
			if(teclado.keyDown(Keyboard.UP_KEY)==true) {
				update();
				if(this.y>0) {
					this.y -= velocidade;
					
				}
				if(direcao != 4) {
					
					setSequence(10,18);
					direcao = 4;
				}movendo = true;
				
			}else {
				if(teclado.keyDown(Keyboard.DOWN_KEY)==true) {
					update();
					if(this.y<janela.getHeight() - 60) {
						this.y += velocidade;
						
					}
					if(direcao != 5) {
						
						setSequence(19,27);
						direcao = 5;
					}movendo = true;
					
				}
			}
		}
			
	}
	
} 
	Controle controle = new Controle();
	/**
	 * Função caminho : Verifica os caminhos percorriveís pelo personagem
	 * @param cena 	cena do jogo
	 */
	public void caminho(Scene cena) {
		Point minimo = new Point((int)this.x,(int)this.y);
		Point maximo = new Point((int)this.x + this.width,(int)this.y + this.height);
		
		Vector<?>tiles = cena.getTilesFromPosition(minimo, maximo);
		for(int i=0 ; i<tiles.size(); i++) {
			TileInfo tile = (TileInfo) tiles.elementAt(i);
			
			if(controle.colisao(this, tile)==true) {
				if(colisaoV(this,tile)) {
					if(tile.y + tile.height <this.y) {
						this.y = tile.y + tile.height ;
					}else {
						
						if(tile.y>this.y + this.height -1) {
							this.y = tile.y - tile.height;
						}
					}
				}
				if(colisaoH(this,tile)) {
					if(this.x>tile.x + tile.width ) {
						this.x =tile.x - tile.width;
					}else {
							this.x = tile.x + tile.width;
						
					}
				}
			}
		}
	}
	/**
	 * Função colisaoH : Verifica a existência da colisão Horizontal do personagem
	 * @param objeto  	primeiro objeto
	 * @param objeto2	segundo objeto
	 * @return
	 */
	private boolean colisaoH(GameObject objeto, GameObject objeto2) { //vertical
		if(objeto2.x + objeto2.width <= objeto.x) {
			return false;
		}else {
			if(objeto.x + objeto.width <= objeto2.x) {
				return false;
			}else {
				return true;
			}
		}
	}
	/**
	 * Função colisaoV: Verifica a existência da colisão Vertical do personagem
	 * @param objeto 	primeiro objeto
	 * @param objeto2	segundo objeto
	 * @return
	 */
	private boolean colisaoV(GameObject objeto, GameObject objeto2) { //horizontal
		if(objeto2.y + objeto2.height < objeto.y) {
			return false;
		}else {
			if(objeto.y + objeto.height < objeto2.y) {
				return false;
			}else {
				return true;
			}
		}
	}
}
