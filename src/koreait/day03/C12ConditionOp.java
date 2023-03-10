package koreait.day03;

public class C12ConditionOp {
	
	//관계연산 테스트 : 연산 결과는 true , false 과 같은 boolean 타입 ->조건식에 사용됩니다.
	
	public static void main(String[] args) {
		
		int korean = 98;
		int math = 77;
		
		boolean result;
		
		result = korean > 90;	//true
		
		
		if(result)		//if : ~이면 () 안은 조건식, 조건식이 참일때만 명령 실행 
				System.out.println("1. 국어과목 우수학생");
		//실행할 명령이 하나이면 중괄호가 없어도 된다.
		if(math < 60)
			System.out.println("2. 수학 보충 수업 대상 학생");
		
		result = math >90;	//false
		if(result) {
			System.out.println("3. result : " + result);
			System.out.println("4. 수학과목 우수 학생 입니다.");
		}else {	//else : 그렇지 않으면, 조건식이 거짓일때 명령 실행.
			
			System.out.println("5. result : " + result);
			System.out.println("6. 4수학과목 우수학생 아닙니다.");
		}
		
		korean = 97;
		math = 85;
		//관계연산과 논리연산으로 조건식 연습 : 수학과 국어 점수 모두 80점이면 우수 학생
		if(korean >= 80 && math >=80) {
			System.out.println("수학과 국어 모두 80점 이상입니다.");
		}else if(math >= 80){
			System.out.println("수학 우수 학생입니다.");
		}else if(korean >= 80) {
			System.out.println("국어 우수 학생입니다.");
		}else {
			System.out.println("평범한 학생입니다.");
		}
		
		
		
		
		
	}//main end <--중괄호가 많아지면 주석으로 통해 구분하여 헷갈리지 않게 한다.

}//class end
