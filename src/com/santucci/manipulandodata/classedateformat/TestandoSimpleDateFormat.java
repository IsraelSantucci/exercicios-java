package com.santucci.manipulandodata.classedateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestandoSimpleDateFormat {

	public static void main(String[] args) {
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		Date data = new Date();
		
		System.out.println(data);
		//Sat Aug 29 17:28:09 BRT 2020
		
		System.out.println(formatador.format(data));
		//28,08,2020
		
		
		String[] datas = new String(formatador.format(data)).split("/");
		
		int dia = Integer.parseInt(datas[0]);
		System.out.println("Dia: " + dia);
		
		int mes = Integer.parseInt(datas[1]);
		System.out.println("mes: " + mes);
		
		int ano = Integer.parseInt(datas[2]);
		System.out.println("ano: " + ano);
		
		SimpleDateFormat  formatador2 = new SimpleDateFormat("'minha data formatada: 'dd 'de' MMMM"
				+ " 'de' yyyy G 'hora:' kk 'horas e' mm 'minutos' EEEE");
		System.out.println(formatador2.format(data));
		
	}
}
