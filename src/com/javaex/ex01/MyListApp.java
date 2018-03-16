package com.javaex.ex01;

public class MyListApp {

	public static void main(String[] args) {
	
		MyList<Circle> myList = new MyList<Circle>();
		
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(8);
		Point p1 = new Point(2, 2);
		         
		myList.add(c1);
		myList.add(c2);
		myList.add(p1);
		
		System.out.println(myList.size());
		
		
		
		/*	
		Point p1 = new Point(2, 2);
		Point p2 = new Point(5, 5);
		Point p3 = new Point(9, 5);
		
		
		MyList myList = new MyList();
		myList.add(p1);
		myList.add(p2);
		myList.add(p3);
		
		
		
		System.out.println(myList.size());*/

	}

}
