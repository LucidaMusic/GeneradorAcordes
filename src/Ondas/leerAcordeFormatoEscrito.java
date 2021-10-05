package Ondas;

import static Tablas.Notas.nota2freq;
import Tablas.DobleExtension;
import Tablas.Extensiones;
import Tablas.Modos;

import java.util.ArrayList;



public class leerAcordeFormatoEscrito {

	private StringBuilder nombreAcorde;
	ArrayList<Float> freqs;

	public leerAcordeFormatoEscrito(String nombre) {
		this.nombreAcorde = new StringBuilder(nombre);
		freqs = new ArrayList<Float>();
	}

	public ArrayList<Float> leerString() {

		/**
		 * Este metodo convierte una string que contenga un acorde expresado de la
		 * manera en la que se concreta debajo. a un conjunto de frecuencias.
		 * 
		 * Devuelve null si hay algun error.
		 * 
		 * 
		 * Requisitos que ha de cumplir la string cadena:
		 * 
		 * +La fundamental va en formato: La, Lab o A#; no LA, a o la. +El modo va en
		 * formato: m, M, " ", dim o aug. +La extensiones tienen que indicar el valor de
		 * un intervalo, como por ejemplo el de tercera menor. Ej: 4aug para añadir
		 * tritono o 7maj para séptima mayor. +La inversión debe ir en el mismo formato
		 * que la fundamental y ir despues de /.
		 *
		 * Ej: La#m6/Do
		 */

		System.out.println(this.nombreAcorde);
		

		// Fundamental
		if(buscaFundamental()==true) {
			//Ya tenemos frecuencia de fundamental
			System.out.println("Fundamental :" + freqs.get(0));
		}else {
			System.out.println("ERROR: No hay fundamental");
			return null;
		}

		
		// modo
		// Puede ser:m, dim, aug, sus2, sus4 o no tener

		String modo = new String(buscaModo());
		System.out.println("Modo: " + modo);

		// Inversiones
		String inversion = new String(buscaInversion());
		System.out.println("Inversion: " + inversion);

		// Doble extensiones
		String dobleExtension = new String(buscaDobleExtension());
		System.out.println("Add: " + dobleExtension);

		// Extensiones
		String extension = new String(buscaExtension());
		System.out.println("Extension: " + extension);


		// return parametros;
	}

	private boolean buscaFundamental() {
		/**
		 * Busca una fundamental al principio de la string
		 * 
		 * Devuelve null si no se ha encontrado coincidencias
		 */

		StringBuilder probandoFundamental;

		// Compruebo con 4, 3 y 2 letras
		for (int i = 4; i >= 1; i--) {
			probandoFundamental = new StringBuilder(nombreAcorde.substring(0, i));
			float freq=nota2freq(probandoFundamental.toString());
			if (freq != 0.0) {
				freqs.add(freq);
				nombreAcorde.delete(0, probandoFundamental.length());
				return true;
			}
		}

		// No he encontrado
		return false;
	}
	
	private boolean buscaModo() {
		/**
		 * Busca una fundamental al principio de la string
		 * 
		 * Devuelve null si no se ha encontrado coincidencias
		 */

		StringBuilder probandoModo;

		// Compruebo con 4, 3 y 2 letras
		for (int i = 4; i >= 0; i--) {
			probandoModo = new StringBuilder(nombreAcorde.substring(0, i));
			 float[] freqsModo=Modos.modo2freq(probandoModo.toString(), freqs.get(0));
			if (freq != 0.0) {
				freqs.add(freq);
				nombreAcorde.delete(0, probandoModo.length());
				return true;
			}
		}

		// No he encontrado
		return false;
	}

	private String buscaInversion() {
		/**
		 * Busca la inversión del acorde al final de la string
		 * 
		 * Devuelve null si no se ha encontrado coincidencias
		 */

		int indexOf = nombreAcorde.indexOf("/"); // Buscamos "/" y guardamos donde esta

		if (indexOf != -1) {
			return null;
		}

		StringBuilder probandoInversion = new StringBuilder(
				nombreAcorde.substring(indexOf + 1, nombreAcorde.length() - 1));
		
		if (nota2freq(probandoInversion.toString()) != 0.0) {
			nombreAcorde.delete(indexOf, nombreAcorde.length());
			return probandoInversion.toString();
		}
		// No he encontrado
		return null;
	}

	private String buscaExtension() {

		StringBuilder probandoExtension;
		
		for(int i=1; i<=4; i++) {
			probandoExtension=new StringBuilder(nombreAcorde.substring(nombreAcorde.length()-1-i, nombreAcorde.length()-1));
			if (extension2Intervalo(probandoExtension.toString()) != 0.0) {
				nombreAcorde.delete(indexOf, nombreAcorde.length());
				return probandoInversion.toString();
			}
			
		}


	}

	private String buscaDobleExtension() {
		int indexOf = nombreAcorde.indexOf("add"); // Buscamos "add" y guardamos donde esta

		if (indexOf != -1) {
			String dobleExtension = nombreAcorde.substring(indexOf, nombreAcorde.length());
			nombreAcorde.delete(indexOf, nombreAcorde.length());
			System.out.println("La doble extension es: " + dobleExtension);
		}

		return dobleExtension;
	}

}
