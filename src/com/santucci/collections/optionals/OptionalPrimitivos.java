package com.santucci.collections.optionals;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class OptionalPrimitivos {

	public static void main(String[] args) {

		System.out.println("+++ valor inteiro opcional +++");
		OptionalInt.of(54).ifPresent(System.out::println);
		
		System.out.println("+++ valor decimal opcional +++");
		OptionalDouble.of(14.21).ifPresent(System.out::println);
		
		System.out.println("+++ valor longo opcional +++");
		OptionalLong.of(35L).ifPresent(System.out::println);
	}

}
