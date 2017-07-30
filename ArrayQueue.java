package jsjf;

public class ArrayQueue<T> implements QueueADT<T> 
{
	private int openSlot = 0;
	private int top = 0;
	private int rear = 0;
	private int DEFAULT_SIZE = 5;
	protected T[] list;
	
	@SuppressWarnings("unchecked")
	public ArrayQueue(int size)
	{
		list = (T[])(new Object[size]);
	}
	@SuppressWarnings("unchecked")
	public ArrayQueue()
	{		
		list = (T[])(new Object[DEFAULT_SIZE]);
	}
	@Override
	public void enqueue(T elem) 
	{
		list[openSlot] = elem;
		openSlot++;
		top++;
	}

	@Override
	public T dequeue() throws EmptyCollectionException
	{
		if(isEmpty())
			throw new EmptyCollectionException("Stack");
		int next = 1;
		T temp = list[rear];
		for(int i = 0; i < top-1; i++)
		{
			list[i] = list[next];
			next++;
		}
		openSlot--;
		top--;

		return temp;
	}

	@Override
	public T peek() {
		T result = list[top];
		
		return result;
	}

	@Override
	public boolean isEmpty() {
		if(top > 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	@Override
	public int size() {
		
		return openSlot;
	}
	
	public String toString()
	{
		String result = "";

        for (int scan=0; scan < openSlot; scan++) 
            result = result + list[scan] + "\n";

        return result;
	}

}


