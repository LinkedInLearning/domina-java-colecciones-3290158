import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class InterfazLista {
	public static void main(String[] args) {
		List<Integer> lista1 = new ArrayList<>();
		List<Integer> lista2 = new LinkedList<>();
		List<Integer> lista3 = new Vector<>();
		List<Integer> lista4 = new Stack<>();
		
		for (int i = 0; i < 5; i ++) {
			lista1.add(i);
			lista2.add(i);
			lista3.add(i);
			lista4.add(i);
		}
		
		System.out.println("lista1: " + lista1);
		lista1.add(2, 5);
		System.out.println("lista1.add(2, 5): " + lista1);
		Integer num = lista1.get(4);
		System.out.println("lista1.get(4): " + num);
		System.out.println();
		
		System.out.println("lista2: " + lista2);
		lista2.set(2, 5);
		System.out.println("lista2.set(2, 5): " + lista2);
		lista2.remove(0);
		System.out.println("lista2.remove(0): " + lista2);
		System.out.println();
				
		System.out.println("lista3: " + lista3);
		System.out.println("lista4: " + lista4);
		lista3.addAll(lista4);
		System.out.println("lista3.addAll(lista4): " + lista3);				
		lista3.addAll(2, lista4);
		System.out.println("lista3.addAll(2, lista4): " + lista3);				
		System.out.println();
		
		List<List<Integer>> listaDeListas = new ArrayList<>();
		listaDeListas.add(lista1);
		listaDeListas.add(lista2);
		listaDeListas.add(lista3);
		listaDeListas.add(lista4);
		System.out.println(listaDeListas);
	}
}
