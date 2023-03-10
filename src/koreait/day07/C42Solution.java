package koreait.day07;

import java.util.Scanner;

public class C42Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 >>> ");
		String test = sc.nextLine();
		
		System.out.println("입력한 문자열 : " + test);
		System.out.println("reversr : " + reverse1(test));
		
		
		System.out.print("\n문자열 입력 >>> ");
		String str = sc.nextLine();
		System.out.print("\n 정수를 입력 >>> ");
		int num = sc.nextInt();
		System.out.println("solution : " + solution(str,num));
	}//main
	
	public static String reverse1(String s) {
		String reverse = "";
		for(int i=s.length()-1;i>=0;i--) {
			reverse +=s.charAt(i);
		}
		return reverse;
	}
	
	//프로그래머스 : 시저암호
	public static String solution(String s, int n) {
		String answer ="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				answer += s.charAt(i);
			}else if(s.charAt(i)>='a'&& s.charAt(i)<='z'){
				answer += s.charAt(i)-26;
		}
	}
		return answer;
}
	
	
}//class
