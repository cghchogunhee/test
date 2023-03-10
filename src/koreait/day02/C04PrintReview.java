package koreait.day02;

public class C04PrintReview {
	
	//출력 복습 + 데이터변수 예제 준비
	public static void main(String[] args) {
		System.out.println("─────────────────────");
		System.out.println("\t\t수업 정보");
		System.out.println("─────────────────────");
		System.out.println("1. 총 수업시간 : " + 712 +"시간");
		System.out.println("2. 수업 일수 : " + 118.4 + "일");
		System.out.println("3. 기본 요건 : 영타 속도" + 30 + "WPM 이상");
		System.out.println("4. 선수 과정 필요? " + false);
		System.out.println("─────────────────────");
		
		
		System.out.println("\n변수 활용");
		System.out.println("변수의 사용 : 데이터형식(키워드) 변수이름(개발자정의) = 값");
		//변수의 값들은 사용자입력 또는 데이터베이스, 파일들에서 받을 수 있습니다.(alt+위/아래방향키 = 줄바꿈)
		int hours = 712;				//정수	
		double days=118.4;			//실수
		int wpm = 30;
		boolean status = false; //논리형 참,거짓으로 정의
		//변수 이름 정의시 숫자나 기호를 앞에 쓰지 않는다.ex) int 2hours
		
		System.out.println("─────────────────────");
		System.out.println("\t\t수업 정보");
		System.out.println("─────────────────────");
		System.out.println("1. 총 수업시간 : " + hours +"시간");
		System.out.println("2. 수업 일수 : " + days + "일");
		System.out.println("3. 기본 요건 : 영타 속도" + wpm + "WPM 이상");
		System.out.println("4. 선수 과정 필요? " + status);
		System.out.println("─────────────────────");
		
		//내가 푼 유형
		System.out.printf("\nprintf메소드 활용\n");
		System.out.println("─────────────────────");
		System.out.println("\t\t수업 정보");
		System.out.println("─────────────────────");
		System.out.printf("%s%d%s\n" , "1. 총 수업시간 : " , hours, "시간");
		System.out.printf("%s%.1f%s\n" , "2. 수업 일수 : " , days , "일");
		System.out.printf("%s%d%s\n" , "3. 기본 요건 : 영타 속도" , wpm , "WPM 이상");
		System.out.printf("%s%s\n" , "4. 선수 과정 필요? " , status);
		System.out.println("─────────────────────");
		
		//수업시간 강사님이 푼 유형
		System.out.printf("1. 총 수업시간 : %d 시간\n", hours);
		System.out.printf("2. 수업 일수 : %f 일\n", days);			//실수 출력형신은 %f - 소수점 아래 6자리 출력
		System.out.printf("2. 수업 일수 : %.2f 일\n", days);		//실수 출력형신은 %f - 소수점 아래 자리수 지정
		System.out.printf("3. 기본 요건 영타 속도 : %d WPM 이상\n", wpm);
		System.out.printf("4. 선수 과정 필요? %s", status);
		
		System.out.printf("\n총 수업시간 : %d (%.1f일) , 기본 요건 : 영타속도 %dWPM 이상(선수과정 필요? %s)\n"
										,hours,days,wpm,status);
		
		System.out.println("총 수업시간 : " + hours + " ("+days + "일), 기본 요건 : 영타 속도 "
											+ wpm + "WPM 이상 (선수과정 필요? " + status + ")");
		
		
		
		//%d = 정수형, %f = 실수형, %s = 문자열 \n,%n = 줄바꿈
		//int 4byte, double 8byte, String 영문자 당 1byte
		/*1byte =8bit
		*/
		/*기본형 타입(primitive)
		 * 변수 형식 키워드
		 * byte			정수
		 * short		정수
		 * int			정수
		 * long			실수
		 * float			실수
		 * double		실수
		 * boolean	논리형
		 * char			문자형
		*/
	}

}
