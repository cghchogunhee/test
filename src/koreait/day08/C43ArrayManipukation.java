package koreait.day08;

public class C43ArrayManipukation {
	
	//배열 특정 위치에 데이터 삽입/삭제
	public static void main(String[] args) {
		
		int[] arr = {11,22,33,44,55,66,77};
		
		System.out.println("::현재 배열의 값 학인::");
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		
		//인덱스 k위치에 새로운 값을 삽입한다. : 배열의 크기는 증가안되고 데이터를 뒤로 하나씩 이동
		//								ㄴ마지막 위치 값이 없어진다.
		int k=2;
		for(int i=arr.length-2;i>=k;i--) {
			arr[i+1]=arr[i];	//**i인덱스의 값을 i+1인덱스 위치로 이동.
		}//  ㄴarr[6]=arr[5];-->한칸씩 미루는 공식
		arr[k]=90;
		
		System.out.println("\n::현재 배열의 값 학인::");
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		
		//인덱스 k위치에 데이터를 삭제한다. : 배열의 크기는 김소되지 않고 데이터를 앞으로 하나씩 이동
				//								ㄴ마지막 위치 값은 0으로 한다.(추가조건)
		k=4;
		for(int i=k;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=0;		//마지막 인덱스값은 0으로 대입
		System.out.println("::삭제 결과 배열의 값 학인::");
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		
		System.out.println("::arr2배열 테스트 - 삽입::");
		int[] arr2= {99,88,76,65,54,43,32,22,11};
		arrayPrint(arr2);
		arrayInsert(arr2, 4, 123);
		arrayPrint(arr2);
		arrayRemove(arr2, 2);
		arrayPrint(arr2);
		
		arrayRemove(arr2, 2);
		arrayPrint(arr2);
		
	}//main

	//정수 배열의 값 출력하는 메소드
	public static void arrayPrint(int[] arg) {
		for(int i=0;i<arg.length;i++) {
			System.out.print(arg[i]+"\t");
		}
		System.out.println();
	}//arrayPrint 메소드
	
	
	
	//인덱스 k위치에 새로운값을 삽입하는 메소드
	public static void arrayInsert(int[] arg,int k,int val) {
		for(int i=arg.length-2;i>=k;i--) {
			arg[i+1]=arg[i];
		}
		arg[k]=val;
	}//arrayInsert 메소드
	
	//인덱스 k위치 데이터를 삭제하는 메소드
	public static void arrayRemove(int[] arg, int k) {
		for(int i=k;i<arg.length-1;i++) {
			arg[i]=arg[i+1];
		}
		arg[arg.length-1]=0;
	}//arrayRemove 메소드
	
	
	
	
	
	
	
}
