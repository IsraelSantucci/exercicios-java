package com.santucci.collections.stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class ExercicioOrdenacao2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LinkedHashSet<String> palavras = new LinkedHashSet<>();

		int quantLista = Integer.parseInt(br.readLine());

		for (int i = 0; i < quantLista; i++) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			
			while (st.hasMoreTokens()) {
				palavras.add(st.nextToken(" "));
			}
			
			palavras.stream()
				.map(palavra -> palavra.concat(" "))
				.sorted()
				.collect(Collectors.toList())
			.forEach(System.out::print);
			
			palavras.clear();

			System.out.println();
		}

	}
}
