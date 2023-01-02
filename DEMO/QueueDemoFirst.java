import java.util.Queue;
import java.util.LinkedList;

class QueueDemoFirst
{
	public static void main(String[] args) 
	{
		// Creating Queue using the LinkedList class
        Queue<Integer> numbers = new LinkedList<>();

        // offer elements to the Queue
        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(3);
        System.out.println("Queue: " + numbers);

       // Access elements of the Queue
        int accessedNumber = numbers.peek();
        System.out.println("Accessed Element: " + accessedNumber);

         // Remove elements from the Queue
        int removedNumber = numbers.poll();
        System.out.println("Removed Element: " + removedNumber);

        System.out.println("Updated Queue: " + numbers);

		int removedNumber1 = numbers.remove();
        System.out.println("Removed Element: " + removedNumber1);

		System.out.println("Updated Queue: " + numbers);

		int removedNumber2 = numbers.remove();
        System.out.println("Removed Element: " + removedNumber2);

		System.out.println("Updated Queue: " + numbers);

	}
}
