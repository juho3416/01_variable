package edu.kh.variable.ex1;

public class VariableExample2 {

	public static void main(String[] args) {
		
		/* 자바 기본 자료형 8가지
		 * 
		 * 논리형 : boolean(1byte)
		 * 정수형 : byte(1byte), short(2byte), int(4byte), long(8byte)
		 * 실수형 : float(4byte), double(8byte)
		 * 문자형 : char(2byte, 유니코드가 들어가야 하기 때문)
		 * 
		 */
		
		// 변수 선언 : 메모리에 값을 저장할 공간을 할당하는 것.
		// 변수 값 대입(집어넣기) : 변수에 값을 집어 넣는 것.
		
//		int iNum;
//		iNum = 3;
//		
//		int iNum = 3;
		
		// * 카멜(낙타) 표기법
		// 연결되는 두 단어 중 후속단어의 첫 문자를 대문자로 표기
		
		boolean booleanData;
		//메모리에 논리 값(t/f)을 저장할 공간을 1byte 할당하고, 
		//할당된 공간을 booleanData라고 부르겠다.
		
		booleanData = true; // booleanData 변수에 true 값을 집어 넣기
		System.out.println("booleanData : " + booleanData);
		
		byte byteNumber = 127; // 128 넣는 순간 에러
		// 메모리에 정수 값을 저장할 공간을 1byte 할당하고 
		// 할당된 공간을 byteNumber라고 부르겠다.
		// 선언된 byteNumber변수에 처음으로 127을 집어넣음.
		// --> 초기화 : 처음 변수에 값을 대입
		// 여기서는 선언과 동시에 초기화
		
		System.out.println("byteNumber = "+byteNumber);
		
		short shortNumber = 32767; // 변수 선언 및 초기화
		System.out.println("shortNumber = "+shortNumber);
		
	
		
		// 정수 자료형 기본형 (short, byte는 옛날 코드 잔재)
		int intNumber = 2147483647; // 변수 선언 및 초기화
		// 노란색 줄은 워닝으로 에러(빨간색 줄)아님. 워닝은 괜찮음. 코드가 안쓰이거나 하는 등 알림
		
		// 자료형 변수형 = 리터럴;
		// 프로그래밍에서는 대입되는 이 데이터(값 자체)를 리터럴이라는 단어로도 표현합니다!
		
		// **리터럴 : 변수에 대입되거나 작성 되어지는 값 자체
		// + 자료형에 따라 리터럴 표기법이 다름.
		
		long longNumber = 10000000000L; // 대문자L 또는 소문자l (안붙이면 에러)
		// The literal 10000000000 of type int is out of range
		// -> 100억 이라는 값은 int의 범위를 벗어났다! int의 양수부는 21억 몇까지만 가능...
		// 뒤에 L을 붙여줌으로써 long 자료형인것을 나타냄.
		
		float floatNumber = 1.2345f; // 대문자F 또는 소문자f
		// 1.2345까지만 쓰면 에러남. 자료형 맨 앞글자인 f
		// Type mismatch: cannot convert from double to float
		
		// 기본형 (int, double)을 기준으로 컴퓨터는 생각하므로 끝에 L또는 F 붙여야함
		
		double doubleNumber = 3.141592;
		// double이 실수형 중에서 기본형
		// (리터럴 표기법이 없는 실수는 double로 인식)
		// D 또는 d를 뒤에 쓸 수는 있다. -> 3.141592d;
		// 실수형은 float, double 두개 밖에 없기 때문에
		// 자바는 double을 그냥 리터럴 표기법 안붙이고 쓰는 애로 정함.
		
		
		// 문자형 리터럴 표기법 : ''(홑따옴표)
		// -> 문자 하나
		char ch = 'A';
		char ch2 = 66;
		
		/* char 자료형에 숫자가 대입될 수 있는 이유?
		 * - 컴퓨터에는 문자표기 문재하고 있는데 (유니코드)
		 *	숫자에 따라 지정된 문자 모양이 매핑되어있고
		 *	'B' 문자 그대로가 대입되면 변수에 숫자 66으로 변환되어 저장
		 * 	-> 반대로 생각하면 변수에 애초에 66이라는 숫자를 저장하는 것이 가능!
		 * 
		 */
		
		System.out.println("ch : " + ch);
		System.out.println("ch2 : " + ch2);
		
		
		// 변수 명명 규칙
		
		// 1. 대소문자 구분O, 길이제한X
		int abcdefg123456789; 
		int Abcdefg123456789; // A 다름 (소문자-대문자)
		
		// 2. 예약어 사용X
		//double double; (X)
		//double int; (X)
		//double final; (X)
		//double Static ; (X)
		
		// 3. 숫자 시작X (포함은 가능)
		//char 1abc; (X)
		char a2bc;
		
		// 4. 특수자는 $, _ 만 사용 가능(하지만 쓰지 않는다)
		int $intNumber; //문제는 없지만 개발자가 이렇게 직접 사용 하지는 않음
		int int_Number; // 자바는 카멜표기법 사용
		// _ 작성 표기법은 DB에서 사용
		// MEMBER_NAME 이런 식으로
		
		// 5. 카멜 표기법
		// 변수명 작성 시 여러 단어를 이어서 작성하는 경우
		// 띄어쓰지 않고 후속 단어 첫글자를 대문자로 작성.
		char helloWorldAppleBananaTomato;
		
		
		// 6. 변수명은 언어를 가리지 않음. (하지만 쓰지 않음)
		int 정수1번;
		double 실수2번 = 3.14;
		System.out.println(실수2번);
		//하지만 이렇게 쓰지 않음(컨벤션)		
		
		
		//---------------------------------
		
		int number = 10;
		System.out.println("number : " + number); //10
		
		number = 20;
		System.out.println("number : " + number); //20
		
		final double PI_VALUE = 3.14;
		// PI_VALUE = 2.33333; // 에러! 재대입 불가!
		
		//상수는 대문자로만 작성. 대문자로만 사용하므로 언더바 사용.
		
		/* 상수 (항상 같은 수) :
		 * - 변수의 한 종류
		 * - 한번 값이 대입되면 다른 값을 재대입할 수 없음
		 * - 자료형 앞에 final 키워드를 작성
		 * 
		 * - 상수 명명 규칙 : 모두 대문자, 여러단어 작성 시 _ 사용
		 * 
		 * - 상수를 사용하는 경우
		 *  1) 변하면 안되는 고정된 값을 저장할 때
		 *  2) 특정한 값에 의미를 부여하는 경우
		 * 
		 */
		
		final int LEFT_MOVE = -1;
		final int RIGHT_MOVE = 1;
				
		
		// 개인적으로 작성 연습
		
		final double PI_VALUE2 = 3.142;

		final double PI_VALUE3 ;
		PI_VALUE3 = 3.143 ;
		
		System.out.println(PI_VALUE2);
		System.out.println(PI_VALUE3);
		
		System.out.println("PI_VALUE2 = " + PI_VALUE2);
		System.out.println("PI_VALUE3 = " + PI_VALUE3);
		
		// 여기까지 개인적으로 연습
		
	}
	
	
}
