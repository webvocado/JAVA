package DAY02;

public class Ex01_Variable {

	public static void main(String[] args) {
		
		// 변수 선언
		int x;				// int형 변수 x 선언
		int y;				// int형 변수 y 선언
		
		// 여러 변수 동시 선언
		int a, b;
		
		// 변수 선언 및 초기화
		int i = 10;
		int j = 20;
		
		// 동시 선언 및 초기화
		int m = 30, n = 40;
		
		// = (대입 연산자)
		x = 100;
		y = 200;
		
		// x + y
		// x, y : 피연산자
		// + : 연산자
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		// 합계
		System.out.println("x + y = " + (x + y) );
		// 평균
		System.out.println("평균 = " + ((x + y) / 2) ); // 첫번째 + 는 연결연산자가 된다.
		
		// 우선순위에 따라서 알맞게 ( ) 지정해서 사용한다.
		
	}

}
