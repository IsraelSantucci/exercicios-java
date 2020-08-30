package com.santucci.exception;

public class Exercicio02 {

	public static void main(String[] args) {
		
		try{
			int[] numeros = new int[5];
			
			for (int i = 0; i <= numeros.length; i++) {
				numeros[i] = (int) (Math.random() * 10);
			
			}
			
			for (int i : numeros) {
				System.out.print(i + " ");
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("posição inválida do array");
		}
		System.out.println(Math.random());
	}

}
