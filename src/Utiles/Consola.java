package Utiles;

public class Consola {
	static void mostrC(String mensaje) {
		System.out.println(mensaje);
	}

	static void borrarC() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
}
