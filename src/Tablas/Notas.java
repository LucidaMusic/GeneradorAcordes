package Tablas;

public class Notas {
	public static float nota2freq(String nota) {
		/**
		 * Este metodo recibe un String que deberia contener un nombre de nota, ya sea
		 * en nomenclatura espanola (Do, Re, Mi...) o americana (C, D, E...). Devuelve
		 * el valor de frecuencia (Hz) que corresponda a la determinada nota,
		 * considerando unicamente la octava que comprende desde el Mi3 hasta el Re#4,
		 * entendiendo el La 440 como un La4. Se considera Temperamento Igual (o tambien
		 * conocido como 12-EDO). Soporta enarmonia y alteraciones para cada nota.
		 * 
		 * A la hora de buscar coincidencias, tan solo compara las posibilidades que
		 * compartan numero de caracteres para ganar en eficiencia.
		 * 
		 * Devuelve 0.0 cuando el String introducido no se reconoce.
		 */
		System.out.println("Me han pasado esta nota "+nota);
		if (nota.length() == 4) {
			switch (nota) {
			case "Solb":
				return 369.994f;
			case "Sol#":
				return 415.305f;
			}
		}

		if (nota.length() == 3) {
			switch (nota) {
			case "Fab":
				return 329.628f;
			case "Mi#":
				return 349.228f;
			case "Fa#":
				return 369.994f;
			case "Sol":
				return 391.995f;
			case "Lab":
				return 415.305f;
			case "La#":
				return 466.164f;
			case "Sib":
				return 466.164f;
			case "Dob":
				return 493.883f;
			case "Si#":
				return 523.251f;
			case "Do#":
				return 554.365f;
			case "Reb":
				return 554.365f;
			case "Re#":
				return 622.254f;
			case "Mib":
				return 622.254f;
			}
		}

		if (nota.length() == 2) {
			System.out.println("Mido 2");
			switch (nota) {
			case "Mi":
				return 329.628f;
			case "Fa":
				return 349.228f;
			case "La":
				return 440;
			case "Si":
				return 493.883f;
			case "Do":
				return 523.251f;
			case "Re":
				return 587.330f;
			case "Fb":
				return 329.628f;
			case "E#":
				return 349.228f;
			case "F#":
				return 369.994f;
			case "Gb":
				return 369.994f;
			case "G#":
				return 415.305f;
			case "Ab":
				return 415.305f;
			case "A#":
				return 466.164f;
			case "Bb":
				return 466.164f;
			case "Cb":
				return 493.883f;
			case "B#":
				return 523.251f;
			case "C#":
				return 554.365f;
			case "Db":
				return 554.365f;
			case "D#":
				return 622.254f;
			case "Eb":
				return 622.254f;
			}
		}

		if (nota.length() == 1) {
			switch (nota) {
			case "E":
				return 329.628f;

			case "F":
				return 349.228f;

			case "G":
				return 391.995f;

			case "A":
				return 440;

			case "B":
				return 493.883f;

			case "C":
				return 523.251f;

			case "D":
				return 587.330f;
			}

		}

		// No hay coincidencias
		//		System.out.println("Eso no es un nombre de nota que yo entienda");
		return 0;
	}

}
