package codingtest;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCut {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("치시오 >> ");
//		String text = sc.nextLine();
//		//System.out.println(Arrays.toString(solution(text,3)));
//		System.out.println(solution(text,3));
//		sc.close();
		
		String[] result = solution("abcdef123",4);
		System.out.println(Arrays.toString(result));
		
		result = solution("abc1Addfggg45556b", 6);
		
		System.out.println(Arrays.toString(result));
	}
	
	
	/*문자열 my_str과 n이 매개변수로 주어질 때, my_str을 길이 n씩 잘라서 저장한 배열을
	 *  return하도록 solution 함수를 완성해주세요.
	*/
	
    public static String[] solution(String my_str, int n) {
    	
    	int strlen = my_str.length(); //my_str 배열 크기를 변수로 설정
    	System.out.println(strlen);
    	
    	int size = my_str.length()/n;	//변수 size에 my_str 배열 크기/n 값을 초기화
    	
    	size = my_str.length()%n>0 ? size+1:size;	//삼항연산식으로 상황에 따라 쓸수 있게 선언
    	
    	String[] answer = new String[size];			//String 배열로 선언
    	for(int i=0;i<size;i++) {		//삼항연산식으로 상활에따라 size+1 또는 size값이 들어가게 되도록 설정되어 있다.
    		int begin = i*n;
    		int end = begin+n;
    		System.out.println("i = "+i+",begin = " +begin+",end = "+end);
    		answer[i]=end>strlen ? my_str.substring(begin):my_str.substring(begin,end);
    	}
    	
    	
//        String[] answer = {};
//        
//        for(int i=0;i<my_str.length()/n;i++) {
//        	if(my_str.length()%n==0) {
//        		answer[i]=my_str.substring((n*i),((i+1)*n));
//        	}
//        }
//        if(my_str.length()%n>1) {
//        	answer[my_str.length()/n]=my_str.substring((my_str.length()/n)+1);
//        }
//        
        
//        if(my_str.length()%n>0) {
//        	answer[my_str.length()/n+1]=my_str.substring(my_str.length()/n+1);
//        }
        
        
//        int i =0;
//        String str = my_str.substring((n*i),(((i+1)*n))+1);
//        if(my_str.length()%n==0) {
//        	for(i=0;i<my_str.length();i++) {
//        		answer[i];
//        	}
//        }
//        if(my_str.length()%n>1) {
//        	answer[]=my_str.substring(my_str.length()*n);
//        }
        
        
        return answer;
    }

	
	
	
}
