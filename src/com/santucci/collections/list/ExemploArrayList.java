package com.santucci.collections.list;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class ExemploArrayList {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		
		nomes.add("João");
		nomes.add("Cristina");
		nomes.add("Maria");
		nomes.add("Pedro");
		nomes.add("Carlos");
		nomes.add("Ana");
		nomes.add("Tereza");
		
		System.out.println(nomes);
		
		Collections.sort(nomes);
		
		System.out.println(nomes);
		
		nomes.set(2,"Cristiane");
		
		
		int posicao = nomes.indexOf("João");
		
		System.out.println("posicao de João : " + posicao);
		
		System.out.println(nomes);
		
		nomes.remove(3);
		
		System.out.println(nomes);
		
		nomes.remove("Ana");
		
		System.out.println(nomes);
		
		int tamanho = nomes.size();
		
		System.out.println(tamanho);
		
		System.out.println(nomes.contains("Ana"));
		System.out.println(nomes.contains("Anna"));
		
		System.out.println(nomes.get(1));
		
		for(String nome : nomes) {
			System.out.print(nome + " ");
		}

		System.out.println();
		
		Iterator<String> iterator = nomes.iterator();
		
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + "  ");
		}
		
		System.out.println();
		nomes.clear();
		
		System.out.println(nomes);
	}

}
