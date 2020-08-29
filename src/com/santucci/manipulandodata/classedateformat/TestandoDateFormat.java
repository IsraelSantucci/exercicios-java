package com.santucci.manipulandodata.classedateformat;

import java.text.DateFormat;
import java.util.Date;

import javafx.scene.input.DataFormat;

public class TestandoDateFormat {

	public static void main(String[] args) {
		
		Date agora = new Date();
		
		String data = DateFormat.getInstance().format(agora);
		System.out.println(data);
		//29/08/20 16:51
		
		//DateFormat.LONG: mostra a data ou hora no formato longo
		//DateFormat.SHORT: mostra a data ou hora no formato curto
		data = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(agora);
		System.out.println(data);
		//29 de Agosto de 2020 16:56
	}

}
