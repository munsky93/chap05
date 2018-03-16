package com.javaex.ex03;

import java.util.Set;
import java.util.HashSet;

public class Lotto{

	public static void main(String[] arge) {
		
		Set<Integer> set = new HashSet<Integer>();
		
		while(set.size()<6) {
		  int num = (int)(Math.random()*45)+1;
		  set.add(num);
		}
		
		for(int lottoNo : set) {
			System.out.print(lottoNo +"  " );
		}
 	}
}
