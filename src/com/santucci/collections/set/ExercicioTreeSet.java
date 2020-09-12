package com.santucci.collections.set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExercicioTreeSet {

	public static void main(String[] args) {
		
		TreeSet <String> arvore = new TreeSet<>();
		
		arvore.add("Margarida");
		arvore.add("Hortencia");
		arvore.add("Lirio");
		arvore.add("Rosa");
		arvore.add("Violeta");
		arvore.add("Dalia");
		arvore.add("Orquidea");
		arvore.add("Azaleia");
		arvore.add("Girassol");
		
		System.out.println(arvore);
		
		System.out.println("Primeira flor da arvore Binaria: " + arvore.first());
		
		System.out.println("Ultimo flor da arvore: " + arvore.last());
		
		System.out.println("Tamanho da conjunto em arvore Flores: " + arvore.size());
		
		TreeSet<Integer> numeros = new TreeSet<>();
		
		numeros.add(3);
		numeros.add(9);
		numeros.add(19);
		numeros.add(23);
		numeros.add(4);
		numeros.add(21);
		numeros.add(10);
		
		System.out.println(numeros);
		System.out.println("Tamanho do conjunto em arvore numeros: " + numeros.size());
		numeros.remove(9);
		System.out.println(numeros);
		
		System.out.println("Numero abaixo de 19: " + numeros.lower(19)); //lower - mais baixo
		System.out.println("Numero acima de 10: " + numeros.higher(10)); //higher - superior
		
		Iterator<Integer> iterador = numeros.iterator();
		
		while(iterador.hasNext()) {
			System.out.print(iterador.next() + " ");
		}

	}

}
