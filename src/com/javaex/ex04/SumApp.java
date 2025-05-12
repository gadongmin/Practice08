package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {

		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");
		String numLine = sc.nextLine();

		// 코드를 작성하세요
		String[] nArr = numLine.split(" "); // 입력받은 문자열을 공백으로 나눠서 배열로 만듬
		for (int i = 0; i < nArr.length; i++) { // 배열의 모든 값을 차례로 확인
			if (nArr[i].length() > 0) { // 빈 문자열이 아닌 경우 정수로 바꿔 합
				sum = sum + Integer.parseInt(nArr[i]); // 문자열을 정수로 바꿔서 합
			}
		}

		System.out.println("합:" + sum);

		sc.close();
	}

}
