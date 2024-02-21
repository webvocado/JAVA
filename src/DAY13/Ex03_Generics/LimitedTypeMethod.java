package DAY13.Ex03_Generics;

public class LimitedTypeMethod {
	
	// 제네릭 메소드 타입 제한
	// Number : 자식클래스 (Ineger, Double 등 숫자관련 클래스)
	public <T extends Number> void method(T t) {
		System.out.println( t.intValue() );
		System.out.println( t.doubleValue() );
		System.out.println("================");
	}
	
	public static void main(String[] args) {
		LimitedTypeMethod ltm = new LimitedTypeMethod();
		ltm.method(1234);	// <Integer> 생략
		ltm.method(12.34);	// <Double> 생략
		
		// (에러) ltm.method("123.456");
		// 문자열은 Number 클래스의 자식클래스가 아니므로 에러 발생
	}
}
