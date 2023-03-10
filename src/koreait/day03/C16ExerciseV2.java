package koreait.day03;

import java.util.Scanner;

public class C16ExerciseV2 {

	public static void main(String[] args) {
		//쇼핑몰 : 00컬러 적립이벤트
		//오늘 구입한 금액이 10만원 이상이면 10% 적입
		//				"				7만원~10만원 미만이면 7% 적립
		//				''				5만원~7만원 미만이면 5% 적립
		//				'				5만원 미만은 3% 적립
		//적립금 원 단위로 출력하기
		
		Scanner sc = new Scanner(System.in);
		int point;			//적립금 : (요구사항) 적립금 원 단위(절사/내림)로 출력하기
		int pay;			//오늘 구매금
		double rate;		//적립율 : 0.1 , 0.7 , 0.05 , 0.03
		int item_no;
		
		System.out.println("00컬러 상품보기");
		System.out.println("1. 🍕🍕🍕🍕 2200원\n"
				+ "2. 🌺🌺🌺🌺🌺 112000원	\n"
				+ "3 또는 4. 🧁🧁🧁 55000원\n"
				+ "5 또는 6. 🍽️🍽️🍽️🍽️ 78300원");
		
		System.out.print("상품을 선택하세요. >>>> ");
		
		
		item_no = sc.nextInt();
		if(item_no ==1) pay=2200;
		else if(item_no ==2) pay=112000;
		else if(item_no ==3 || item_no ==4) pay=55000;
		else if(item_no ==5 || item_no ==6) pay=78300;
		else {
			System.out.println("잘못된 선택입니다.");
			pay=0;
		}	//-> == 연산 조건식일 경우 switch 문으로 바꿀수 있습니다.
		
		
		System.out.println("구매 금액은 "+  pay + "원"  +" 입니다 ");
		
		if(pay>= 100000) {
			rate = 0.1;
		}else if(70000<= pay) {
			rate = 0.07;
		}else if(50000<= pay) {
			rate = 0.05;
		}else {
			rate = 0.03;
		}
		
		point = (int)(pay*rate);
		
		System.out.println("고객님! 오늘 구매하신 금액의 적립율은 " + (int)(rate*100) +"% 입니다.");
		System.out.println("적립 포인트는 " + point + "원 입니다.");
		
		
		sc.close();
		
		
	}

}
