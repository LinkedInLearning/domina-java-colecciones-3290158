import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class InterfazConjunto {
	private static final String[] PALABRAS = new String[] {"sol", "luna", "estrella", "planeta", "cielo"};
	
	public static void main(String[] args) {
		Set<String> conj1 = new HashSet<>();
		Set<String> conj2 = new TreeSet<>();
		Set<String> conj3 = new LinkedHashSet<>();
		for (int i = 0; i < 5; i ++) {
			conj1.add(PALABRAS[i]);
			conj2.add(PALABRAS[i]);
			conj3.add(PALABRAS[i]);
		}
		System.out.println("HashSet: " + conj1);
		System.out.println("TreeSet: " + conj2);
		System.out.println("LinkedHashSet: " + conj3);
	}
}
