import java.util.Stack;

public class ClaseStack {
	public static void main(String[] args) {
		Stack<Integer> pila = new Stack<>();
		pila.push(1);
		pila.push(2);
		pila.push(3);
		System.out.println(pila);
		System.out.println("peek: " + pila.peek());
		System.out.println(pila);
		System.out.println("peek: " + pila.peek());
		System.out.println(pila);
		System.out.println("pop : " + pila.pop());
		System.out.println(pila);
		System.out.println("pop : " + pila.pop());
		System.out.println(pila);
		pila.push(4);
		System.out.println(pila);
		System.out.println("pop : " + pila.pop());
		System.out.println(pila);
		System.out.println("pop : " + pila.pop());
		System.out.println("pila.empty()? " + pila.empty());
		System.out.println("pila.isEmpty()? " + pila.isEmpty());
		System.out.println("pop : " + pila.pop());	
	}
}
