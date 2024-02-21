package DAY06.Ex04_02_AccessModifier;
// 접근지정자(제어자)
import DAY06.Ex04_01_AccessModifier.Person;

public class Student extends Person {
	
	// 생성자
	public Student() {
		super();
	}

	// 매개변수 생성자
	public Student(String name, int age, int height, int weight) {
		super(name, age, height, weight);
	}
	
	public void defaultSetting() {
		name = "이름없음"; // public은 모든 곳에서 접근 가능
		age = 20; // protected는 Person 상속받았기 때문에 다른 패키지라도 접근 가능
		// height = 100; // default는 같은 패키지 내에서만 접근 가능
		// weight = 60;	 // private는 해당 클래스 내에서만 접근 가능
		setHeight(150);
		setWeight(40);
	}
	
	
}
