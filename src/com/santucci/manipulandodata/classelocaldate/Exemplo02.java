package com.santucci.manipulandodata.classelocaldate;

import java.time.LocalDate;

public class Exemplo02 {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		LocalDate ontem = hoje.minusDays(1);
		
		System.out.println(hoje);
		
		System.out.println(ontem);
	}

}
