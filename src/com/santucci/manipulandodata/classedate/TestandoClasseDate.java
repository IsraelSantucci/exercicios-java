package com.santucci.manipulandodata.classedate;

import java.util.Date;

public class TestandoClasseDate {

	public static void main(String[] args) {
		
		Date data = new Date(1598714682940L);
		System.out.println(data);
		//Sat Aug 29 12:29:36 BRT 2020
		
		Date novaData = new Date(2598714682940L);
		System.out.println(novaData);
		//Tue May 07 14:11:22 BRT 2052
		
		Date data3 = new Date(2598714682940L);
		System.out.println(novaData);
		//Tue May 07 14:11:22 BRT 2052
		
		System.out.println("----------------");
		
		//compara se a data é posterior a outra
		System.out.println(novaData.after(data));
		System.out.println(data.after(novaData));
		
		System.out.println("-----------------");
		
		//compara se a data é anterior a outra
		System.out.println(novaData.before(data));
		System.out.println(data.before(novaData));
		
		System.out.println("-----------------");
		//compara duas datas retorn -1 se forem diferente e 0 se iguais
		System.out.println(data.compareTo(data));
		System.out.println(data.compareTo(novaData));
		System.out.println(novaData.compareTo(data));
		
		System.out.println("------------------");
		System.out.println("comparando datas");
		//metodo equals mostra se os objetos sao iguais(atributos tem o mesmo valor)
		System.out.println(data.equals(novaData));
		System.out.println(data3.equals(novaData));
		
		System.out.println("------------------");
		//metodo que retorna a data em milissegundos
		System.out.println(data.getTime());
		
		System.out.println("------------------");
		//metodo para alterar a data e recebe um long para fazer isso
		Date data4 = new Date();
		System.out.println(data4);
		
		data4.setTime(0);
		System.out.println(data4);
							
		data4.setTime(9998714553629L);
		System.out.println(data4);
	}

} 
