package koreait.day06;

import java.util.Random;
import java.util.Scanner;

public class C36RandomTest {

	//난수 : random 값 - 컴퓨터가 생성해주는 임의의 값.
	public static void main(String[] args) {
		
		Random r =new Random();		//랜덤값을 만들어줄 클래스의 객체 생성(new 연산)하기
		int rnum;		//랜덤값 저장하기
		
		System.out.println("1. int 타입 랜덤값 10개 생성하기");
		for(int i=0;i<10;i++) {
			rnum = r.nextInt();		//nextInt 메소드 인자값 없음
			System.out.println(rnum);
		}
		
		System.out.println("2. 100이하의 int값 10개 생성하기");
		for(int i=0;i<10;i++) {
			rnum = r.nextInt(100);		//nextInt 메소드 인자값 100 -> (0 <= 랜덤값 <100)
			System.out.println(rnum);
		}
		
		System.out.println("3. 특정 범의 int값 10개 생성하기");
		for(int i=0;i<10;i++) {
			rnum = r.nextInt(50)+10;		//nextInt 메소드 인자값 50 -> (0 <= 랜덤값 <50)
											//		ㄴ 더하기 10 -> 10<=랜덤값<60
			System.out.println(rnum);
		}
		
		
		//start ~ end 범위의 랜덤값 만드는 공식(end 포함)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("범위의 시작값 입력 >>> ");
		int start = sc.nextInt();
		System.out.print("범위의 마지막값 입력 >>> ");
		int end = sc.nextInt();
		System.out.println("5. 특정 범위 start부터 end까지의 int값 10개 생성하기");
		for(int i=0; i<10; i++) {
			rnum = r.nextInt(end-start+1)+start;
			
			System.out.println(rnum);
		}
		
		System.out.println("6/45 로또 숫자 1~45 범위로 6개 생성하기");
		for(int i=0;i<6;i++) {
			rnum = r.nextInt(45)+1;		
			System.out.println(rnum);
		}
		
		
		sc.close();
	}//main

}
