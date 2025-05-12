package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print(">> ");
			String input = sc.nextLine();
			
			if(input.equals("/q")) {
				System.out.println("종료합니다.");
				break;
			}
			
			String[] parts = input.split(" ");
			if(parts.length !=3) {
				System.out.println("알 수 없는 연산입니다.");
				continue;
			}
			
			 int a = Integer.parseInt(parts[0]);
			 String cal = parts[1];
			 int b = Integer.parseInt(parts[2]);
			 int result = 0;
			 
			 switch(cal) {
			 	case "+" :
			 		Add add = new Add();
			 		add.setValue(a, b);
			 		result = add.calculate();
			 		break;
			 	case "-" :
			 		Sub sub = new Sub();
			 		sub.setValue(a, b);
			 		sub.calculate();
			 		break;
			 	case "*":
			 		Mul mul = new Mul();
			 		mul.setValue(a, b);
			 		mul.calculate();
			 		break;
			 	case "/":
			 		Div div = new Div();
			 		div.setValue(a, b);
			 		div.calculate();
			 		break;
		 		default : 
		 			System.out.println("알 수 없는 연산입니다.");
		 			continue;
			 }
			 System.out.println(">> " + result);		
		}
		
		sc.close();

	}
}
