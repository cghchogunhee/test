package koreait.day02;

import java.util.Scanner;	//기본 클래스가 아닌 것들은 import 필요.

public class C10KeyInput {

	//키보드 콘솔 입력(표준입력) 테스트
	public static void main(String[] args) {
		
			//Scanner 클래스를 이용해서 입력받은 데이터 처리 쉽게 할 수 있다.
			//변수로 선언해서 사용.
		Scanner sc = new Scanner(System.in);
		int data;
		System.out.print("정수값 하나를 입력하세요 >>>>> ");
		data = sc.nextInt();		//nextInt() 메소드는 입력받은 것을 정수로 처리한다.
		
		int data2;
		System.out.print("정수값 하나를 입력하세요 >>>>> ");
		data2 = sc.nextInt();		//nextInt() 메소드는 입력받은 것을 정수로 처리한다.
		
		System.out.println("data : " + data);
		System.out.println("data2 : " + data2);
		System.out.println("뎃셈연산 값 : " + (data + data2));
		
		double point;
		System.out.print("실수 값 하나를 입력하세요.");
		point = sc.nextDouble(); //nextDouble() 메소드는 입력받은 것을 실수로 처리한다.
		System.out.println("point : " + point);
		
		sc.close();
		
	}

}
