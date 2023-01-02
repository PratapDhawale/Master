import java.util.*;
class LinkedListDemo 
{
	public static void main(String[] args) 
	{
		LinkedList l = new LinkedList();

		l.add("Avinash");
		l.add(30);
		l.add(null);
		l.add("Avinash");
		System.out.println(l);
		System.out.println();
		
		l.set(0, "iView Logic");
		System.out.println(l);
		System.out.println();
	
		l.add("Logic");
		System.out.println(l);
		System.out.println();
	
		l.addFirst("First");
		l.addLast("Last");
		System.out.println(l);
		System.out.println();

		l.removeFirst();
		System.out.println(l);
		l.removeLast();
		System.out.println(l);
		System.out.println();

		l.addFirst(30);
		System.out.println(l);
		System.out.println();
		l.remove(2);
		System.out.println(l);
		System.out.println();

		l.set(4, "iView Logic");
		System.out.println(l);

		l.add(4,50);
		System.out.println(l);
		
	}
}
