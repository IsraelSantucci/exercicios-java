package com.santucci.arrays;

public class Exercicio01 {

	public static void main(String[] args) {
		
		int[] numeros = new int[10];
		int[] numeros2 = {100, 230, 322, 45, 79, 80};
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = i * 2;
		}

		for(int numero : numeros) {
			System.out.print(numero + "  ");
		}
		
		System.out.println();
		
		for(int numero : numeros2) {
			System.out.print(numero + "  ");
		}
		
		System.out.println("===========");
		String nome = "aasrael";
		int[] a = new int[26];
		
		for(int s : nome.toCharArray()) {
			a[1]++;
		}
		for(int s : a) {
			System.out.println(s);
		}
		System.out.println(Math.min(7, 3));
	}

}
