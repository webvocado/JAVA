package DAY09.Ex01_Computer;

// 부모 클래스의 추상 메소드는 반드시 오버라이딩 해야한다.
public class Desktop extends Computer {

	// 
	
	
	// 추상 메소드 구현
	@Override
	public void display() {
		System.out.println("Desktop - display");
	}
	@Override
	public void typing() {
		System.out.println("Desktop - typing");
	}

}
