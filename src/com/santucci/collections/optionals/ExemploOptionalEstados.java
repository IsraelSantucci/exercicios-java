package com.santucci.collections.optionals;

import java.util.Optional;

public class ExemploOptionalEstados {

	public static void main(String[] args) {
		
		Optional<String> optionalString = Optional.of("valor presente");
		
		System.out.println("Valor Opcional esta presente: ");
		optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("valor não esta presente"));
		
		Optional<String> optionalNull = Optional.ofNullable(null);
		
		System.out.println("Valor opcional que nao esta presente: ");
		optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = nao esta presente"));
		
		Optional<String> optionalEmpty = Optional.empty();
		
		System.out.println("Valor Opcional que nao esta presente: ");
		optionalEmpty.ifPresentOrElse(System.out::println, () -> System.out.println("empty = nao esta presente"));
		
		Optional<String> optionalNullErro = Optional.of(null);
		
		System.out.println("Valor opcional que lança um NullPointerException");
		optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("erro = nao esta presente"));

	}

}
