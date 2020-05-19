package com.pack.datastruture;

import java.util.Arrays;

public class MyList<E> {
	private int size=0;
	private static final int defaultCapacity=10;
	private Object[] elements;
	
	public MyList()
	{
		elements = new Object[defaultCapacity];
	}
	
	public void add(E e)
	{
		if(size == elements.length) {
			ensureCapacity();
		}
		elements[size++]=e;
	}
	
	private void ensureCapacity()
	{
		int newSize = elements.length * 2;
		elements = Arrays.copyOf(elements, newSize);
	}
	
	public E get(int i)
	{
		if(i < 0 )
		{
			throw new IndexOutOfBoundsException("Index: "+ i + ", size "+ i);
			
		}
		return (E)elements[i];
	}
	
	 
    public static void main(String args[])
    {
    	MyList<Integer> list = new MyList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.get(6);
        
        System.out.println(list.get(2));
    }
	
}
