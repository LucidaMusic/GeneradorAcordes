package Tablas;

import static Tablas.Intervalos.intervalo2Decimal;

public class Modos {
	public static float[] modo2freq(String modo, float fundamental) {
		/**
		 * Este metodo devuelve un conjunto de frecuencias pertenecientes al acorde
		 * considerando su modo. Este valor se expresara en Hz. Segun la armonia
		 * clasica, al modo mayor le corresponde una tercera mayor, equivalente a 5/4
		 * respecto la fundamental. En el otro caso, la tercera es menor, equivalente a
		 * 6/5.
		 * 
		 * Si el parametro modo es incorrecto, devuelve 0. Si no contiene nada, se
		 * supone modo mayor.
		 */
		System.out.println("Me han pasado este modo " + modo);
		float[] freqs = new float[2];
		if (modo.length() == 2) {
			return null;
		}
		switch (modo) {
		case "":
			freqs[0] = fundamental * intervalo2Decimal(4); // Tercera mayor
			freqs[1] = fundamental * intervalo2Decimal(7); // Quinta justa
			return freqs;
		case "m":
			freqs[0] = fundamental * intervalo2Decimal(3); // Tercera menor
			freqs[1] = fundamental * intervalo2Decimal(7); // Quinta justa
			System.out.println(freqs[0]);
			System.out.println(freqs[1]);
			return freqs;
		case "dim":
			freqs[0] = fundamental * intervalo2Decimal(3); // Tercera menor
			freqs[1] = fundamental * intervalo2Decimal(6); // Quinta disminuida
			return freqs;
		case "aug":
			freqs[0] = fundamental * intervalo2Decimal(4); // Tercera mayor
			freqs[1] = fundamental * intervalo2Decimal(8); // Quinta augmentada
			return freqs;
		case "sus2":
			freqs[0] = fundamental * intervalo2Decimal(2); // Segunda menor
			freqs[1] = fundamental * intervalo2Decimal(7); // Quinta justa
			return freqs;
		case "sus4":
			freqs[0] = fundamental * intervalo2Decimal(5); // Cuarta Justa
			freqs[1] = fundamental * intervalo2Decimal(7); // Quinta justa
			return freqs;
		default:
			return null;
		}

	}

}
