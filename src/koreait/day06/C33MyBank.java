package koreait.day06;

import java.util.Scanner;

public class C33MyBank {

	/*
	 * GUI : Graphic User Interface(사용자 명령을 아이콘, 메뉴 방식으로 처리) 예시 : 윈도우 파일탐색기
	 * CUI : Command Line Interface(사용자 명령을 텍스트로만 처리) 예시 : 명령프롬프트
	*/
	public static void main(String[] args) {
		
		//연습문제 : 가상은행의 예금/출금/잔고조회 실행
		Scanner sc = new Scanner(System.in);
		boolean run = true;	//반복을 제어할 변수
		int sel;			//선택 사항 저장
		int balance = 12000;	//현재 잔고(잔액)
		
		while(run) {
			int money;	//while문 지역변수, 입금액과 출금액 저장
			System.out.println("----------------------");
			System.out.println(" 1:예금 | 2:출금 | 3:잔고 확인 | 4:종료");
			System.out.println("----------------------");
			System.out.print("메뉴 선택 >>> ");
			sel = sc.nextInt();
			
			
			switch(sel) {
			case 1 : //예금 처리(예금금액입력 -> 잔액에 더하기) ?
				System.out.print("예금액 > ");
				money = sc.nextInt();
				balance+=money;
				System.out.println("고객님의 잔액은"+ balance + "원 입니다.");
				break;
			case 2 :	//출금 처리(출금금액 -> 잔액보다 많지 않을 때 처리(잔액에서 빼기) ?
				System.out.print("출금액 > ");
				money = sc.nextInt();
				if(balance>=money) {
					balance-=money;
					System.out.println("고객님의 잔액은"+ balance + "원 입니다.");
				}
				else {
					System.out.println("잔액이 부족합니다.");
					System.out.println("고객님의 잔액은"+ balance + "원 입니다.");
				}
				break;
			case 3 : //잔고(balance) 출력
				System.out.println("고객님의 잔액은"+ balance + "원 입니다.");
				System.out.println();	//줄바꿈
				break;
			case 4 :	//반복 종료
				System.out.println("프로그램을 종료합니다.");
				//switch안에서 break로 while 탈출할수 없습니다. ?
				run=false; //while문 조건식을 거짓으로 하여 빠져나간다.
				break;
			default : //1,2,3,4 외 나머지 값일때
				System.out.println("잘못된 선택입니다. 값은 1~4 만 입력하세요.");
			}//switch
		
		//while 반복실행부분의 마지막 부분
		}//while
		
	sc.close();
		
		
	}//main

}
