package com.innerapp;

public class InnerDemo {

	private final static int SIZE=20;
	
	private int[] arrayOfInts= new int[SIZE];
	
	public InnerDemo() {
		for(int i=0;i<SIZE; i++) {
			arrayOfInts[i]= i;
		}
	}
	public void printEven() {
		InnerEvenIterator  iv= new InnerEvenIterator();
		while(iv.hasNext()) {
			System.out.println(iv.getNext() + " ");
		}
	}
	
	private  class InnerEvenIterator {
		
		private int next=0;
		
		public boolean hasNext() {
			return (next <=SIZE -1);
		}
		public int getNext() {
			int retValue= arrayOfInts[next];
			next +=2;
			return retValue;
		}
		
	}
}
