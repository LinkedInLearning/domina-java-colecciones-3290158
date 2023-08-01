import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArrayListVsLinkedList {
	private static final int LIM = 10000000;

	public static void main(String[] args) {
		Random r = new Random();
		List<Integer> al = new ArrayList<>();
		List<Integer> ll = new LinkedList<>();
		for (int i = 0; i < LIM; i ++) {
			Integer num = r.nextInt(LIM);
			al.add(num);
			ll.add(num);
		}

		compararGet(al, ll, 0);
		compararGet(al, ll, LIM/4);
		compararGet(al, ll, LIM/2);
		compararGet(al, ll, 3*LIM/4);
		compararGet(al, ll, LIM-1);
		
		compararAdd(al, ll, -1);
		
		compararAdd(al, ll, 0, -2);
		compararAdd(al, ll, LIM/4, -3);
		compararAdd(al, ll, LIM/2, -4);
		compararAdd(al, ll, 3*LIM/4, -5);
		compararAdd(al, ll, LIM-1, -6);
		
		compararContains(al, ll, -2);
		compararContains(al, ll, -3);
		compararContains(al, ll, -4);
		compararContains(al, ll, -5);
		compararContains(al, ll, -6);

	}
	
	public static void compararContains(List<Integer> arrayList, List<Integer> linkedList, int valor) {
		System.out.println("Comparar Contains, valor: " + valor);

		long milisA = System.currentTimeMillis();
		arrayList.contains(valor);
		long milisB = System.currentTimeMillis();
		System.out.println("arrayList.contains(" + valor + "): " + (milisB - milisA));

		long milisC = System.currentTimeMillis();
		linkedList.contains(valor);
		long milisD = System.currentTimeMillis();
		System.out.println("linkedList.contains(" + valor + "): " + (milisD - milisC));
		
		System.out.println();
	}
	
	public static void compararGet(List<Integer> arrayList, List<Integer> linkedList, int posicion) {
		System.out.println("Comparar get, posición: " + posicion);

		long milisA = System.currentTimeMillis();
		arrayList.get(posicion);
		long milisB = System.currentTimeMillis();
		System.out.println("arrayList.get(" + posicion + "): " + (milisB - milisA));

		long milisC = System.currentTimeMillis();
		linkedList.get(posicion);
		long milisD = System.currentTimeMillis();
		System.out.println("linkedList.get(" + posicion + "): " + (milisD - milisC));
		
		System.out.println();
	}
	
	public static void compararAdd(List<Integer> arrayList, List<Integer> linkedList, int valor) {
		System.out.println("Comparar add");

		long milisA = System.currentTimeMillis();
		arrayList.add(valor);
		long milisB = System.currentTimeMillis();
		System.out.println("arrayList.add(): " + (milisB - milisA));

		long milisC = System.currentTimeMillis();
		linkedList.add(valor);
		long milisD = System.currentTimeMillis();
		System.out.println("linkedList.add(): " + (milisD - milisC));
		
		System.out.println();
	}
	
	
	public static void compararAdd(List<Integer> arrayList, List<Integer> linkedList, int posicion, int valor) {
		System.out.println("Comparar add, posición: " + posicion);

		long milisA = System.currentTimeMillis();
		arrayList.add(posicion, valor);
		long milisB = System.currentTimeMillis();
		System.out.println("arrayList.add(" + posicion + "): " + (milisB - milisA));

		long milisC = System.currentTimeMillis();
		linkedList.add(posicion, valor);
		long milisD = System.currentTimeMillis();
		System.out.println("linkedList.add(" + posicion + "): " + (milisD - milisC));
		
		System.out.println();
	}

}
