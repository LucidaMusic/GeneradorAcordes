package Ondas;

import java.util.Arrays;
import java.util.List;

public class Pizarra {
	private String nombre;
	
	Pizarra(String nombre2){
		nombre=nombre2;
	}
	
	public static void main(String args[]) {
		String cadena=new String("a7a7");
		String[] cadena2 = cadena.split("");
		
		//necesito saber donde esta el numero
		int posNum=-1;
		
		Encuentro_Numero: 
			for(int i=0;i<cadena2.length;i++) {

			switch (cadena2[i]) {
			case "1":
				posNum = i;
				break Encuentro_Numero;
			case "2":
				posNum = i;
				break Encuentro_Numero;
			case "3":
				posNum = i;
				break Encuentro_Numero;
			case "4":
				posNum = i;
				break Encuentro_Numero;
			case "5":
				posNum = i;
				break Encuentro_Numero;
			case "6":
				posNum = i;
				break Encuentro_Numero;
			case "7":
				posNum = i;
				break Encuentro_Numero;
			case "8":
				posNum = i;
				break Encuentro_Numero;
			case "9":
				posNum = i;
				break Encuentro_Numero;
			case "0":
				posNum = i;
				break Encuentro_Numero; //No se ha encontrado ningun numero
			}
		}
		//Tengo el numero donde esta el numero
		if(posNum==-1) {
			System.out.println("No he encontrado el numero");
		}
		System.out.println(posNum);

	}	

	
	void hola() {
		String nombre = "ANA".charAt(0)+"ANA".substring(1).toLowerCase();
		System.out.println(nombre);
	}
}
