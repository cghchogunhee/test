package koreait.day05;
import java.util.Scanner;

public class C28ForExercise {
	//문제 : 사용자가 입력한 정수값 만큼 별 ★ 출력하기
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count;
		
		System.out.println("★ 몇번 출력할까요? 정수 입력 >>> ");
		count = sc.nextInt();
		
		for(int i =0; i<count; i++) {
			System.out.print("★");
		}
		
		
		System.out.println("\n평점으로 별 출력하기 : 3점이면 ★★★☆☆ , 4점이면 ★★★★☆");
		System.out.print("평점 입력 (1~5) >>> ");
		int jumsu = sc.nextInt();
		if(jumsu>=1 && jumsu<=5){
			for(int i=0; i<jumsu; i++) {
				System.out.print("★");
			}
			for(int i=0; i<5-jumsu; i++) {
				System.out.print("☆");
			}
			}else {
				System.out.println("잘못입력했습니다.");
		}
		
		System.out.println("\n==================================");
		//if문과 for문으로 만들기
		for(int i=0; i<5; i++) {
			if(i<jumsu) {
				System.out.print("★");
			}else {
				System.out.print("☆");
			}
		}
		System.out.println("\n==================================");
		//for문의 반복횟수를 제어하는 변수 (loop counter 변수)를 활용 - 1번 변형
		int k;
		for(k=0;k<jumsu;k++) {
			System.out.print("★");
		}
		//첫번째 for문이 끝나면 k 는 jumsu 와 같습니다.
		System.out.println("k=" + k);
		for(;k<5;k++) {//for(초기식;조건식;증감식) 필요에 따라 생략 가능 초기값 생략
			System.out.print("☆");
		}
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
	}

}
