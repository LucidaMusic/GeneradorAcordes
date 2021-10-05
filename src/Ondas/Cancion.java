package Ondas;

import java.util.ArrayList;

public class Cancion {
	/**Definimos cancion como un conjunto de acordes
	 * Tambien podría existir una melodía por encima
	 */
		private ArrayList<Acorde> acordes=new ArrayList<>();
		
		Cancion(ArrayList<Acorde> acordes){
			this.acordes=acordes;
		}
}
