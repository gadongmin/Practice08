package com.javaex.ex04;

import java.util.Scanner;

public class SumApp_1 {

	public static void main(String[] args) {

		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");
		String numLine = sc.nextLine();

		// 코드를 작성하세요
		String[] nArr = numLine.split(" "); // 입력받은 숫자를 공백으로 나눠 배열을 만듬
		for (int i = 0; i < nArr.length; i++) { // 배열의 모든 값을 차례대로 확인
			if(nArr[i].length() > 0) { // 배열 중 0보다 큰 수를 확인(빈 배열이 아닌경우)
				sum = sum + Integer.parseInt(nArr[i]); // 정수로 변환하여 합
			}
		}
		System.out.println("합:" + sum);

		sc.close();
	}

}
