package DAY07.Review;

public class Ex02_ThreeSixNine {
	// 정수 1~100 까지의 수를 반복하면서,
	// 해당 수가 3 또는 6 또는 9가 될 때
	// 369의 개수 만큼 "*"를 출력하는 프로그램을 작성하시오.
	// ex) 3 --> "*"
	// 33 --> "**"
	// 99 --> "**"
	// 45 --> 45

	// 1. 정수를 1~100 까지 출력 (반복문)
	// 2. 해당 수가 369가 몇 개인지 판단
	// 3. 그 개수만큼 "*"를 출력한다.

	public static void main(String[] args) {

		// 선생님
		for (int i = 1; i <= 100; i++) {
			// 십의 자리 수 : 해당수(i) / 10 (정수부분만)
			int ten = i / 10;  
			// 일의 자리 수 : 해당수(i) % 10
			int one = i % 10;
			
			// boolean ten369 = (ten != 0) && (ten % 3 == 0);
			boolean ten369 = ten == 3 || ten == 6 || ten == 9;
			boolean one369 = one == 3 || one == 6 || one == 9;
			
			if (ten369 && one369) {
				System.out.println("**");
			}
			else if (ten369 || one369) {
				System.out.println("*");
			}
			else {
				System.out.println(i);
			}
		}
		
		// 느낀 점 : 변수를 잘 사용해야 할 것 같다.	
	
	

	
	
	
	
	
	
	
	
	
	
	}

}
