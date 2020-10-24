package javabasics;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class MainMetodos extends Metodos2 {

	public static void main(String[] args) {
		Metodos nombreObjeto = new Metodos();
		Metodos nombreObjeto2 = new Metodos(2, 9);


		System.out.println(nombreObjeto2.sumatoria());
		System.out.println(nombreObjeto.sumatoria());
		
		System.out.println("Variable Heredada de Metodos2 " + heredar);
		nombreObjeto.mostrarMensaje();

		String elementoGuardado = nombreObjeto.mostrarNombre("Brayan");

		System.out.println(elementoGuardado);

		Metodos.prueba();

		List<String> listaNombres = listaNombres();
		List<Integer> listaNumeros = listaNumeros();

		for (String nombre : listaNombres) {
			System.out.println(nombre);

		}
		System.out.println("For con dos puntos");

		for (int indice = 0; indice < listaNombres.size(); indice++) {
			System.out.println(listaNombres.get(indice));
		}
		System.out.println("For con index");

		List<String> nombreSinDuplicados = listaNombres.stream().distinct().collect(Collectors.toList());
		Collections.sort(nombreSinDuplicados);
		System.out.println("Nombres sin duplicados " + nombreSinDuplicados);

//		List<String> OrdenarAtrasDelante = listaNombres.stream().collect(Collectors.toList());
//		OrdenarAtrasDelante = (List<String>) Collections.reverse(OrdenarAtrasDelante);
//		System.out.println("Nombres ordenados de atras hacia adelante " + OrdenarAtrasDelante);

		System.out.println("Lista de numero mayor: " + Collections.max(listaNumeros));
		System.out.println("Lista de numero menor: " + Collections.min(listaNumeros));
		Collections.sort(listaNumeros);
		System.out.println("Imprimir lista " + listaNumeros);
		Collections.sort(listaNumeros, Collections.reverseOrder());
		System.out.println(listaNumeros);

		Object last = null;
		int numCount = 0;
		Iterator<Integer> i = listaNumeros.iterator();

		// hashNext va iterando cada uno y nos da un elemento booleano
		while (i.hasNext()) {
			Object temp = i.next();
			if (temp.equals(last)) {
				i.remove();
				numCount++; // numCount = numCount + 1;
			} else {
				last = temp;
			}

		}
		System.out.println(numCount);
		System.out.println("Ciclo para remover los objetos iguales: " + listaNumeros);
	}// fin del main

}
