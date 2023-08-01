import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;

public class InterfazColeccion {
	
	public static void pintarColeccion(Collection col) {
		System.out.println(col.getClass());
		for (Object elem : col) {
			System.out.println(elem);
		}
		System.out.println();
//		for (int i = 0; i < col.size(); i ++) {
//			System.out.println(col.get(i));
//		}
	}
	
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			lista.add("lista" + i);
		}
		pintarColeccion(lista);
		
		Deque<Integer> cola = new LinkedList<>();
		for (int i = 0; i < 5; i++) {
			cola.add(i);
		}
		pintarColeccion(cola);
		
		Collection<Character> conjunto = new HashSet<>();
		String palabra = "colección";
		for (int i = 0; i < palabra.length(); i ++) {
			conjunto.add(palabra.charAt(i));
		}
		pintarColeccion(conjunto);
	}
}
