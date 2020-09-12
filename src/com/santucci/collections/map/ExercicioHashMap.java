package com.santucci.collections.map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;

public class ExercicioHashMap {

	public static void main(String[] args) {
		
		Map<Integer,String> alunos = new HashMap<>();
		
		alunos.put(2, "Tânia");
		alunos.put(1, "Gabriel");
		alunos.put(4, "Laila");
		alunos.put(8, "Marcos");
		alunos.put(3, "Tiago");
		alunos.put(5, "Tiago");
		
		System.out.println(alunos);
		
		System.out.println("Alunos com a chave 4: " + alunos.get(4));
		
		System.out.println("A Estrutura conten o aluno Tiago: " + alunos.containsValue("Tiago"));
		
		System.out.println(alunos.replace(5, "Cesar"));
		
		System.out.println(alunos);
		
		System.out.println("Quantidade: " + alunos.size());
		
		for (Map.Entry<Integer, String> entry : alunos.entrySet()) {
			System.out.print(entry.getKey() + " - " + entry.getValue() + " | ");
		}
		
		System.out.println();
		
		for(int key : alunos.keySet()) {
			System.out.print(key + "." + alunos.get(key) + " | ");
		}
		
		System.out.println();
	}

}
