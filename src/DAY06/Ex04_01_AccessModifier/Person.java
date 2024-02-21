package DAY06.Ex04_01_AccessModifier;

public class Person {

	// 이름, 나이, 키, 체중
	public String name;
	protected int age;
	int height;
	private int weight;

	// 생성자
	public Person() {
		this("익명", 20, 174, 69);
	}

	// 매개변수 생성자
	public Person(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	// Getter/Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	// TOstring()
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}

}
