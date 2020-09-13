package com.santucci.collections.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Comparator;

public class ExemploStreamAPI {

	public static void main(String[] args) {
		
		List<String> estudantes = new ArrayList<>();
		
		estudantes.add("Mariaw");
		estudantes.add("Pedrow");
		estudantes.add("Thaysew");
		estudantes.add("Marcelow");
		estudantes.add("Carlaw");
		estudantes.add("Julianaw");
		estudantes.add("Tiagow");
		estudantes.add("Rafaelw");
		estudantes.add("Anaw");
		
		//retorna a contagem de elementos do stream
		System.out.println(estudantes.stream().count());
		
		//retorna os elementos com o maior numero de letras
		System.out.println(estudantes.stream().max((primeiro, segundo) -> primeiro.length() - segundo.length()));
		System.out.println(estudantes.stream().max(Comparator.comparingInt(String::length)));
		
		//retorna os elementos com o menor numero de letras
		System.out.println(estudantes.stream().min((primeiro, segundo) -> primeiro.length() - segundo.length()));
		System.out.println(estudantes.stream().min(Comparator.comparingInt(String::length)));
		
		//retorna os elementos que tem a letra r no nome
		System.out.println("Estudantes com a letra r no nome: " + estudantes.stream().filter((estudante) -> estudante.toLowerCase().contains("r")).collect(Collectors.toList()));
		System.out.println("Estudante com a letra l no nome: " + estudantes.stream().filter((estudante) -> estudante.toLowerCase().contains("l")).collect(Collectors.toList()) );
		
		//retorna uma nova coleção, com nomes concatenados a quantidade de letras de cada nome
		System.out.println(estudantes.stream().map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));
		System.out.println(estudantes.stream().map(estudante -> estudante.concat(" = ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));
	
		List<String> lista = estudantes.stream().map(estudante -> estudante.concat(".").concat(String.valueOf(estudante.length()))).collect(Collectors.toList());
		System.out.println(lista);
		
		//retornar o 3 primeiros nomes
		System.out.println("Os 3 primeiro nomes: " + estudantes.stream().limit(3).collect(Collectors.toList()));
		
		//exibe cada elemento no console e depois retorna a propria coleção
		System.out.println("Retorna os elementos: " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));
	
		//exibe cada elemento no console sem retornar outra coleção
		System.out.println("Exibe os elementos novamente: ");
		estudantes.stream().forEach(System.out::println);
		
		//retorna true se todos os elementos tiver a letra w
		System.out.println("Todos os elementos tem o w no nome: " + estudantes.stream().allMatch(estudante -> estudante.contains("w"))); //all match todos combinam
	
		//retorna true se algum elemento tiver a letra e no nome
		System.out.println("Algum nome tem a letra e no nome: " + estudantes.stream().anyMatch((estudante) -> estudante.contains("e")));
		
		//retorna true se nenhum elemento tiver a letra z no nome
		System.out.println("nao tem nenhum elemento com a letra minuscula z no nome: " + estudantes.stream().noneMatch((estudante)-> estudante.contains("z")));
		
		//retorna o primeiro elemento da coleção, se existir exibe no console
		System.out.print("Retorna o primeiro elemento da coleção: ");
		estudantes.stream().findFirst().ifPresent(System.out::println);
		
		//exemplo de operação encadeada
		System.out.println("Operação encadeada: ");
		System.out.println(estudantes.stream()
			.peek(System.out::println)
			.map(estudante->
					estudante.concat(" - ").concat(String.valueOf(estudante.length())))
			.peek(System.out::println)
			.filter(estudante->estudante.toLowerCase().contains("r"))
//			.collect(Collectors.toList())
//			.collect(Collectors.joining(","))
//			.collect(Collectors.toSet())
			.collect(Collectors.groupingBy(estudante->estudante.substring(estudante.indexOf("-")+1)))
		);
		
	}

}
