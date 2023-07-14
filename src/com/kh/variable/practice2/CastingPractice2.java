package com.kh.variable.practice2;

import java.util.Scanner;

public class CastingPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 실수형으로 국어, 영어, 수학 세 과목의 점수를 입력 받아 총점과 평균을 출력하세요.
			이 때 총점과 평균은 정수형으로 처리하세요.
		 * 
		 */
		
		/*
		
		//나의 이상한 풀이
		
		
		double kPoint = 90.0;
		double ePoint = 90.0;
		double mPoint = 90.0;
				
		System.out.println("국어 : " + kPoint);
		System.out.println("영어 : " + ePoint);
		System.out.println("수학 : " + mPoint);
		System.out.println();
		System.out.printf("%s : %.0f\n", "총점", (kPoint + ePoint + mPoint) );
		System.out.printf("%s : %.0f\n", "평균", (kPoint + ePoint + mPoint)/3 );
		
		// %f 와 %d가 했갈려 코드에러가 계속났다. 기억력 문제로 %d를 double로 기억함.
		// %d는 decimal이라 실수형은 %f를 써야 한다.
		
		*/
		
		
		// 강사님풀이
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("국어 : ");
		double input1 = sc.nextDouble();
		
		System.out.print("영어 : ");
		double input2 = sc.nextDouble();
		
		System.out.print("수학 : ");
		double input3 = sc.nextDouble();
		
		System.out.printf("총점 : %d\n", (int)(input1 + input2 + input3));
		System.out.printf("평균 : %d\n", (int)(input1 + input2 + input3)/3);		
		
		
	
	}

}
