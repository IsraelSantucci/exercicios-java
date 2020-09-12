package com.santucci.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class ExercicioHashSet {

	public static void main(String[] args) {
		Set<String> conjunto = new HashSet<>();
		
		conjunto.add("Larissa");
		conjunto.add("Ana");
		conjunto.add("Camila");
		conjunto.add("Flavia");
		conjunto.add("Bruna");
		conjunto.add("Fernanda");
		
		conjunto.add("Ana");
		
		System.out.println(conjunto);
		
		System.out.println("O conjunto tem o nome 'Ana'? " +  conjunto.contains("Ana"));
		
		System.out.println("O conjunto tem o nome 'Ricardo'? " + conjunto.contains("Ricardo"));
		
		conjunto.remove("Camila");
		
		System.out.println(conjunto);
		
		Iterator<String> iterador = conjunto.iterator();
		
		while (iterador.hasNext()) {
			System.out.print(iterador.next() + " ");
		}

		System.out.println();
	}

}
