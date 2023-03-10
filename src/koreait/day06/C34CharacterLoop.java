package koreait.day06;

public class C34CharacterLoop {

	//문자형 데이터에 대한 반복
	public static void main(String[] args) {
		
//		for(char ch='A'; ch<='Z'; ch++) 
//			System.out.println(ch);
//		
//		System.out.println("알바벳 개수 : "+('Z'-'A'+1));
		
//		for(char ch='가'; ch<='힣'; ch++)
//			System.out.println(ch);
//		System.out.println("한글 UTF-8 문자 개수 : "+ ('힝'-'가'+1));
		
		//한줄에 10개씩 출력하기
		System.out.println("------------------------------");
		char start = 'a';
		for(int i=0;i<'z'-'a'+1;i++) {
			if(i!=0 && i%10==0)System.out.println();
			System.out.print((char)(start+i)+" ");
		}
		
		
		//한글 문자 한줄에 10개씩
		System.out.println("\n----------------------------");
		start = '가';
		for(int i=0; i<'힣'-'가'+1;i++) {
			if(i!=0 && i%10==0)System.out.println();
			System.out.print((char)(start+i)+" ");
			}
		
		
		
		//한줄 10개씩 출력을 while문으로 하기
		System.out.println("\n----------------------------");
		char ch = 'a';
		int i = 0;
		while(i<'z'-'a'+1) {
			System.out.print((char)(ch+i++)+" ");
			if(i%10==0)System.out.println();
		}
		
		
		
		
	}//main

}
