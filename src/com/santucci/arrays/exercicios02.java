package com.santucci.arrays;

public class exercicios02 {

	public static void main(String[] args) {
		
		int[][] numeros = new int[3][3];
		
		int[][] numeros2 = {{22,33,44}, {5,76,3},{0,99,76}};
		
		for(int i = 0; i < numeros.length; i++) {
			for(int j = 0; j < numeros[i].length; j++) {
				numeros[i][j] = i + j * 2;
			}
		}
		
		//usando foreach
		for(int[] l : numeros) {
			for(int numero : l) {
				System.out.print(numero + " ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------");
		
		// usando for tradicional
		for(int i = 0; i < numeros.length; i++) {
			for(int j = 0; j < numeros[i].length; j++) {
				System.out.print(numeros[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------");
		for (int[] l : numeros2) {
			for (int numero : l) {
				System.out.print(numero + " ");
			}
			System.out.println();
		}
	}

}
