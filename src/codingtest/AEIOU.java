package codingtest;

public class AEIOU {
	
	//모음제거
	/*영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다.
	 *  문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
	*/
	public static void main(String[] args) {
		System.out.println("모음 제거 결과 확인 : " + solution("message"));
		System.out.println("모음 제거 결과 확인 : " + solution("static"));
		System.out.println("모음 제거 결과 확인 : " + solution("global"));
		System.out.println();
		System.out.println("모음 제거 결과 확인 : " + solution2("message"));
		System.out.println("모음 제거 결과 확인 : " + solution2("static"));
		System.out.println("모음 제거 결과 확인 : " + solution2("global"));
		
		
		
		
	}
	//방법1 : 문자열의 replace 메소드 사용
	public static String solution(String my_string) {
		String answer = "";
		answer = my_string.replace("a","");
		//my_string 이 참조하는 문자열에서 "a"를 ""로 변환하기.변환한 문자열은 answer 변수가 참조.
		answer = answer.replace("e","");
		answer = answer.replace("i","");
		answer = answer.replace("o","");
		answer = answer.replace("u","");
		
		return answer;
	}
	
	//방법2 : 배열 사용
	public static String solution2(String my_string) {
		String answer = "";
		char[] moeum = {'a','e','i','o','u'};
		
		for(int i=0;i<my_string.length();i++) {
			char ch = my_string.charAt(i);
			int j;
			for(j=0;j<moeum.length;j++) {
				if(ch==moeum[j])break;
			}
			if(j==moeum.length) {
				answer+=ch;
			}
		}
		return answer;
	}

}
