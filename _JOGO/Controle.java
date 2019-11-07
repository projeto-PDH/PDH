package jogo;

import jplay.GameObject;
import jplay.TileInfo;

public class Controle {
/**
 * Função colisao: Identifica a colisão entre personagens e terrenos não percorríveis
 * @param objeto  objeto 
 * @param tile	  terreno	
 * @return
 */
		public boolean colisao(GameObject objeto, TileInfo tile) {
			if((tile.id >=22 || tile.id==18)&& objeto.collided(tile)) {
				return true;
			}else {
				return false;
			}
		}
}
