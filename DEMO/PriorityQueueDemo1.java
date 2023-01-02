import java.util.*;
class PriorityQueueDemo1 
{
	public static void main(String[] args) 
	{
		PriorityQueue q = new PriorityQueue(15, new MyComparator());
		q.add("A");
		q.add("Z");
		q.add("L");
		q.add("B");
		q.add("C");
		q.add("D");
		
		System.out.println(q);
		
	}
}
class MyComparator implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		String s1=(String)obj1;
		String s2=obj2.toString();
		return s2.compareTo(s1);
	}
	
}