import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Iteradores {

	private static void iterarColeccion(Collection col) {
		System.out.println(col);
		Iterator<Object> it = col.iterator();
		while (it.hasNext()) {
			Object elem = it.next();
			System.out.println(elem);
//			System.out.println(it.next());
		}
		for (Object elem : col) {
			System.out.println(elem);
		}
	}

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			lista.add("lista" + i);
		}
		iterarColeccion(lista);

		Deque<Integer> cola = new LinkedList<>();
		for (int i = 0; i < 5; i++) {
			cola.add(i);
		}
		iterarColeccion(cola);

		Collection<Character> conjunto = new HashSet<>();
		String palabra = "colección";
		for (int i = 0; i < palabra.length(); i++) {
			conjunto.add(palabra.charAt(i));
		}
		iterarColeccion(conjunto);
	}
}
