import java.util.LinkedList;

public class ClaseLinkedList {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		for (int i = 0; i < 5; i++) {
			ll.add("elem_" + i);
		}
		System.out.println(ll);
		
		String peek = ll.peek();
		System.out.println("peek: " + peek);
		System.out.println(ll);

		String pop = ll.pop();
		System.out.println("pop: " + pop);
		System.out.println(ll);

		String poll = ll.poll();
		System.out.println("poll: " + poll);
		System.out.println(ll);

		String pollFirst = ll.pollFirst();
		System.out.println("pollFirst: " + pollFirst);
		System.out.println(ll);
		
		String pollLast = ll.pollLast();
		System.out.println("pollLast: " + pollLast);
		System.out.println(ll);
		
		ll.push("elem_push");
		System.out.println(ll);

		ll.offer("elem_offer");
		System.out.println(ll);

		ll.offerFirst("elem_offer_first");
		System.out.println(ll);

		ll.offerLast("elem_offer_last");
		System.out.println(ll);
	}
}
