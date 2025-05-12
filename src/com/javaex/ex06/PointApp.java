package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3); // 메모리 주소 보유 
		Point p2 = new Point(2, 3); // 메모리 주소 보유
		Point p3 = new Point(5, 3); // 메모리 주소 보유
		Point p4 = p1; // p1의 메모리 주소 공유
		
		System.out.println(p1 == p2); // false
		System.out.println(p2 == p3); // false
		System.out.println(p3 == p4); // false
		System.out.println(p4 == p1); // true
		System.out.println(p1.equals(p2)); // 메모리 속 데이터 값??
		System.out.println(p4.equals(p1)); // true 
	}

}


