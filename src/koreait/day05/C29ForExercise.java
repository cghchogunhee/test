package koreait.day05;

import java.util.Scanner;

public class C29ForExercise {

	public static void main(String[] args) {
		
		//1부터 100까지 한 줄에 숫자 10개씩 출력하기 printf("%5d",i)
		for(int i=1; i<=100; i++) {
			System.out.printf("%5d",i);
			if(i%10==0)System.out.println();
		}
		
		
		
		//1~100 값 중에서 5의 배수면 한줄에 10개씩 출력하기 - 어려울것 같아요(변수가 추가로 필요합니다.)
		System.out.println("--------------------");
		int count=0;
		for(int i=1; i<=100; i++) {
			if(i%5==0) {
				System.out.printf("%5d",i);
				count++;
				if(count%10==0)System.out.println();
			}
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\n정수 n 입력 >>>> ");
		int n = sc.nextInt();
		System.out.print("라인당 몇개씩 찍을까요? >>> ");
		int cols = sc.nextInt();
		
		count=0;
		for(int i=1; i<=100; i++) {
			if(i%n==0) {
				System.out.printf("%5d",i);
				count++;
				if(count%cols==0)System.out.println();
			}
		}
		
		System.out.println("\n카운트 변수 없이 해보기");
		for(int i=1; i<=100/n; i++) {
			System.out.printf("%5d",i*n);
			if(i%cols==0)System.out.println();
		}
		
	}

}
