package com.santucci.collections.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String> conjuntoOrdenado = new LinkedHashSet<>();
		
		conjuntoOrdenado.add("Patricia");
		conjuntoOrdenado.add("Caio");
		conjuntoOrdenado.add("Cintia");
		conjuntoOrdenado.add("Celsio");
		conjuntoOrdenado.add("Eloisa");
		conjuntoOrdenado.add("Mateus");
		
		System.out.println(conjuntoOrdenado);
		
		System.out.println("O Conjuto esta vazio? " + conjuntoOrdenado.isEmpty() );
		
		conjuntoOrdenado.remove("Celsio");
		
		System.out.println(conjuntoOrdenado);
		
		Iterator<String> iterador = conjuntoOrdenado.iterator();
		
		while(iterador.hasNext()) {
			System.out.print(iterador.next() + " ");
		}
		
		System.out.println();
		
		conjuntoOrdenado.clear();
		
		System.out.println(conjuntoOrdenado);
	}

}
