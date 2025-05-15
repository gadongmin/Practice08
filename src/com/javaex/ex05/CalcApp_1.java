package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp_1 {

	public static void main(String[] args) {
		// 초기화
		Scanner sc = new Scanner(System.in);
		int result;

		// 무한루프
		while (true) {
		
			// 입력값
			System.out.print(">> ");
			String input = sc.nextLine();

			// 종료 조건 설정
			if (input.equals("/q")) {
				System.out.println("종료합니다.");
				break;
			}

			// 입력값을 공백으로 구분
			String parts[] = input.split(" ");
			
			// 연산자와 피연산자 추출
			int a = Integer.parseInt(parts[0]);
			String cal = parts[1];
			int b = Integer.parseInt(parts[2]);
			
			// 연산자 계산식
			switch (cal) {
				case "+":
					Add_1 add = new Add_1();				// 객체만들기
					add.setValue(a, b);						// 숫자저장
					result = add.calculate(); 				// 연산 수행
					System.out.println(">> " + result); 	// 출력
					break;
				case "-":
					Sub_1 sub = new Sub_1();
					sub.setValue(a, b);
					result = sub.calculate();
					System.out.println(">> " + result);
					break;
				case "*":
					Mul_1 mul = new Mul_1();
					mul.setValue(a, b);
					result = mul.calculate();
					System.out.println(">> " + result);
					break;
				case "/":
					Div_1 div = new Div_1();
					div.setValue(a, b);
					result = div.calculate();
					System.out.println(">> " + result);
					break;
				default:
					System.out.println("알 수 없는 연산입니다.");
					break;
			}

		}
		

		sc.close();
	}

}
