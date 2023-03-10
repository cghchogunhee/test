package codingtest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class AddTwoNum {

	public static void main(String[] args) {
		
		int[] arr = {2,1,3,4,1};
		int[] result = soulution(arr);
		System.out.println(Arrays.toString(result));
		System.out.println(Arrays.toString(soulution(new int[] {5,0,2,7})));
		
		
		Set<Integer>s1=new HashSet<Integer>();
		Set<Integer>s2=new TreeSet<Integer>();	//정렬 기능이 있는 set
		
		s1.add(11);s1.add(5);s1.add(15);s1.add(25);s1.add(15);
		s2.add(11);s2.add(5);s2.add(15);s2.add(25);s2.add(15);
		
		System.out.println("s1 : " +s1);
		System.out.println("s1 : " +s2);
		
		System.out.println("s1");
		for(Integer a : s1) System.out.println(a);
		System.out.println("\ns2");
		for(Integer a : s2) System.out.println(a);	//정렬된 상태로 불러온다
	}

	public static int [] soulution (int[] numbers) {
		Set<Integer>set=new HashSet<>();
		for(int i=0; i<numbers.length;i++) {
			for(int j=0; j<numbers.length;j++) {
				if(i!=j) {
					set.add(numbers[i]+numbers[j]);
				}//if
			}//for
		}//for
		
		System.out.println("set : " +set);
		//컬렉션 타입을 배열 타입으로 변환하는 메소드
//		set.toArray();	//리턴타입이 저너릭타입(클래스)=>int[]배열이 아니고 Integer[]배열
		//직접 배열선언해서 데이터 복사해주기
		int[] answer = new int[set.size()];
		int i=0;
		for(Integer a :set) {
			answer[i++]=a;	//Integer 타입을 int 로 자동 캐스팅
							//i++은 postfix이므로 대입문 = 실행 후 증가
		}
		
		
		Arrays.sort(answer);
		return answer;
	}
	
	
}
