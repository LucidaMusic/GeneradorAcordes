package Tablas;

public class DobleExtension {
	public static float add2freq(String add) {
		switch (add) {
		case "add2":
			return Intervalos.intervalo2Decimal(2);

		case "add4":
			return Intervalos.intervalo2Decimal(5);

		case "add6":
			return Intervalos.intervalo2Decimal(9);

		case "add9":
			return Intervalos.intervalo2Decimal(14);

		case "add11":
			return Intervalos.intervalo2Decimal(17);

		case "add13":
			return Intervalos.intervalo2Decimal(21);
		}
		return 0;

	}
}
