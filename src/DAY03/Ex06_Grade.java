package DAY03;

import java.util.Scanner;

public class Ex06_Grade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학점 : ");
		// Scanner 객체에서는 문자를 받는 메소드가 없다.
		String grade = sc.next(); // String (문자열) 참조자료형

		switch (grade) {
		case "A":
			System.out.println("90~100점입니다.");
			break;
		case "B":
			System.out.println("80~89점입니다.");
			break;
		case "C":
			System.out.println("70~79점입니다.");
			break;
		case "D":
			System.out.println("60~69점입니다.");
			break;
		case "F":
			System.out.println("60점 미만입니다.");
			break;

		default:
			System.out.println("A~F 사이의 문자를 입력하세요.");
			break;
		}

		sc.close();

	}

}
