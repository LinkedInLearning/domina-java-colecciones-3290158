import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ManipulandoListas {
	public static void main(String[] args) {

		List<Character> listaLetras = new ArrayList<>();
		for (Character letra : "aeiou123".toCharArray()) {
			listaLetras.add(letra);
		}
		System.out.println(listaLetras);
		listaLetras.removeIf(letra -> (Character.isDigit(letra)));
		System.out.println(listaLetras);

		Integer[] nums = new Integer[] { 3, 5, 7, 1, 2, 3, 9, 0 };
		List<Integer> listaNumeros = Arrays.asList(nums);
		System.out.println(listaNumeros);
		listaNumeros.sort(Comparator.naturalOrder());
		System.out.println(listaNumeros);
		
		while (!listaLetras.isEmpty()) { // listaLetras.size() != 0
			listaLetras.remove(0);
			System.out.println(listaLetras);
		}
	}
}
