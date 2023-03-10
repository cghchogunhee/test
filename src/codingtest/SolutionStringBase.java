package codingtest;

import java.util.Scanner;

public class SolutionStringBase {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.print("테스트 텍스트 >> ");
		String test = sc.nextLine();
		System.out.println(solution(test));
		
	}

	/*문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
	 *  예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
	*/
	    public static boolean solution(String s) {
	        boolean answer = true;
	        for(int i=0; i<s.length(); i++) {
		        if(s.length()!=4 && s.length()!=6) {
		        		answer = false;
		        	}
	            if(s.charAt(i)<'0' || s.charAt(i)>'9' ) {
		        		answer = false;
		        	} 
	            }       
	        
	        return answer;
	    
	}
	
	
	
}
