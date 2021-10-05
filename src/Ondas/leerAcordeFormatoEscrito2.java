package Ondas;

import static Tablas.Notas.nota2freq;
import Tablas.DobleExtension;
import Tablas.Extensiones;
import Tablas.Modos;

import java.util.ArrayList;

public class leerAcordeFormatoEscrito2 {

	private StringBuilder nombreAcorde;
	ArrayList<Float> freqs;
	String modo;

	public leerAcordeFormatoEscrito2(String nombre) {
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
		if (buscaFundamental() == true) {
			// Ya tenemos frecuencia de fundamental
			System.out.println("Fundamental :" + freqs.get(0));
		} else {
			System.out.println("ERROR: No hay fundamental");
			return null;
		}

		// modo
		// Puede ser:m, dim, aug, sus2, sus4 o no tener
		
		String modo;
		if (buscaModo() == true) {
			// Ya tenemos frecuencia de fundamental
			System.out.println("Modo :" + freqs.get(1));
			System.out.println("Modo :" + freqs.get(2));
			modo=
		}

		// Inversione
		System.out.println(nombreAcorde);
		System.out.println(buscaInversion());

		System.out.println(freqs);
		System.out.println(nombreAcorde);

		// Doble extensiones
		if (buscaDobleExtension() == true)
			System.out.println("Add :" + freqs.get(4));

		// Extensiones
		if (buscaDobleExtension() == true)
			System.out.println("Extension :" + freqs.get(5));
		return freqs;

		// return parametros;
	}

	//
	boolean buscaFundamental() {
		/**
		 * Busca una fundamental al principio de la string
		 * 
		 * Devuelve null si no se ha encontrado coincidencias
		 */

		StringBuilder probandoFundamental;

		// Compruebo con 4, 3 y 2 letras
		for (int i = 4; i >= 1; i--) {
			probandoFundamental = new StringBuilder(nombreAcorde.substring(0, i));
			float freq = nota2freq(probandoFundamental.toString());
			if (freq != 0.0) {
				freqs.add(freq);
				nombreAcorde.delete(0, probandoFundamental.length());
				return true;
			}
		}

		// No he encontrado
		return false;
	}

	//
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
			System.out.println("PRuebo con: " + probandoModo);
			float[] freqsModo = Modos.modo2freq(probandoModo.toString(), freqs.get(0));

			if (freqsModo != null) {
				for (int j = 0; j < freqsModo.length; j++) {
					freqs.add(freqsModo[j]);
				}
				nombreAcorde.delete(0, probandoModo.length());
				return true;
			}
			else {
				this.modo="";
			}
		}

		// No he encontrado
		return false;
	}

	private boolean buscaInversion() {
		/**
		 * Busca la inversión del acorde al final de la string
		 *
		 * Devuelve null si no se ha encontrado coincidencias
		 */

		int indexOf = nombreAcorde.indexOf("/"); // Buscamos "/" y guardamos donde
		// esta

		if (indexOf == -1) {
			System.out.println("No hay /");
			return false;
		}

		StringBuilder probandoInversion = new StringBuilder(nombreAcorde.substring(indexOf + 1, nombreAcorde.length()));
		System.out.println(probandoInversion);
		float nota = nota2freq(probandoInversion.toString());
		System.out.println(nota);
		if (nota != 0.0) {

			freqs.add(nota);
			nombreAcorde.delete(indexOf, nombreAcorde.length());
			return true;
		}
		// No he encontrado
		return false;
	}

	private boolean buscaDobleExtension() {
		int lastindexOf = nombreAcorde.lastIndexOf("add"); // Buscamos "add" y guardamos
		// donde esta

		if (lastindexOf != -1) {
			System.out.println("Hay add");
			String dobleExtension = nombreAcorde.substring(lastindexOf, nombreAcorde.length());

			float intervalo = DobleExtension.add2freq(dobleExtension);
			if (intervalo != 0) {
				freqs.add(intervalo * freqs.get(0));
				System.out.println("La freq de add es " + intervalo * freqs.get(0));
				nombreAcorde.delete(lastindexOf, nombreAcorde.length());
				return true;
			} else {
				System.out.println("Hay un add pero no reconozco el numero");
			}
		}
		return false;
	}

	private String buscaExtension() {

		StringBuilder probandoExtension;
		Extensiones.extension2Intervalo(extension, modo)


	}

}
