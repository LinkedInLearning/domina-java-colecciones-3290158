public class Hashing {
	public static void main(String[] args) {
		Character letra = 'A';
		System.out.println(letra.hashCode());
		
		String texto = "hola";
		System.out.println(texto.hashCode());
		
		Integer num = 3;
		System.out.println(num.hashCode());
		
		Persona p = new Persona("Lola", "Gómez");
		System.out.println(p.hashCode());
	}
}
