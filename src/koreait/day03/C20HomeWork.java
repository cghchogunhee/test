package koreait.day03;
import java.util.Scanner;

public class C20HomeWork {

	public static void main(String[] args) {

		//정수값 아스키코드값 소문자 : 97~122 대문자 : 65~90 (소문자 = 대문자+32)범위에서 입력받으면
		//해당 문자가 무엇인지 출력해보기
		//주기 처리 사항 : 영문자 범위가 아닌 값 일때는 '잘못된 입력' 메시지로 알려주기
	int a;	
	Scanner sc = new Scanner(System.in);
	System.out.print("65~90 or 97~122 범위에서 하나의 정수를 입력하세요. >>>");
	a= sc.nextInt();
	
	if(65<= a && a<=90) {
		System.out.println("대문자 " + (char)a + "입니다.");
	}else if(97<= a && a<=122) {
		System.out.println("소문자 " + (char)a + "입니다.");
	}else {
		System.out.println("잘못입력하셨습니다.");
	}
	
	sc.close();
	//if(65<= a && a<=90 || 97<= a && a<=122){ //if('A'<= a && a<='Z' || 'a' <= a && a <= 'z') //문자로도 사용가능
//	System.out.println("문자 " + (char)a + "입니다.");
//	}else{
//	System.out.println("잘못입력하셨습니다.");
//	}
	
	
	}

}
