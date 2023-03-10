package koreait.day06;

import java.util.Scanner;

public class C35Exercise {

	public static void main(String[] args) {
		char ch = '9';
		ch='a';
		ch=' ';
		ch='F';
		ch='가';
		if(isAlphabet(ch)) {
			System.out.println("ch는 영문자 입니다.");
		}else if(isNumberic(ch)) {
			System.out.println("ch는 숫자 입니다.");
		}else if(isSymbol(ch)) {
			System.out.println("ch는 특수문자 입니다.");
		}else {
			System.out.println("잘못입력했습니다.");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("::문자열과 반복문::");
		System.out.print("문자를 입력 하시오. >>>> ");
		String test = sc.nextLine();
		for(int i=0; i<test.length(); i++) {
			System.out.println("i="+i+",문자는="+test.charAt(i));
		}
		
		System.out.println("::문자열과 반복문::문자 분류하기");
		int alpha=0, symbol=0, numeric=0;
		//입력한 문자열과 영문자 ? 개, 숫자 ? 개, 기호 ? 개 구하기
		//문자열 += 연산 : teat+="abc", 는 test = teat+"acc",(+는 연결연산)
		String result ="";		//알파벳만 골라서 새로운 문자열을 만들때 참조하는 변수
		for(int i=0; i<test.length(); i++) {
			ch=test.charAt(i);
			if(isAlphabet(ch)) {
				alpha++;
				result+=ch;		//문자열 +문자(char)연산은 연결입니다.
			}else if(isNumberic(ch)) {
				numeric++;
			}else if(isSymbol(ch)) {
				symbol++;
			}
		}
		System.out.println("테스트 메시지 =" + test);
		System.out.println("숫자 : " + numeric + "개, 영문자 : " + alpha + "개, 특수문자 : " + symbol);
		System.out.println("알파벳만 추출한 문자열 : " + result);
		
	}//main

	
	public static boolean isAlphabet(char ch) {	//ch가 알파벳인지 검사
		return(ch>='A' && ch<='Z' || ch>='a' && ch<='z');	//(연산 우선 순
	}
	
	public static boolean isNumberic(char ch) {	//ch가 숫자인지 검사
		return ch>='0' && ch<='9';
	}
	
	public static boolean isSymbol(char ch) {	//ch가 특수문자인지 검사
	//	return ch>=' ' && ch<='/' || ch>=':' && ch<='@' || ch>='[' && ch<='`' || ch>='{' && ch<='~';
		return !(ch>='A' && ch<='Z' || ch>='a' && ch<='z' || ch>='0' && ch<='9' || ch>='가' && ch<='힣');
	}
	
}
