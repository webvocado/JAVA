package DAY02;

public class Ex14_BitOperator {

	public static void main(String[] args) {
		int result = 20 & 16;
		System.out.println("20 & 16 = " + result);
		
		// Integer.toBinaryString() : 십진수를 이진수 문자열로 변환하는 메소드
		System.out.println( Integer.toBinaryString(20) );
		System.out.println( Integer.toBinaryString(16) );
		System.out.println("--------------------");
		System.out.println( Integer.toBinaryString(result) );
		System.out.println();
		
		// OR
		int result2 = 20 | 16;
		System.out.println("20 | 16 = " + result2);
		
		System.out.println( Integer.toBinaryString(20) );
		System.out.println( Integer.toBinaryString(16) );
		System.out.println("--------------------");
		System.out.println( Integer.toBinaryString(result2) );
		System.out.println();
		
		
		// XOR
		// : 서로 값이 다르면 1, 같으면 0
		int result3 = 20 ^ 16;
		System.out.println("20 ^ 16 = " + result3);
		
		System.out.println( Integer.toBinaryString(20) );
		System.out.println( Integer.toBinaryString(16) );
		System.out.println("--------------------");
		System.out.println( Integer.toBinaryString(result3) );
		System.out.println();
		
		
	}

}
