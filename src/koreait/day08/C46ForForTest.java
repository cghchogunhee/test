package koreait.day08;

public class C46ForForTest {

	//반복문의 중첩 : for 안에 for, while안에 for , while안에 while
	public static void main(String[] args) {
		
		
		for(int i=0;i<5;i++) {
			for(int k=6;k<10;k++) {
				System.out.println("i=" + i + ",k=" + k);
			}//두번째 for
			System.out.println("-------------");
		}//첫번쨰 for
		
		System.out.println("\n중첩for문 사용예1) : 2차원 배열");
		int[][] arr = new int[5][4];
		//배열의 배열 : new int[4]가 5개인 배열.- 20개의 정수 저장
		int[][] arr2 = {{1,2,3,4}, 		//0번	//arr2[i].length 값이 모두 4
						{11,12,13,14},	//1번
						{21,22,23,24},	//2번
						{31,32,33,34},	//3번
						{41,42,43,44}	//4번
		};
		//배열의 요소갯수가 다른 경우
		int[][] arr3 = {{1,2,3}, 	//arr3[i].length 값이 각각 다릅니다.	
				{11,12},	
				{21,22,23,24},	
				{31,32,33,34,35},	
				{41,42,43,44}	
		};
		
		
		//arr2[1][3]의미는 배열번호 1번, 인덱스값3 => 값 14
		for(int i=0;i<arr2.length;i++) {		//int i=0;i<5;i++는 배열의 갯수
			for(int j=0;j<arr2[i].length;j++) {	//int j=0;j<4;j++는 각 배열 요소의 갯수
				System.out.println("i=" + i + ",j=" + j + ",배열값="+arr2[i][j]);
			}//두번째 for
			System.out.println("-------------");
		}//첫번쨰 for
		
		System.out.println("\n중첩for문 사용예2) : 모양 배열");
		//별찍기 : 
		//	★
		//	★★
		//	★★★
		//	★★★★
		//	★★★★★
		for(int i=0;i<7;i++) {//줄
			for(int k=0;k<i+1;k++) {// 줄당 ★찍는 개수
				System.out.print("★");
			}//두번째 for
			System.out.println();
		}//첫번쨰 for
		
		
		
	}//main

}
