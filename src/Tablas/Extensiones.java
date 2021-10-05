package Tablas;

import java.util.ArrayList;
import static Tablas.Intervalos.intervalo2Decimal;

public class Extensiones {
	public static ArrayList<Float> extension2Intervalo(String extension, String modo) {
		/**
		 * Este metodo convierte la expresion correspondiente a la extension de un
		 * acorde a las frecuencias adecuadas
		 * 
		 * Devuelve [0] cuando la extension no se ha entendido
		 */
		ArrayList<Float> intervalos = new ArrayList<Float>();

		if (extension.length() == 1) {
			System.out.println("Mido 1");
			switch (extension) {

			case "6":
				intervalos.add(intervalo2Decimal(9)); // sexta mayor
				return intervalos;

			case "7":
				if (modo == "mayor") // COnsideramos septima de dominante
					intervalos.add(intervalo2Decimal(40));
				else if (modo == "dim")
					intervalos.add(intervalo2Decimal(41));
				else if (modo == "menor")
					intervalos.add(intervalo2Decimal(10));
				return intervalos;

			case "9":
				intervalos.add(intervalo2Decimal(14)); // Novena mayor
				intervalos.add(extension2Intervalo("7", modo).get(0)); // Septima menor
				System.out.println("Clase" + intervalos);
				return intervalos;

			}
		}

		if (extension.length() == 2) {
			
			switch (extension) {

			case "6m":
				intervalos.add(intervalo2Decimal(8));// sexta menor
				return intervalos;
				
			case "11":
				if (modo == "menor")
					intervalos.add(intervalo2Decimal(17)); // Onceava
				else if (modo == "mayor")
					intervalos.add(intervalo2Decimal(18)); // Onceava aumentada

				for (int i = 0; i <= 1; i++)
					intervalos.add(extension2Intervalo("9", modo).get(i));

				return intervalos;

			case "13":
				intervalos.add(intervalo2Decimal(21));
				for (int i = 0; i <= 2; i++)
					intervalos.add(extension2Intervalo("11", modo).get(i));

				return intervalos;

			}

			if (extension.length() == 4) {
				switch (extension) {
				case "maj7":
					intervalos.add(intervalo2Decimal(11));
					int a = 0;
					return intervalos;

				case "min9":
					intervalos.add(intervalo2Decimal(13)); // Novena menor
					intervalos.add(extension2Intervalo("7", modo).get(0)); // Septima menor
					return intervalos;

				}
			}
		}

		intervalos.add((float) 0);
		return intervalos;
	}
}
