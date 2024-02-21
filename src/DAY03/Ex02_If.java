package DAY03;

import java.util.Scanner;

public class Ex02_If {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		// 입력받은 값이 홀수인지, 짝수인지 판단하시오.
		if (num % 2 == 1) {
			System.out.println("홀수입니다.");
		}
		if (num % 2 == 0) {
			System.out.println("짝수입니다.");
		} // if 문을 단독으로 사용하면 두 조건 모두 검사한다.

		sc.close();
	}

}
