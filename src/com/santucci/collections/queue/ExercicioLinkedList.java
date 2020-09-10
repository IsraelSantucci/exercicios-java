package com.santucci.collections.queue;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Iterator;

public class ExercicioLinkedList {

	public static void main(String[] args) {
		
		Queue<String> filaBanco = new LinkedList<>();
		
		filaBanco.add("João");
		filaBanco.add("Maria");
		filaBanco.add("Teresa");
		filaBanco.add("Israel");
		filaBanco.add("Ana");
		filaBanco.add("Pedro");
		filaBanco.add("Jorge");
		
		System.out.println(filaBanco);
		
		System.out.println("Quantidade de pessoas: " +filaBanco.size());
		
		System.out.println("Apenas Ver o proximo a ser Atendido:" + filaBanco.peek());
		
		System.out.println("Todos na lista: " + filaBanco);
		
		System.out.println("Atendendo  " + filaBanco.poll() );
		
		System.out.println("Quem falta:  " + filaBanco);
		
		System.out.println("Eliana esta na fila: " + filaBanco.contains("Eliana"));
		
		System.out.println("Ana esta na fila: " + filaBanco.contains("Ana"));
		
		System.out.println("A fila esta Vazia: " + filaBanco.isEmpty());
		
		System.out.println("Mostrar o primeiro da fila: " + filaBanco.element());
		
		filaBanco.clear();
		
		System.out.println("Mostrar o proximo da fila. lançar exceção se não tiver próximo");
		System.out.println("--------------------------- Exceção com captura------------------------------------");
		try {
			System.out.println("Mostrar o primeiro da fila: " + filaBanco.element());
		}catch(NoSuchElementException e) {
			e.printStackTrace();
		}
		
		System.out.println("-------------------------------------------------------------------------");
		System.out.println();
		
		filaBanco.add("Catarina");
		filaBanco.add("Eloisa");
		filaBanco.add("Antonio");
		filaBanco.add("Cristina");
		filaBanco.add("Mariana");
		filaBanco.add("Leonardo");
		filaBanco.add("Bruno");
			
		Iterator<String> iterador = filaBanco.iterator();
		System.out.println("Exibindo a lista com o Iterator: ");
		while(iterador.hasNext()) {
			System.out.print( iterador.next() + " ");
		}

	}

}
