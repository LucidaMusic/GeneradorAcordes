package Ondas;

import java.util.ArrayList;

public class Acorde {

	protected String nombre;
	protected ArrayList<Float> freqs;
	
	public Acorde(String nombre, ArrayList<Float> freqs){
		this.nombre=nombre;
		this.freqs=freqs;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Float> getFreqs() {
		return freqs;
	}

	public void setFreqs(ArrayList<Float> freqs) {
		this.freqs = freqs;
	}

}
