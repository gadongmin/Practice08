package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) { // 무한반복
			System.out.print(">> ");
			String input = sc.nextLine(); // 한줄입력
			
			if (input.equals("/q")) { // 입력 시
				System.out.println("종료합니다."); // 프로그램 종료
				break;
			}

			String[] parts = input.split(" "); // 배열을 공백으로 나눔
			if (parts.length != 3) { // 배열이 3개가 아닐 시 
				System.out.println("알 수 없는 연산입니다."); // 출력
				continue; // 계속 진행
			}

			int a = Integer.parseInt(parts[0]); // 배열 첫번째 정수 출력 
			String cal = parts[1]; // 배열 두번째 문자열(연산자) 출력
			int b = Integer.parseInt(parts[2]); // 배열 세번째 정수 출력
			int result = 0; // 결과 저장 변수 

			switch (cal) { // 연산자(cal) 따라 분기
				case "+":
					Add add = new Add(); // 더하기 객체 생성
					add.setValue(a, b); // 숫자 저장
					result = add.calculate(); // 더하기 실행
					break;
	
				case "-":
					Sub sub = new Sub(); // 빼기 객체 생성
					sub.setValue(a, b); // 숫자 저장
					result = sub.calculate(); // 빼기 실행
					break;
	
				case "*":
					Mul mul = new Mul(); // 곱하기 객체 생성
					mul.setValue(a, b); // 숫자저장
					result = mul.calculate(); // 곱하기 실행
					break;
	
				case "/":
					Div div = new Div(); // 나누기 객체 생성
					div.setValue(a, b); // 숫자 저장
					result = div.calculate(); // 나누기 실행
					break;
	
				default: // 케이스 연산자가 아니면 
					System.out.println("알수 없는 연산입니다."); // 오류메세지
					continue; // 다시 반복
				}
			System.out.println(">> " + result); // 결과출력
		}

		sc.close();
	}
}
