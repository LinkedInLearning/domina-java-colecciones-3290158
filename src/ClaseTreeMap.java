import java.util.HashMap;
import java.util.Map;

public class ClaseTreeMap {
	public static void main(String[] args) {
		Map<Character, String> abecedario = new HashMap<>();
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
