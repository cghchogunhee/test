package koreait.day02;

public class C06IntegerVar {
	//int 와 long
	public static void main(String[] args) {
		
		//변수 사용하기 위한 선언
	//	int iVal;
		long longVal;
		
		//선언 + 초기화
		int inum = 900;
		
		// 리터럴 123 , 999 는 기본적으로 int 4바이트 입니다.
		long lnum = 999;		//*1. 4바이트보다 작은 값은 자동으로 long으로 변환(캐스팅 casting)
		
		//출력 : 메모리에 저장된 값 읽어오기
	//	System.out.println("iVal : " + iVal);					//컴파일 오류 : 값이 없는 변수는 사용못합니다.
		longVal = 314;														//대입문 : 값 지정
		System.out.println("longVal : " + longVal);
		System.out.println("inum : " + inum);
		System.out.println("lnum : " + lnum);
		
		// 리터럴 123 , 999 는 기본적으로 int 4바이트 입니다.
		//longVal = 2147483648;	//*2. 4바이트보다 큰 값은 long 리터럴 사용해야함.
		longVal = 2147483648L;		//long 타입 리터럴 L(소문자 가능) 사용.
		longVal = 2147483647;		//한끗 차이로 가능
		
		//프로그래밍 언어에서, 리터럴(literal)이란 소스 코드에서 특정한 자료형의 값을 직접 표현하는 방식을 말한다.
		
		
	}
}
