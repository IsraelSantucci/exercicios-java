package com.santucci.manipulandodata.classedate;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class TestandoClassIstant {
	
	public static void main(String[] args) {
		
		Date data = new Date(1598714682940L);
		System.out.println(data);
		//Sat Aug 29 12:24:42 BRT 2020
		
		
		Instant instante = data.toInstant();
		System.out.println(instante);
		//2020-08-29T15:24:42.940Z
		
		//Descobrindo o timeInMillis do meu nascimento
		Calendar diaNasc = Calendar.getInstance();
		diaNasc.set(1991, Calendar.JANUARY, 27, 2, 0, 0);
		System.out.println(diaNasc.getTimeInMillis());
		//664948800838
		
		//Convertendo o timeInMilis em um objeto date do meu nascimento
		Date dataNascimento = new Date(664948800522L);
		System.out.println(dataNascimento);
		//Sun Jan 27 02:00:00 BRST 1991
		
		//verificar se a Data é anterior ou posterior a 15 maio de 2010
		
		//achar o timeInMillis de 15/03/2010
		Calendar novaData = Calendar.getInstance();
		novaData.set(2010,Calendar.MAY,15,0,0,0);
		Date dataExercicio = new Date(novaData.getTimeInMillis());
		
		//verificar se antes ou depois		
		System.out.println("Meu aniversario é depois de 15 de maio de 2010: "
				+ dataNascimento.before(dataExercicio));
		
		System.out.println("Meu aniversario é depois de 15 de maio de 2010: " 
											+ dataNascimento.after(dataExercicio));
		
		
	}
}
