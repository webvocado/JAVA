package DAY07.Review;

public class Ex04_Lotto {
	
	public static void main(String[] args) {
		// Math.random() : 0.XXXXX ~ 0.9XXXXX 사이의 난수를 반환하는 메소드		
		double random = Math.random();
		System.out.println(random);
		
		// 1~6 사이의 정수 : 주사위
		// Math.random() 					: 0.xxxxx ~ 0.9xxxxx
		// Math.random() * 10 				: x.xxxx ~ 9.xxxx
		// (int) (Math.random() * 10) 		: 0 ~ 9 ( 10개 )
		// (int) (Math.random() * 6) 		: 0 ~ 5 ( 6개 )
		// (int) (Math.random() * 6) + 1 	: 1 ~ 6 ( 6개 )		
		int dice = (int) (Math.random() * 6) + 1;
		System.out.println(dice);
		
		// 1~45 사이의 정수 : 로또
		int lotto = (int) (Math.random() * 45) + 1;
		System.out.println(lotto);
		
		// (공식) : (int) (Math.random() * [개수]) + [시작숫자]
		// 1~20 사이의 랜덤수
		int test1 = (int) (Math.random() * 20) + 1;
		System.out.println("1~20 : " + test1);
		
		// -20 ~ 20 사이의 램덤수
		int test2 = (int) (Math.random() * 41) - 20;
		System.out.println("-20~20 : " + test2);
		

		
	}
}
