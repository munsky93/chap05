package com.javaex.ex02;


import java.util.ArrayList;
import java.util.List;


public class Ex01 {

	public static void main(String[] args) {
		
		List<Point> list = new ArrayList<Point>();   //List�� �� �־���Ѵ�.
		
		Point p1 = new Point(2,2);   //[0]
		Point p2 = new Point(3,3);   //[1]
		Point p3 = new Point(7,7);   //[2]

		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		System.out.println(list.size());
	
	Point p = list.get(1);                  //����ϰ� ���� �Ÿ� get���� ���� 0,1,2���� 
	/*System.out.println(p.toString());*/   //�����Ѵ�.
	//�ؿ� �ý��� ������ �ּ�ó����!	
	
	
		//���������� ��� 
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	    System.out.println("=============================");
		
		/*for(Point pp : list) {    //pp�̸� ������!
	    	System.out.println(pp.toString());  
	    }*/  //�ؿ������� �ּ� ó����
		
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
