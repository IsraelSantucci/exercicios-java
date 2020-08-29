package com.santucci.manipulandodata.classecalendar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		int dia,mes,ano;
		boolean informacoesInvalidas = true;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("data de vencimento: ");
		System.out.println("dia: ");
		dia = scan.nextInt();
		
		System.out.println("Mes: ");
		mes = scan.nextInt();
		
		System.out.println("Ano: ");
		ano = scan.nextInt();
		
		Calendar data = Calendar.getInstance();
		data.set(ano,mes-1,dia,0,0,0);
		
		
		
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
	
		System.out.println("Dia de Vencimento:" + formatador.format(data.getTime()));
		
		//adicionado os 10 dias para combranca sem juros
		data.add(Calendar.DATE, 10);
		
		System.out.println(formatador.format(data.getTime()));
		checarFimDeSemana(data);
		System.out.println("ultimo dia para pagar sem juros apos o Vencimento: " 
										+ formatador.format(data.getTime()) );
	}
	
	public static void checarFimDeSemana(Calendar data) {
		if(data.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
			data.add(Calendar.DATE, 1);
			System.out.println("domingo");
			System.out.println("Voce tem: 11 dias para pagar");
			return;
		}
		
		if(data.DAY_OF_WEEK == Calendar.SATURDAY) {
			data.add(Calendar.DATE, 2);
			System.out.println("Sabado");
			System.out.println("Voce tem: 12 dias para pagar");
			return;
		}
		System.out.println("Voce tem: 10 dias para pagar");
	}
}
