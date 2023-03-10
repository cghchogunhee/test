package koreait.day05;


//assign : 할당, 대입
public class C26AssignTest {

	public static void main(String[] args) {
		
		//1. 증강연산 : ++ , --감소
		int i = 10;
		i = i+1;	//11
		i++;		//postfix : 접미어, 후치	//12
		++i;		//prefix : 접두어, 전치		//13
		System.out.println("i = " + i); // 13
		
		//증강연산이 전치 또는 후치 각각 실행결과 다른 경우 : 다른 명령문과 함께 쓰일때입니다.
		System.out.println("++i = " + ++i);		//전치일때는 증강시킨 후 출 //출력14
		System.out.println("i++ = " + i++);		//후치일때는 출력 후 증강	//출력14 다음 받을때 15
		
		System.out.println("i++ = " + i++);		//후치일때는 출력 후 증강	//출력 15 다음 받을때 16
		System.out.println("++i = " + ++i);		//전치일때는 증강시킨 후 출	//출력 17
		
		int sum=0;
		i=1;
		sum = sum +1;	//sum변수의 값 + i 변수의 값을 계산해서 결과는 sum으로 저장
		
		System.out.println("sum = " + sum); //1
		
		sum = sum + i++;	//1+1
		
		System.out.println("sum + i++ = " + sum); //2
		
		sum = sum + ++i;	//2 + 3(i++이후 2로받아서)
		
		System.out.println("sum + ++i = " + sum); // 5
		
		
		
		
		//2. 축약대입(할당)연산
		//또는 i=i+2;
		sum=0;
		sum = sum+ 3;	//계산에 쓰이는 변수와 할당받는 변수가 같을 때 사용
		sum +=3;		//		ㄴ 축약대입
		System.out.println(sum);
		
		sum = sum * 11;
		System.out.println(sum);
		sum *=11;
		System.out.println(sum);
		
		i=11;
		i%=2;	//i = 1%2; -> i를 2로 나눈 나머지
		System.out.println(i);
		i/=2;	//i = i/2; -> i를 2로 나눈 몫
		System.out.println(i);
		
		sum=0; i=1;
		sum += i;	//sum = sum + i;
		System.out.println(sum);
		sum += i++;	//sum = sum + i++;
		System.out.println(sum);
		sum += ++i; //sum = sum + ++i;
		System.out.println(sum);
		
		
		
	}

}
