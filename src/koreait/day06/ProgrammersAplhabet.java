package koreait.day06;

import java.util.Scanner;

public class ProgrammersAplhabet {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int price;
		int result;
		double rate;
		System.out.print("구매할 금액을 입력하세요 >>>>> ");
		price=sc.nextInt();
		
		if(price>=500000) {
			rate = 0.2;
		}else if(price>=300000) {
			rate = 0.1;
		}else if(price>=100000) {
			rate = 0.05;
		}else {
			rate=0;
			System.out.println("할인 적용 구간이 아닙니다.");
		}
		result = (int)(price-(price*rate));
		System.out.println("할인 적용된 가격은 "+ result + "원 입니다.");
		
		sc.close();
	}
}
