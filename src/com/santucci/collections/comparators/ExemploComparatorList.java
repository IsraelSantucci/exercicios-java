package com.santucci.collections.comparators;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class ExemploComparatorList {

	public static void main(String[] args) {
		List<Estudante> estudantes = new ArrayList<>();
		estudantes.add(new Estudante("Pedro", 19));
		estudantes.add(new Estudante("Carlos", 23));
		estudantes.add(new Estudante("Mariana", 21));
		estudantes.add(new Estudante("João", 18));
		estudantes.add(new Estudante("Tiago", 20));
		estudantes.add(new Estudante("George", 22));
		estudantes.add(new Estudante("Larissa", 21));
		
		System.out.println("--- Ordem de inserção ---");
		System.out.println(estudantes);
		
		estudantes.sort((primeiro,segundo) -> primeiro.getIdade() - segundo.getIdade() );
		
		System.out.println("--- ordem natural dos estudantes - idade ---");
		System.out.println(estudantes);
		
		estudantes.sort((primeiro,segundo) -> segundo.getIdade() - primeiro.getIdade());
		
		System.out.println("--- ordem reversa dos estudantes - idade ---");
		System.out.println(estudantes);
		
		estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
		
		System.out.println("--- ordem natura dos estudantes - idade (method reference) ---");
		System.out.println(estudantes);
		
		estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
		
		System.out.println("--- ordem reversa dos estudantes - idade (method reference) ---");
		System.out.println(estudantes);
		
		Collections.sort(estudantes);
		
		System.out.println("--- ordem natura dos estudantes - idade (Interface Comparable) ---");
		System.out.println(estudantes);
		
		Collections.sort(estudantes, new EstudanteOrdemIdadeReversaComparator());
		
		System.out.println("--- ordem reversa dos estudantes - idade (Interface Comparator) ---");
		System.out.println(estudantes);
	}
}
