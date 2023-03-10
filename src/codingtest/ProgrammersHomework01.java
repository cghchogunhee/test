package codingtest;

public class ProgrammersHomework01 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,6,7,8,0};
		int[] b = {5,8,4,0,6,7,9};
		int[] c = {7,77,17};
		int[] d = {10,29};
		
		System.out.println("solution1 확인");
		System.out.println(solution1(a));	//14
		System.out.println(solution1(b));	//6
		System.out.println("solution2 확인");
		System.out.println(solution2(3,20,4));	//10
		System.out.println("solution3 확인");
		System.out.println(solution3(c));	//4
		System.out.println(solution3(d));	//0
		
		}
	
	
	
	/*0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. 
	 * numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 
	 * 하도록 solution 함수를 완성해주세요.
	*/
		public static int solution1(int[] numbers) {
			int answer = 45;
			
			for(int i=0; i<numbers.length;i++) {
				answer-=numbers[i]; 
			}
			
			return answer;
		}

	/*
	 * 새로 생긴 놀이기구는 인기가 매우 많아 줄이 끊이질 않습니다. 이 놀이기구의 원래 이용료는 price원 인데, 놀이기구를 N 번 째
	 * 이용한다면 원래 이용료의 N배를 받기로 하였습니다. 즉, 처음 이용료가 100이었다면 2번째에는 200, 3번째에는 300으로 요금이
	 * 인상됩니다. 놀이기구를 count번 타게 되면 현재 자신이 가지고 있는 금액에서 얼마가 모자라는지를 return 하도록 solution
	 * 함수를 완성하세요. 단, 금액이 부족하지 않으면 0을 return 하세요.
	 */
	    public static long solution2(int price, int money, int count) {
	        long answer = 0;
//	        for(int i=0; i<count; i++) {
//	        	answer+=price*(i+1);
//	        }
//	        if(money>=answer) {
//	        	answer=0;
//	        }else {
//	        	answer-=money;
//	        }
//	        return answer;
	        
	        answer = price*count*(count+1)/2;
	        return answer>money? answer-money : 0;
	    }
	
	/*
	 * 머쓱이는 행운의 숫자 7을 가장 좋아합니다. 정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return 하도록
	 * solution 함수를 완성해보세요.
	 */

	    public static int solution3(int[] array) {
	        int answer = 0;
	        String str= null;
	        for(int i=0;i<array.length;i++) {
	        	str = String.valueOf(array[i]);
	        	for(int j=0;j<str.length();j++) {
	        		if(str.charAt(j)=='7') {
	        			answer++;
	        		}//if
	        	}//for
	        }//for
	        return answer;
	    }
}
