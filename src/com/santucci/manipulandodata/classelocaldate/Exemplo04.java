package com.santucci.manipulandodata.classelocaldate;

import java.time.LocalDateTime;

public class Exemplo04 {

	public static void main(String[] args) {
		
		LocalDateTime agora = LocalDateTime.now();
		
		System.out.println(agora);
		
		LocalDateTime futuro = agora.plusDays(2).minusHours(3).minusMinutes(20);
		
		System.out.println(futuro);

	}

}
