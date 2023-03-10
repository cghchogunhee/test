package koreait.day02;

public class C09Exercise {
	//변수,대입문,연산자 활용 연습문제
	public static void main(String[] args) {
		
		int width = 23;		//너비(가로)
		int height = 19;	//높이(세로)
		int area;				//사각형 넓이 저장
		double tri_area;	//삼각형 넓이 =	너비*높이/2
		double round;		//원의 둘레 = 2*3.14*반지름
		
		System.out.println("[[사각형 도형 넓이 구하기]]");
		//수식
		area = width*height;
		//출력
		System.out.println("사각형의 넓이 : " + area+"㎠");
		
		
		
		System.out.println(("[[삼각형 도형 넓이 구하기]]"));
		//수식
		tri_area = (double)(width*height)/2; //정수*정수/정수(정수끼리의 연산) 이므로 정수값(몫)이 나오므로 강제 형변환을 해준다.
		//출력
		System.out.println("삼각형의 넓이 : " + tri_area+"㎠");
		System.out.println("삼각형의 넓이 : " + (int)tri_area+"㎠");//정수값으로 출력
		
		
		
		
		System.out.println("[[원 도형 둘레 구하기]]");
		int radius = width;	//원의 반지름
		final double pi = 3.14;		//final 키워드 : 값을 변경할수 없다. 즉 상수(constant)
		radius = 33; //final(상수) 값이 아니므로 값을 다시 정의 할수 있다.
		//pi=3.11; //오류 : pi는 상수다.
		//수식
		round = pi*2*radius; //실수값이 있으므로 실수값이 나온다.
		//출력
		System.out.println("원 도형 둘레 : " + round+"㎝(반지름 : "+ radius +")");
		
		
		
	}

}
/*
 * 대입문 기호 = (등호) : 오른쪽 값(리터럴)/수식/변수가 왼쪽 변수로 대입. 수식에 사용되는 연산은 다음과 같습니다. 
 * 산술연산 + , - , * , * /(나눗셈 몫) , %(나눗셈 나머지,정수연산에서만) 
 * 관계연산 ==(동등,같다.) , != (같지 않다.) , > , < , >= , <=
 * 논리연산 && (and,그리고) , || (or, 또는) , !(not) 
 * 
 * 참고 : ++ ,-- , += , -= , *=, /= 는 연산결과를 대입하는 축약연산 입니다.
 */
