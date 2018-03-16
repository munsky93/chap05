package com.javaex.ex01;

public class MyList<T> {              //T´Â º¯¼ö!

	
	private T[] oArray;
	private int crtPos;
	
	
	public MyList() {
		super();
		this.oArray = (T[]) new Object[3];
		this.crtPos = 0;
	}
	
	public void add(T o) {
		oArray[crtPos] = o;
		crtPos++;
	}
	
	public int size() {
		return crtPos;
		
	}


	
	/*private Object[] oArray;
	private int crtPos;
	
	
	public MyList() {
		super();
		this.oArray = new Object[3];
		this.crtPos = 0;
	}
	
	public void add(Object o) {
		oArray[crtPos] = o;
		crtPos++;
	}
	
	public int size() {
		return crtPos;
		
	}*/

}
