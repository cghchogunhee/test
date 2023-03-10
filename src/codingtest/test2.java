package codingtest;

public class test2 {
	int b;		//전역 초기화 값이 자동으로 들어간다.
	static int g;
	
	
	public static void main(String[] args) {
		
		int c;	//지역	- 초기화 값을 정해줘야한다.
		c=0;
		System.out.println(g+3);
		Test g= new Test();
//			g.a=g.a+3;//a=a+3 
		g.a=g.a+3;
		test2 f=new test2();
//		System.out.println(g.a+3);
		System.out.println(f.b+3);
		System.out.println(c+3);
	}

}
