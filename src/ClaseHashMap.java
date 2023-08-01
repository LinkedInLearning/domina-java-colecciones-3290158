import java.util.Map;
import java.util.TreeMap;

public class ClaseHashMap {
	public static void main(String[] args) {
		Map<Character, String> abecedario = new TreeMap<>();
		abecedario.put('A', "avión");
		abecedario.put('B', "bebé");
		abecedario.put('C', "casa");
		abecedario.put('D', "dedo");
		abecedario.put('E', "escuela");		
		abecedario.put('Q', "queso");
		abecedario.put('R', "rueda");		
		System.out.println("Tabla: " + abecedario);
	}
}
