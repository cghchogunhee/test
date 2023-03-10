package koreait.day04;

public class C23_StringMethod {
	//C22 메소드 형식으로 String 클래스의 메소드 분석하기
	public static void main(String[] args) {

		String message ="hello~";		//java.lang.String  (기본패키지 클래스)
		
		int len = message.length();
		char temp = message.charAt(3);		//0부터 시작해서 3번 문자가 무엇인지 리턴.
		boolean isState = message.equals("Hello~");    //문자열이 같은지
		
		System.out.println("length() = " + len);	//6
		System.out.println("charAt(3) = " + temp);   //l 
		System.out.println("equals(\"Hello\") = " + isState);   //false
		
		System.out.println("indexOf('e') =" + message.indexOf('e'));	// 1번 위치
		System.out.println("indexOf(\"lo\") ="+message.indexOf("lo"));	// 3번 위치
		System.out.println("indexOf(\"lo\") ="+message.indexOf("ol"));	// -1 : 찾는 문자열이 없을때
		
		String test = "hello~hello~";
		System.out.println("test.indexOf(\"lo\") ="+test.indexOf("lo"));	// 3번
		//lastIndexOf : 찾는 문자열이 여러번 포합될때 마지막 위치
		System.out.println("test.lastIndexOf(\"lo\") ="+test.lastIndexOf("lo"));	//일치하는 마지막위치 9번
		
		
		//substring(start, end) : start부터 end 직전까지 추출하기, end 생략되면 마지막문자까지 추출.
		System.out.println("substring(2) =" + message.substring(2));   //부분추출 : llo~
		System.out.println("substring(2,4) =" + message.substring(2,4));  //ll , 2번부터 2개(4-2)
		//substring에서 지정할수 있는 숫자는 0부터 ~ 6(length())까지 그 외의 값을 쓰면 IndexOutOfBounds 오류 발생합니다.
		
		System.out.println("substring(1,4) =" + message.substring(1,4));  //ell , 1번부터 3개(4-1)
		
		System.out.println("replace(\"ll\", \"*@\") ="+message.replace("ll", "*@*")); //치환 : he*@*o~
		System.out.println("startsWith(\"H\") = "+message.startsWith("H"));		//false
		System.out.println("endsWith(\"~\") = "+message.endsWith("~"));		//true
	}
	// "를 출력할때는 \(역슬래쉬) 필요합니다. -> " 기호는 문자열시작으로 해석되기 때문입니다.
}

//String 클래스의 메소드는 많습니다. 다 외우고 사용하는 것이 아니고 메소드의 이름,인자,리턴형식을 참조해서 사용합니다. 
//리턴값 형식은?		
/*
 * 아래 메소들의 리턴값 형식은?
message.length(); 		//public int length() : 길이		
message.charAt(0);		//public char charAt(int index) 

message.equals("Hello~");   //public boolean equals(Object anObject) , Object는 모든 타입
							//message 가 String 타입이므로 Object 는 String으로 해석합니다.
message.indexOf('e');		//int
message.indexOf("lo");		
message.substring(2);		//String
message.substring(2, 4);
message.replace("ll", "*@");   //String
*/		
//메소드 오버로딩(overloading) : 메소드 이름과 리턴형식은 같고 인자값의 갯수와 형식이 다르게 정의된 것.	

