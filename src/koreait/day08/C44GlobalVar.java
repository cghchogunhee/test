package koreait.day08;

public class C44GlobalVar {

	//전역(global)변수가 선언되는 위치
	//전역 변수 특징 : 초기값이 자동 설정 (0, 0.0, false, null)
	
	int count;				//객체를 생성해야 사용할 수 있는 변수
	static int val;			//객체를 생성하지 않고 사용할 수 있는 변수
	static final int num=123;//		"			+ 값을 변경 할 수 없는(final) 상수
							//						ㄴ 반드시 초기값이 필요.
	
	//지역변수는 클래스 범위 안에서 생명주기(life cycle)를 갖는 변수입니다.
	//지역변수는 선언된 블록{} 안에서 			"
	public static void main(String[] args) {
		
		testMethod();
		val=99;
		testMethod();
		
	}

	public static void testMethod() {
		int test=999;
		System.out.println("testMethod 시작-----");
		System.out.println("val = " + val);
		System.out.println("num = " + num);
		System.out.println("test = " + test);
//		System.out.println("count = " + count);	//static은 static만 사용할 수 있습니다.
		System.out.println("testMethod 끝-----");
		
	}//변수 test는 이 메소드가 실행이 끝나면 없어지는 변수입니다.
	
	public void test2() {
		System.out.println("test2 시작-----");		//static 메소드가 아니므로
		System.out.println("val = " + val);			//전역변수는 static 상관없이 사용가능 합니다.
		System.out.println("num = " + num);
		System.out.println("count = " + count);	
		System.out.println("test2 끝-----");
	}
	
	
}
