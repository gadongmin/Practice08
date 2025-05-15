package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		// 초기화
		Scanner sc = new Scanner(System.in);
		int result;
		
		// 무한 루프 시작
		while (true) {
			
			// 사용자 입력받기
			System.out.print(">> ");
			String str = sc.nextLine();
			
			// 종료 조건 확인
			if (str.equals("/q")) {
				System.out.println("종료합니다.");
				break;
			}
			 
			// 입력 분할하기
			String[] parts = str.split(" ");

			// 피연산자와 연산자 추출
			int a = Integer.parseInt(parts[0]);
			int b = Integer.parseInt(parts[2]);
			String cal = parts[1];
			
			// 연산자에 따른 계산 실행
			switch (cal) {
				case "+":
					Add add = new Add();					// 객체만들기
					add.setValue(a, b);						// 입력받은 숫자 저장
					result = add.calculate();				// 연산수행
					System.out.println(">> " + result);		// 결과출력
					break;
	
				case "-":
					Sub sub = new Sub();
					sub.setValue(a, b);
					result = sub.calculate();
					System.out.println(">> " + result);
					break;
	
				case "*":
					Mul mul = new Mul();
					mul.setValue(a, b);
					result = mul.calculate();
					System.out.println(">> " + result);
					break;
	
				case "/":
					Div div = new Div();
					div.setValue(a, b);
					result = div.calculate();
					System.out.println(">> " + result);
					break;
	
				default:
					System.out.println("알 수 없는 연산입니다.");

			}

		}
		sc.close();
	}
}