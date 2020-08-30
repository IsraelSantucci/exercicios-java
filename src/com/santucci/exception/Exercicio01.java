package com.santucci.exception;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Exercicio01 {

	public static void main(String[] args) {
		
		try {
			InputStream is = new FileInputStream("src\\com\\santucci\\exception\\arquivo.txt");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			String linha;
			while((linha = br.readLine()) != null) {
				System.out.println(linha);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
