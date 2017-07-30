package jsjf;

public class Main {

	public static void main(String[] args) 
	{
		// Create Book objects to store in my Queues & Stacks
		Book myBook1 = new Book("Java Foundations", 10, 32);
		Book myBook2 = new Book("Calculus III", 6, 35);
		Book myBook3 = new Book("Intro to Analysis", 12, 45);
		Book myBook4 = new Book("Discrete Mathematics", 7, 23);
		Book myBook5 = new Book("Software Engineering", 14, 45);
		Book myBook6 = new Book("Probability & Statistics", 7, 26);
		
		/*		Assignment 3 Question 1
		 * 
		 */
		LinkedStack<Book> myLinkedStack = new LinkedStack<Book>();
//		myLinkedStack.pop();	// Uncomment to check EmptyCollectionException functionality
		myLinkedStack.push(myBook1);
		myLinkedStack.push(myBook2);
		myLinkedStack.push(myBook3);
		myLinkedStack.push(myBook4);
		myLinkedStack.push(myBook5);
		myLinkedStack.push(myBook6);
//		System.out.print(myLinkedStack.toString()); // Uncomment to check EmptyCollectionException functionality
		myLinkedStack.pop();
		System.out.print(myLinkedStack.toString());
//		System.out.println(myLinkedStack.peek());
		System.out.println(myLinkedStack.size());
		
		/*		Assignment 3 Question 2
		 * 
		 */
		ArrayStack<Book> myArrayStack = new ArrayStack<Book>();
//		myLinkedArrayStack.pop();	// Uncomment to check EmptyCollectionException functionality
		myArrayStack.push(myBook1);
		myArrayStack.push(myBook2);
		myArrayStack.push(myBook3);
		myArrayStack.push(myBook4);
		myArrayStack.push(myBook5);
//		myArrayStack.push(myBook6);
//		System.out.print(myArrayStack.toString());
		myArrayStack.pop();
		System.out.print(myArrayStack.toString());
		System.out.println(myArrayStack.peek());
		System.out.println(myArrayStack.size());
		
		/*		Assignment 3 Question 3
		 * 
		 */
		LinkedQueue<Book> myLinkedQueue = new LinkedQueue<Book>();
//		myLinkedQueue.dequeue();	// Uncomment to check EmptyCollectionException functionality
		myLinkedQueue.enqueue(myBook1);
		myLinkedQueue.enqueue(myBook2);
		myLinkedQueue.enqueue(myBook3);
		myLinkedQueue.enqueue(myBook4);
		myLinkedQueue.enqueue(myBook5);
		myLinkedQueue.enqueue(myBook6);
//		System.out.print(myLinkedQueue.toString());
		myLinkedQueue.dequeue();
		System.out.print(myLinkedQueue.toString());
//		System.out.println(myLinkedQueue.peek());
		System.out.println(myLinkedQueue.size());
		
		/*		Assignment 3 Question 4
		 * 
		 */		
		ArrayQueue<Book> myArrayQueue = new ArrayQueue<Book>();
//		myArrayQueue.dequeue();	// Uncomment to check EmptyCollectionException functionality
		myArrayQueue.enqueue(myBook1);
		myArrayQueue.enqueue(myBook2);
		myArrayQueue.enqueue(myBook4);
		myArrayQueue.enqueue(myBook5);
		myArrayQueue.enqueue(myBook6);
//		System.out.print(ArrayQueue.toString());
		myArrayQueue.dequeue();
		System.out.print(myArrayQueue.toString());
//		System.out.println(ArrayQueue.peek());
		System.out.println(myArrayQueue.size());
	}

}
