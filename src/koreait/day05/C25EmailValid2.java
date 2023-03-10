package koreait.day05;

import java.util.Scanner;

public class C25EmailValid2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean result;
		String message = "이메일 형식 체크사항 : "
				+ "- @ 기호가 오직 1개 있어야합니다.\n"
				+ "- @ 앞의 계정이름은 5글자 이상으로 하고 영문자로 시작합니다.\n"
				+ "- @ 뒤의 도메인 주소는 . 기호가 1개 이상 입니다.\n";
		System.out.println(message);
		System.out.print("사용할 이메일 입력하세요 >>>> ");
		String email = sc.nextLine();
		
		char ch0 = email.charAt(0);
		int idx = email.indexOf('@');
		boolean check1 = idx != -1 && email.indexOf('@') == email.lastIndexOf('@');
		boolean check2 = idx != -1 && email.substring(0, idx).length()>=5;
		boolean check3 = isAlphabet(ch0);
		// . 기호의 갯수가 1개 이상
		boolean check4 = idx != -1 && (email.substring(idx+1).lastIndexOf('.')> -1);
		
		if(check1 && check2 && check3 && check4) {
			result = true;
		}else {
			result = false;
		}
		if(result) {
			System.out.println("입력하신 메일주소는 \"사용가능\" 합니다.");
		}else {
			System.out.println("입력하신 메일주소는 \"사용불가능\" 합니다.");
			System.out.println(message);
		}
		sc.close();
		
		
		
	}
	public static boolean isAlphabet(char ch0) {
		return (ch0>='A' && ch0<='Z' || ch0>='a' && ch0<='z');
	}

}
