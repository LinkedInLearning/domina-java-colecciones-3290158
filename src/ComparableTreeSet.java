import java.util.Set;
import java.util.TreeSet;

public class ComparableTreeSet {
	public static void main(String[] args) {
		Persona p1 = new Persona("Marta", "Pérez");
		Persona p2 = new Persona("Pablo", "Gómez");
		Persona p3 = new Persona("Laura", "López");
		
		Set<Persona> amigos = new TreeSet<>();
		amigos.add(p1);
		amigos.add(p2);
		amigos.add(p3);
		System.out.println(amigos);
	}
	
}
