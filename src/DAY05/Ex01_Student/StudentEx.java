package DAY05.Ex01_Student;

public class StudentEx {
	public static void main(String[] args) {
		Student student = new Student();
		
		// student 의 변수에 접근하여, name, age, stdNo, major 값을 지정해보세요.
		student.name = "김조은";
		student.age = 10;
		student.stdNo = "1234567";
		student.major = "걸음마학과";
		int scores[] = {100, 80, 90, 50, 75};
		
		System.out.println("#### 학생 1 ####");
		System.out.println("학생 1 - 이름 : " + student.name);
		System.out.println("학생 1 - 나이 : " + student.age);
		System.out.println("학생 1 - 학번 : " + student.stdNo);
		System.out.println("학생 1 - 전공 : " + student.major);
		student.study("아장아장");
		System.out.println("학생 1 - 중간고사 점수 : " + student.getAverage(100, 90));
		System.out.println("학생 1 - 기말고사 점수 : " + student.getAverage( 100, 85, 70 ));
		System.out.println("학생 1 - 최종 점수 : " + student.getAverage(scores) );
		System.out.println();

		
		// 학생2 (student2) 객체를 생성하면서, 아래와 같이 객체를 초기화하세요.
		Student student2 = new Student("백승헌", 20, "T100200", "영어영문학과");
		int scores2[] = {55, 80, 60, 35, 90};
		System.out.println("#### 학생 2 ####");
		System.out.println("학생 2 - 이름 : " + student2.name);
		System.out.println("학생 2 - 나이 : " + student2.age);
		System.out.println("학생 2 - 학번 : " + student2.stdNo);
		System.out.println("학생 2 - 전공 : " + student2.major);
		student2.study("음운론");
		System.out.println("학생 2 - 중간고사 점수 : " + student2.getAverage(100, 90));
		System.out.println("학생 2 - 기말고사 점수 : " + student2.getAverage( 100, 85, 70 ));
		System.out.println("학생 2 - 최종 점수 : " + student2.getAverage(scores2));
		System.out.println();

		
	}
}
