package jsjf;

public class ArrayStack<T> implements StackADT<T> 
{
	private int openSlot = 0;
	private int top = -1;
	private int DEFAULT_SIZE = 50;
	protected T[] list;
	
	@SuppressWarnings("unchecked")
	public ArrayStack(int size)
	{
		
		list = (T[])(new Object[size]);
	}
	@SuppressWarnings("unchecked")
	public ArrayStack()
	{
		
		list = (T[])(new Object[DEFAULT_SIZE]);
	}
	@Override
	public void push(T elem) 
	{
		list[openSlot] = elem;
		openSlot++;
		top++;
	}

	@Override
	public T pop() throws EmptyCollectionException
	{
		if(isEmpty())
			throw new EmptyCollectionException("Stack");
		
		T temp = list[top];
		list[top] = null;
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
		if(top >= 0)
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
