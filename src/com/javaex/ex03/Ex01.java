package com.javaex.ex03;

import java.util.HashMap;
import java.util.Map;

public class Ex01 {

	public static void main(String[] args) {
		
		Map<String, Point> map = new HashMap<String, Point>();
		
		Point p1 = new Point(1,1);
		Point p2 = new Point(2,2);
	    Point p3 = new Point(3,3);
	    Point p4 = new Point(4,4);	
	    
	    map.put("�ǻ��", p1);
	    map.put("���켺", p2);               //Ű��  = �� ������ �̸���!!
	    map.put("��ȿ��", p3);
	    map.put("���缮", p4);
	    
	    System.out.println(map.get("��ȿ��"));
	    System.out.println(map.size());
			
        map.put("��ȿ��", p1);
        System.out.println(map.size());
        
        System.out.println(map.get("��ȿ��"));
	}

}
