package com.santucci.manipulandodata.classelocaldate;

import java.time.LocalTime;

public class exemplo03 {

	public static void main(String[] args) {
		LocalTime hora = LocalTime.now();
	
		System.out.println(hora);
		
		LocalTime umaHoraDepois = hora.plusHours(1);
		
		System.out.println(umaHoraDepois);
	}
}
