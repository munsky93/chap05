package com.javaex.ex02;


import java.util.ArrayList;
import java.util.List;


public class Ex01 {

	public static void main(String[] args) {
		
		List<Point> list = new ArrayList<Point>();   //List에 뭘 넣어야한다.
		
		Point p1 = new Point(2,2);   //[0]
		Point p2 = new Point(3,3);   //[1]
		Point p3 = new Point(7,7);   //[2]

		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		System.out.println(list.size());
	
	Point p = list.get(1);                  //출력하고 싶은 거를 get한후 위에 0,1,2에서 
	/*System.out.println(p.toString());*/   //선택한다.
	//밑에 시스템 때문에 주석처리함!	
	
	
		//다찍어봐했을 경우 
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	    System.out.println("=============================");
		
		/*for(Point pp : list) {    //pp이름 막지음!
	    	System.out.println(pp.toString());  
	    }*/  //밑에때문에 주석 처리함
		
		list.remove(1);
		for(Point pp : list) {    
	    	System.out.println(pp.toString());  
	    }
        
		System.out.println("========================");
		list.add(p2);
		for(Point pp : list) {
			System.out.println(pp.toString());
		}
	}

}
