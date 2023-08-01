import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class InterfazMapa {
	public static void main(String[] args) {
		Map<Character, String> abecedario = new HashMap<>();
		abecedario.put('A', "avión");
		abecedario.put('B', "bebé");
		abecedario.put('C', "casa");
		abecedario.put('D', "dedo");
		abecedario.put('E', "escuela");
		System.out.println("Tabla: " + abecedario);
		
		Set<Character> claves = abecedario.keySet();
		System.out.println("Claves: " + claves);
		Collection<String> valores = abecedario.values();
		System.out.println("Valores: " + valores);
		Set<Entry<Character, String>> entradas = abecedario.entrySet();
		System.out.println("Entradas: " + entradas);
		
		String antiguaA = abecedario.put('A', "abuela");
		System.out.println("antiguaA: " + antiguaA);
		System.out.println("Tabla: " + abecedario);
		
		String valorA = abecedario.get('A');
		System.out.println("Valor A: " + valorA);
		
		String nuevaA = abecedario.replace('A', "amigo");
		System.out.println("nuevaA: " + nuevaA);
		System.out.println("Tabla: " + abecedario);

		String nuevaZ = abecedario.replace('Z', "zapato");
		System.out.println("nuevaZ: " + nuevaZ);
		System.out.println("Tabla: " + abecedario);

		boolean reemplazadaA = abecedario.replace('A', "amiga", "antena");
		System.out.println("reemplazadaA: " + reemplazadaA);
		System.out.println("Tabla: " + abecedario);

		boolean reemplazadaA2 = abecedario.replace('A', "amigo", "antena");
		System.out.println("reemplazadaA2: " + reemplazadaA2);
		System.out.println("Tabla: " + abecedario);
		
		String zeta = abecedario.putIfAbsent('Z', "zapato");
		System.out.println("zeta: " + zeta);
		System.out.println("Tabla: " + abecedario);
	
		String carta = abecedario.putIfAbsent('C', "carta");
		System.out.println("carta: " + carta);
		System.out.println("Tabla: " + abecedario);

	}
}
