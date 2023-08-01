import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UtilidadArrays {

	public static void main(String[] args) {
		String[] array = new String[] { "azul", "verde", "amarillo", "rojo", "blanco" };
		List<String> lista = Arrays.asList(array);
//		List<String> lista = Arrays.asList("azul", "verde", "amarillo", "rojo", "blanco");
//		lista.add("negro");
		System.out.println(lista);
		
		List<String> nuevaLista = new ArrayList<>(lista);
		System.out.println("Nueva lista: " + nuevaLista);
		
		List<String> listaDirecta = new ArrayList<>(Arrays.asList("azul", "verde", "amarillo", "rojo", "blanco"));
		System.out.println("Lista directa: " + listaDirecta);

		lista.set(2, "lila");
		System.out.println("Lista: " + lista);
		nuevaLista.add("negro");
		System.out.println("Nueva lista: " + nuevaLista);

		List<String> listaDe = List.of("azul", "verde");
		System.out.println("Lista de: " + listaDe);
		
		String[] copia = Arrays.copyOf(array, 2);
		System.out.println("Copia: " + copia);
		System.out.println(Arrays.toString(copia));
		
		String[] otra = lista.toArray(new String[0]);
		System.out.println("Otra antes: " + Arrays.toString(otra));
		Arrays.sort(otra);
		System.out.println("Otra después: " + Arrays.toString(otra));

		int posNegro = Arrays.binarySearch(otra, "negro");
		System.out.println("Pos negro: " + posNegro);
		int posRojo = Arrays.binarySearch(otra, "rojo");
		System.out.println("Pos rojo: " + posRojo);
		
	}
}
