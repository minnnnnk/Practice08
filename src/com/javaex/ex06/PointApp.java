package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		System.out.println(p1 == p2); //주소값이 달라 F
		System.out.println(p2 == p3); //주소값이 달라 F
		System.out.println(p3 == p4); //그냥 다름
		System.out.println(p4 == p1); // 맞음		
		System.out.println(p1.equals(p2)); // 주소값이 다름
		System.out.println(p4.equals(p1)); // 같음
	}

}


