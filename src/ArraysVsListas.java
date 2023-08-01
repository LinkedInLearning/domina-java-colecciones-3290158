import java.util.ArrayList;
import java.util.List;

public class ArraysVsListas {
	public static void main(String[] args) {
		int[] nums = {1, 2, 3};
		String[] palabras = {"lápiz", "goma", "sacapuntas"};		
		
		char[] arrayLetras = new char[4];
		arrayLetras[0] = 'h';
		arrayLetras[1] = 'o';
		arrayLetras[2] = 'l';
		arrayLetras[3] = 'a';
		
		List<Character> listaLetras = new ArrayList<>();
		listaLetras.add('h');
		listaLetras.add('o');
		listaLetras.add('l');
		listaLetras.add('a');
		
		System.out.println(arrayLetras.length);
		System.out.println(listaLetras.size());
		
		System.out.println(arrayLetras[2]);
		System.out.println(listaLetras.get(2));

		listaLetras.add(0, '¡');
		listaLetras.add('!');
		System.out.println(listaLetras.size());
	}
}
