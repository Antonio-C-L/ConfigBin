package clases;

import java.io.Serializable;

public class Configuracion implements Serializable{
	private boolean bool;
	private char letra;
	private double num;
	private String string;
	
	public Configuracion() {
		this.bool = true;
		this.letra = 'a';
		this.num = 0.4;
		this.string = "hola mundo";
	}

	public boolean isBool() {
		return bool;
	}

	public char getC() {
		return letra;
	}

	public double getNum() {
		return num;
	}

	public String getString() {
		return string;
	}
	
	
}
