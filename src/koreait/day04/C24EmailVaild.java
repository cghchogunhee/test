package koreait.day04;

import java.util.Scanner;

public class C24EmailVaild {
	//사용자가 입력한 이메일(문자열)을 검사하기.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이메일을 입력하세요. >>> " );
		String email = sc.nextLine();
		System.out.println("Email : " + email);
		
		
		//0. @문자가 있는가?
		System.out.println("@문자 있는지 확인 : " + email.indexOf('@'));
		int idx = email.indexOf('@');
		//1. @는 한번만 입력했는가?
		System.out.println("@문자가 1개인지 확인 : " + (idx==email.lastIndexOf('@')));
		//2. @를 기준으로 앞의 문자열 추출하기
		System.out.println("@를 기준으로 앞의 문자열 추출하기 : " + email.substring(0, idx));
		if(idx != -1) {
			System.out.println("@를 기준으로 앞의 문자열 추출하기 : " + email.substring(0, idx));
		}
		//3. @를 기준으로 뒤의 문자열 추출하기
		System.out.println("@를 기준으로 뒤의 문자열 추출하기 : " + email.substring((idx+1)));
		//4. .com으로 끝나는가?
		System.out.println(".com으로 끝나는가? " + email.endsWith(".com"));
		//5. 시작문자가 알파벳인가? - charAt(0) 첫번째 문자를 검사
		char ch0 = email.charAt(0);
		System.out.println("시작문자가 알파벳인가? " + (ch0>='A' && ch0<='Z' || ch0>='a' && ch0<='z'));
		
		System.out.println("시작문자가 알파벳인가(메소드)? " + isAlphabet(ch0));
		//6. 2번에서 추출한 계정이름이 5글자 이상인지?
	
		System.out.println("2번에서 추출한 문자가 5글자 이상인지? " + (email.substring(0, idx).length()>5));
		
		System.out.println("-------------------------------------------");
		//문제 : 입력된 이메일이 사용가능한지 체크 결과 출력하기
		//요구사항 : 1,5,6번이 참이고, '3번에서 문자가 1개 이상'인지 4가지 모두 만족하면 사용가능한 이메일
		//			사용할수 없는 이메일 일때는 이유를 알려주기
//		boolean result = true;
//		
//		if(result) {
//			result = (idx==email.indexOf('@'));
//		}else {
//			System.out.println("\n@가 중복되어 사용되어 사용할수 없습니다.");
//		}		
//		if(result) {
//			result = isAlphabet(ch0);
//		}else {
//			System.out.println("\n시작문자가 알파벳이 아니여서 사용할수 없습니다.");
//		}		
//		if(result) {
//			result = (email.substring(0, idx).length()>5);
//		}else {
//			System.out.println("\nID 글자갯수가 부족하여 사용할수 없습니다.");
//		}
//		if(result) {
//			result = (email.substring(idx+1).length()>=1);
//			System.out.println("\n사용가능한 이메일 입니다.");
//		}else {
//			System.out.println("\n주소가 이상하여 사용할수 없습니다.");
//		}
//		if(result) {
//			result = (idx==email.lastIndexOf('@'));
//		}else if(result) {
//			result = isAlphabet(ch0);
//		}else if(result) {
//			result = (email.substring(0, idx).length()>5);
//		}else if(result) {
//			result = (email.substring(idx+1).length()>=1);
//		}else {
//			System.out.println("주소 글자갯수가 부족하여 사용할수 없습니다.");
//		}
//	
		System.out.println("-----------** 문제 : 이메일주소 사용 가능?  **----------------");
	      boolean result=true;   
	      String error="";
	      //사용자가 입력한 문자열이 요구사항과 맞지 않는 이유를 출력
	      boolean temp = idx !=-1 && idx == email.lastIndexOf('@');   //1번 조건
	      if(!temp) {
	         result=false;
	         error += "*@ 문자는 1개만 있어야 합니다.\n";       //문자열에서 += 연산 : += 왼쪽 error 변수의 문자열에 += 오른쪽의 문자열을 연결합니다. 
	      }
	      
	      if(!isAlphabet(ch0)) //! not 연산 - 매우 중요
	      {
	         result=false;
	         error+="*시작문자는 영문대소문자만 가능합니다.\n";       
	      }
	      
	      if(idx != -1 && email.substring(0, idx).length() < 5) //매우 중요
	      {
	         result=false;
	         error+="*계정이름은 5글자 이상으로 합니다.\n";
	      }
	         
	      if( email.substring(idx+1).indexOf('.')==-1)
	      {
	         result=false;
	         error+="*@ 뒤의 도메인 주소에는 . 이 1개 이상이어야 합니다.";
	      }
	      
	      if(result) {
	         System.out.println("입력하신 메일주소는 사용가능합니다.");
	      }else {
	         System.out.println("입력한 메일주소는 사용불가능 합니다.");
	         System.out.println("이유 : \n" + error);    //불가능 사유는 꼭 여기서 출력하지 않아도 됩니다.
	      }
	      sc.close();
	}

	public static boolean isAlphabet(char ch0) {
		return (ch0>='A' && ch0<='Z' || ch0>='a' && ch0<='z');
	}
	
	
	
}
