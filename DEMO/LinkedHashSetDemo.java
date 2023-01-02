import java.util.*;
class LinkedHashSetDemo 
{
	public static void main(String[] args) 
	{
		LinkedHashSet l = new LinkedHashSet();
		l.add("B");
		l.add("A");
		l.add("Z");
		l.add("M");
		l.add("M");
		l.add(null);
		l.add("10");
		System.out.println(l);
		
		
	}
}
