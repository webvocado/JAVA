package DAY07.Review;

import java.util.Scanner;

public class Ex07_Method {
	public static int plus(int a, int b) {
		int result = a + b;
		return result;		
	}
	
	public static int minus(int a, int b) {
		int result = a - b;
		// return (값);
		// 1. (값)을 메소드를 호출한 자리로 반환
		// 2. 메소드 종료
		// 3. 메모리 해제
		return result;
		// return 뒤 실행문을 작성할 수 없다.
		// (에러) System.out.println("리턴 다음에 출력!");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.print("b : ");
		int b = sc.nextInt();
		
		// 메소드 호출 : 메소드명(인자1, 인자2);
		// - 전달인자(argument)
		System.out.println("a + b = " + plus(a, b));
		System.out.println("a - b = " + minus(a, b));
		
		
		sc.close();
	}
}
