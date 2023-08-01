import java.util.Objects;
import java.util.Random;

public class UtilidadObjects {
	private static final int LIM = 10;

	public static void main(String[] args) {
		Random r = new Random();
		int[] l1 = new int[LIM];
		int[] l2 = new int[LIM];
		for (int i = 0; i < LIM; i ++) {
			Integer num = r.nextInt(LIM);
			l1[i] = num;
			l2[i] = num;
		}

		System.out.println("¿Son iguales l1 y l2? " + l1.equals(l2));
		System.out.println("¿Son profundamente iguales l1 y l2? " + Objects.deepEquals(l1, l2));
		
		Object n = null;
//		System.out.println(n.hashCode());
		System.out.println(Objects.hashCode(n));

		Cosita hola = new Cosita("hola");
		System.out.println(hola.algo());
		Cosita nula = new Cosita(null);
		System.out.println(nula.algo());
		
		if (Objects.isNull(nula)) {
			System.out.println("Mejor no hago nada");
		}
	}
}

class Cosita {
	private String cosa;
	
	public Cosita(String cosa) {
//		this.cosa = cosa;
		this.cosa = Objects.requireNonNull(cosa);
	}
	
	public int algo() {
		return cosa.length();
	}
}