package koreait.day03;

public class C14MaxMin {
	
	//3개의 정수 값에서 최대값과 최소값 출력하기
	public static void main(String[] args) {
		
		int n1, n2, n3;
		int max;
		int min;
		
		n1 = 0; n2 = 40; n3 = 51;
		
		if(n1>n2) { //n1, n2 중 큰값을 max에 저장
			max = n1;
			min = n2;
		}else {
			max = n2;
			min = n1;
		}
		
		if(max < n3) {
			max = n3;
		}else if(min > n3) {
			min = n3;
		}
		
		System.out.println("n1 = " + n1 + ", n2 = " + n2 + ", n3 = " + n3);
		System.out.println("max = " + max);
		System.out.println("min = " + min);
	
//		int min;
//		
//		if(n1>n2) {
//			min=n2;
//		}else {
//			min=n1;
//		}
//		
//		if(min>n3) {
//			min = n3;
//		}
//		
//		System.out.println("min = " + min);
		
		

	}

}
