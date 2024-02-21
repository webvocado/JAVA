package DAY02;

import java.util.Scanner;

public class Ex07_Boolean {

	public static void main(String[] args) {
		// Boolean
		// : true(참), false(거짓) 논리값만 가지는 자료형
		boolean check1 = false;
		boolean check2 = true;

		// ctrl + space : 자동완성
		Scanner sc = new Scanner(System.in);
		boolean on = sc.nextBoolean(); // 논리값(true, false)를 입력 받는 메소드
		// 빠른키 sc. n B ; + enter : 하면 입력된다.

		System.out.println("on : " + on);

		if (on) {
			System.out.println("전원 ON");
		} else {
			System.out.println("전원 OFF");
		}
		sc.close();
	}

}
