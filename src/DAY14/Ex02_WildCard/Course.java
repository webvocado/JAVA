package DAY14.Ex02_WildCard;

public class Course<T> {
	
	private String name;	// 과정명
	private T[] students;	// 수강생들
	
	// 생성자
	public Course(String name, int capacity) {
		this.name = name;
		// Object 타입의 배열 생성
		// (T[]) 제네릭 타입으로 변환
		students = (T[]) new Object[capacity];
	}
	
	// getter
	public String getName() {
		return name;
	}
	
	public T[] getStudents() {
		return students;
	}
	
	
	// 요소추가 메소드
	public void add(T t) {
		// 비어있는 배열요소에 전달받은 객체를 대입
		for (int i = 0; i < students.length; i++) {
			if( students[i] == null ) {
				students[i] = t;
				break;
			}
		}
	}
}
