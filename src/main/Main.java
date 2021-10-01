package main;

import java.util.ArrayList;
import java.util.List;

import clases.Configuracion;
import fileAccess.FileAccess;
import menu.Menu;

public class Main {
	/*
	 	Hacer un programa que guarde un fichero de
		configuración config.bin Debe contener:
		- 1 booleano, 1 char, 1 double y 1 string de 
		longitud 10.
		El programa mostrará las siguientes opciones:
		1 Mostrar datos de configuración.
		2 Modificar booleano.
		3 Modificar char.
		...
		0 Salir.
	 */
	private static boolean bool=true;
	private static char letra='a';
	private static double num=0.4;
	private static String string="hola mundo";
	public static void main(String[] args) {
		List<Object> lista=new ArrayList<>();
		lista.add(bool);
		lista.add(letra);
		lista.add(num);
		lista.add(string);
		FileAccess fa=new FileAccess();
		fa.crearFichero(lista);
		System.out.println(fa.buscarDato("char").toString());

	}

	
	
}
