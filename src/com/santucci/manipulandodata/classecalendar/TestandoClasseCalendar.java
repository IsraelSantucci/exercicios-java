package com.santucci.manipulandodata.classecalendar;

import java.util.Calendar;

public class TestandoClasseCalendar {

	public static void main(String[] args) {
		Calendar dataAtual = Calendar.getInstance();
		
		System.out.println("Data Aual: " + dataAtual.getTime());
		
		//adicionar 15 dias antes
		dataAtual.add(Calendar.DATE, -15);
		System.out.println("15 dias antes: " + dataAtual.getTime());
		
		// 5 meses depois
		dataAtual.add(Calendar.MONTH, 5);
		System.out.println("5 meses depois: " + dataAtual.getTime());
		
		//10 anos antes
		dataAtual.add(Calendar.YEAR, -10);
		System.out.println("10 anos antes: " + dataAtual.getTime());

	}

}
