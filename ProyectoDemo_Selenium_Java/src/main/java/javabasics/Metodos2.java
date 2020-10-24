package javabasics;

import java.util.ArrayList;
import java.util.List;

public class Metodos2 {

	static String heredar = "-- Mensaje de Texto";

	//Metodos protected no se pueden ver desde otras clases a menos de que se esten Heredando
	protected static List<String> listaNombres() {
		List<String> listaNombres = new ArrayList<>();
		listaNombres.add("W");
		listaNombres.add("W");
		listaNombres.add("T");
		listaNombres.add("D");
		return listaNombres;
	}

	protected static List<Integer> listaNumeros() {
		List<Integer> listaNumeros = new ArrayList<>();
		listaNumeros.add(1);
		listaNumeros.add(12);
		listaNumeros.add(6);
		listaNumeros.add(78);
		listaNumeros.add(12);
		return listaNumeros;
	}
}
