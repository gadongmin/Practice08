package com.javaex.ex03;

public class Point {
	// 필드
	private int x;
	private int y;

	// 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// 메소드 gs
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// 메소드 일반 toString()을 작성 하세요
	@Override
	public String toString() {
		return "[포인트] x:" + x + ", y:" + y + " 입니다.";
	}

}
