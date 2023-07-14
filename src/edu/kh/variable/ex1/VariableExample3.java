package edu.kh.variable.ex1;

public class VariableExample3 {

	public static void main(String[] args) {
		
		/* 형변환(casting) : 값의 자료형을 변환 하는 것. (단, boolean 제외)
		 * 
		 * **형변환은 왜 필요할까?
		 * 컴퓨터는 기본적으로 같은 자료형끼리만 연산이 가능함.
		 * 다른 자료형과 연산 시 오류 발생.
		 * --> 이런 상황을 해결하기 위해서 필요한 기술이 형변환.
		 * 
		 * 자동 / 강제 형변환이 존재.
		 * 
		 */
		
		int num1 = 10;
		double num2 = 3.5;
		
		System.out.println("자동 형변환 결과 " + (num1 + num2));
		// 원래 에러가 발생해야 되지만 "자동 형변환" 덕분에 발생하지 않음.
		
		int i1 = 3;
		double d1 = i1;  //->이때 자동 형변환 인듯
		
		System.out.println("i1 : " + i1); //3
		System.out.println("d1 : " + d1); //3.0
		// double은 실수만 저장할 수 있는 자료형
		// 정수가 대입되는 연산이 수행되면 
		// 정수 -> 실수로 자동 형변환
		
		System.out.println(d1 + num2); // double + double
		//6.5
		
		
		// int -> long 형변환
		int i2 = 2_100_000_000; // 21억 (실생활에서 ,대신 코딩에서는 _로 숫자단위를 구분 가능)
		
		long l2 = 10_000_000_000L; // 100억
		
		long result2 = i2 + l2;
		// int + long -> long + long = long (자동 형변환)
		
		System.out.println("result2 : " + result2);
		
		
		// char -> int 형변환
		/* char 자료형은 문자형이지만 실제 저장하는 값은
		 * 0 부터 6만5천번 정도 사이에 있는 숫자
		 */
		
		char ch3 = 'V' ; //문자형이므로 홑따옴표 붙여야 함!
		System.out.println(ch3); //V
		
		int i3 = ch3;
		System.out.println(i3); //86
		
		char ch4 = '각';
		int i4 = ch4; //44033
		
		System.out.println(i4);
		
		
		// 데이터 오버플로우
		// (byte 기준 설명) 127+1을 하면 범위를 초과한 128이 되고 허용된 범위 이상의 비트를 침범하게 되는데 이를 오버플로우라고 한다.
		// byte형 허용범위 최소값인 -128이 되는 것이다.
		
		// 오버플로우 현상은 컴퓨터가 미리 예측할수가 없다!!!
		// -> 개발자가 미리 예측해야함.
		
		int i6 = 2147483647; // int의 최대값
		int result6 = i6 + 1;
		System.out.println(result6); // -2147483648
		
		
	}
}
