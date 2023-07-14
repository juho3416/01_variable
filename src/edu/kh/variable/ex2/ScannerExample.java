package edu.kh.variable.ex2;

// import : 대른 패키지에 존재하는 클래스를 얻어오는 구문
import java.util.Scanner; // java.util 패키지에서 Scanner 라는 설계도를 수입한 것

public class ScannerExample {

	public static void main(String[] args) {
		
		// Scanner : 프로그램 실행 중 키보드 입력을 받을 수 있게하는 역할 (콘솔 창에 입력)
		
		// Scanner 생성
		// -> 프로그램 안에 스캐너라는 기계를 만다는 것
		
		Scanner sc = new Scanner(System.in);
		// 지금은 System.in을 키보드로 입력한 것이 나온다고만 생각.
		// 오류 원인 -> 만들고 싶은데 설계도(class)가 없어서 못만들고 있음
		// -> import 구문 작성시 오류 해결
		// 객체타입 Scanner 입력. Scanner sc = ... //객체타입은 나중에 배움.
		// 즉, 스캐너타입 변수명(sc) = ...
		
		System.out.print("정수 1 입력 : ");
		
		int input1 = sc.nextInt();
		// nextInt() : 다음 입력된 정수를 읽어옴 (키보드로 입력된 정수를 읽어옴)
		// 입력받은 정수를 input1 변수에 대입
		
		System.out.print("정수 2 입력: ");
		int input2 = sc.nextInt();
		
		System.out.printf("%d + %d = %d\n", input1, input2, input1 + input2);
		
		
		
		
	}
	
}
