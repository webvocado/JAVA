package DAY06.Ex05_StaticMember;

class Calculator {
	// 아래 연산 결과를 구하는 static 메소드를 정의하시오.
	// 1. 절댓값
	// 2. 초댓값
	// 3. 최솟값

	// 절댓값
	public static int abs(int val) {
		return val > 0 ? val : -val;
	}

	// 최댓값
	public static int max(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i : arr) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}

	// 최솟값
	public static int min(int[] arr) {
		int min = Integer.MAX_VALUE;
		for (int i : arr) {
			if (i < min) {
				min = i;
			}
		}
		return min;
	}
}

// ctrl + shift + R : 파일검색
public class StaticCalculator {
	public static void main(String[] args) {

		int arr[] = { 70, 65, 90, 85, 100 };

		// 다른 클래스의 static 메소드를 호출하는 방법
		// 인스턴스 메소드는 객체를 생성한 후에 사용 가능하지만,
		// static 메소드는 처음에 먼저 호출되기 때문에 바로 static 클래스로 사용 가능

		// : 클래스명.메소드명();
		// ex) Calculator.max( arr );

		System.out.println("abs(-123) : " + Calculator.abs(-123));
		System.out.println("max(arr) : " + Calculator.max(arr));
		System.out.println("min(arr) : " + Calculator.min(arr));
	}
}
