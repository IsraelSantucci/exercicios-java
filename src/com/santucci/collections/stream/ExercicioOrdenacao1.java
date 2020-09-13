package com.santucci.collections.stream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExercicioOrdenacao1 {
	  
	public static void main(String[] args) throws IOException {
	  
	    Scanner scan = new Scanner(System.in);
	    List<Integer> numeros = new ArrayList<>();
	    
//	    int tamanho = scan.nextInt();
//	    for(int i = 0; i < tamanho; i++){
//	      numeros.add(scan.nextInt());
//	    }
	    numeros.add(2);
	    numeros.add(98);
	    numeros.add(1);
	    numeros.add(97);
	    numeros.add(23);
	    numeros.add(114);
	    numeros.add(77);
	    numeros.add(89);
	    numeros.add(42);
	    numeros.add(80);
	    
	    numeros.stream().filter(num -> num % 2 == 0)
	    	.sorted()
	    	.peek(System.out::println)
	    	.collect(Collectors.toList());
	    numeros.stream().filter(num -> num % 2 != 0)
	    	.sorted((primeiro,segundo) -> segundo - primeiro)
	    	.peek(System.out::println)
	    	.collect(Collectors.toList());
	       
	  }
}
