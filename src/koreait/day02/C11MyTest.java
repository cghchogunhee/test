package koreait.day02;

import java.util.Scanner;

public class C11MyTest {
	//C09 예제를 너비, 높이, 원의 반지름을 키보드 입력으로 해보기
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int width;		
		int height;	
		int radius;
		int area;				
		final double pi = 3.14;
		double tri_area;	
		double round;		
		
		System.out.print("가로 길이(정수)를 정하시오>>>>");
		width = sc.nextInt();
		System.out.print("세로 길이(정수)를 정하시오>>>>");
		height = sc.nextInt();
		System.out.print("원의 반지름(정수)을 정하시오>>>>");
		radius = sc.nextInt();
		
		area = width*height;
		tri_area=(double)width*height/2;
		round=radius*pi*2;
		
		System.out.println("사각형의 넓이 : " + area + "㎠");
		System.out.println("삼각형의 넓이 : " + tri_area + "㎠");
		System.out.println("원의 둘레 : " + round + "㎝");
		
		sc.close();
	}

}
