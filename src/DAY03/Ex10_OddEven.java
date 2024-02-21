package DAY03;

public class Ex10_OddEven {

	public static void main(String[] args) {
		// 1~20까지 정수 중,
		// 홀수의 합계, 짝수의 합계를 각각 구하여 출력하시오.
		// 1+3+5

		int a = 1;
		int oddSum = 0;
		int evenSum = 0;

		while (a <= 20) {
			if (a % 2 == 1) {
				oddSum += a;
			} else {
				evenSum += a;
			}
			a++;
		}

		System.out.println("홀수의 합계 : " + oddSum);
		System.out.println("짝수의 합계 : " + evenSum);
	}

}
