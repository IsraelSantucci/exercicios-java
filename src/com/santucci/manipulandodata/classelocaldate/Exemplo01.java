package com.santucci.manipulandodata.classelocaldate;

import java.time.LocalDate;
import java.time.LocalTime;

public class Exemplo01 {

	public static void main(String[] args) {
		
		LocalDate agora = LocalDate.now();
		System.out.println(agora);
		//2020-08-29
		
		LocalTime hora = LocalTime.now();
		
		System.out.println(hora.getHour());
	
		
	}

}
