package koreait.day06;

import java.util.Scanner;

public class ProgrammersSale {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 n의 값을 입력하세요. >>>> ");
		int n = sc.nextInt();
		System.out.print("정수 m의 값을 입력하세요. >>>> ");
		int m = sc.nextInt();
		
		for(int i =0; i<n*m; i++) {
			if(i%n==0)System.out.println();
			System.out.print("★");
		}
		
		sc.close();
		
	}//main
}//class
