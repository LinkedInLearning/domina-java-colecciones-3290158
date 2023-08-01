import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ClaseArrayList {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>(16); // tamaño 16
		al.add("hola");
		al.trimToSize(); // tamaño 1
		al.add("adiós");
		al.ensureCapacity(1000); // tamaño 1000

	}
}
