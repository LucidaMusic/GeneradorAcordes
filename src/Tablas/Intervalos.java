package Tablas;

public class Intervalos {
	public static float intervalo2Decimal(int intervalo) {
		/**
		 * Este metodo recibe un entero que simboliza un intervalo. Devuelve el intervalo en tipo float, 
		 * numero que corresponde al numero por el que habría que multiplicar la frecuencia de una nota para obtener
		 * la frecuencia de una nota que esté a dicho intervalo respecto la primera.
		 * 
		 * Todo esto se basa en el modelo de entonacion justo orientado a 12 notas por octava.
		 *  Intervalos:             
		 *  Segunda menor     - 1
		 *  Segunda Mayor     - 2 [Quinta sobre quinta bajada una octava]
		 *  Tercera menor     - 3 [6/5]
		 *  Tercera Mayor     - 4 [5/4]
		 *  Cuarta justa      - 5 [Quinta invertida]
		 *  Cuarta Aumentada o 
		 *  Quinta disminuida - 6
		 *  Quinta justa      - 7 [Relación 3/2]
		 *  Sexta menor       - 8 [Tercera menor sobre cuarta]
		 *  Sexta Mayor       - 9 [Tercera mayor sobre cuarta]
		 *  Septima menor     - 10 [Quinta justa sobre tercera menor]
		 *  Septima Mayor     - 11 [Quinta justa sobre tercera mayor
		 *  Octava            - 12 [2/1]
		 *  Novena menor      - 13
		 *  Novena Mayor      - 14 [Quinta sobre quinta]
		 *  Decima menor      - 15 [Tercera menor por dos]
		 *  Decima mayor      - 16 [Tercera mayor por dos]
		 *  Onceava           - 17 [Tercera menor sobre quinta sobre quinta]
		 *  Onceava aumentada - 18 [Tercera mayor sobre quinta sobre quinta]
		 *  Doceava           - 19 [Cuarta sobre quinta sobre quinta]
		 *  Treceava menor    - 20 [Sexta menor por dos]*
		 *  Treceava Mayor    - 21 [Quinta sobre quinta sobre quinta]
		 *  7º de dominante   - 40 [7/4, Septima natural]
		 *  7º de disminuido  - 41 [7/5, relacion entre armónicos 7 y 5]
		 * 
		 */
		switch (intervalo) {
		case 1:
			return 16f / 15f;
		case 2:
			return 1.125f;
		case 3:
			return 1.2f;
		case 4:
			return 1.25f;
		case 5:
			return 4 / 3f;
		case 6:
			return 1.4f;
		case 7:
			return 1.5f;
		case 8:
			return 1.6f;
		case 9:
			return 5f / 3f;
		case 10:
			return 1.8f;
		case 11:
			return 1.875f;
		case 12:
			return 2f;
		case 13:
			return 2 * 16f / 15f;
		case 14:
			return 2 * 9f / 8f;
		case 15:
			return 2 * 6f / 5f;
		case 16:
			return 2 * 5f / 4f;
		case 17:
			return 2.7f;
		case 18:
			return 2.8125f;
		case 19:
			return 2 * 3f / 2f;
		case 20:
			return 1.5f * 1.5f * 1.5f;
		case 21:
			return 3.375f;
		case 40:
			return 7f / 4f; // Septima de dominante
		case 41:
			return 42f / 25f; // Septima de disminuido

		default:
			return 0.0f;

		}
	}

	static float primeroDeArray(float[] array) {
		return array[0];

	}
}
