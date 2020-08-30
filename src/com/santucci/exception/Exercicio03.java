package com.santucci.exception;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Exercicio03 ex = new Exercicio03();
		
		try {
			BufferedReader br = ex.abriarArquivo();
			String linha;
			while((linha = br.readLine()) != null) {
				System.out.println(linha);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

	public BufferedReader abriarArquivo() throws IOException{
		InputStream is = new FileInputStream("src\\com\\santucci\\exception\\arquivo.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
}
