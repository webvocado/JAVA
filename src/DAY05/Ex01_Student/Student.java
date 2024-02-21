package DAY05.Ex01_Student;

public class Student {

	// 학생의 속성 : 이름, 나이, 학번, 전공
	// 학생의 행동 : 공부하기, 성적 평균 구하기
	
	// 변수
	public String name;
	public int age;
	public String stdNo;
	public String major;
	
	// 기본 생성자
	public Student() {
		this("이름없음", 1, "0000000", "없음");
	}
	// 매개변수 있는 생성자
	public Student(String name, int age, String stdNo, String major) {
		this.name = name;
		this.age = age;
		this.stdNo = stdNo;
		this.major = major;
	}



	// 생성자
	
	
	// 메소드
	// - 공부하기
	public void study(String subject) {
		System.out.println(subject + "(을/를) 공부합니다.");
		// void : 반환타입이 없다면, return 생략 가능
	}
	
	// - 성적 평균 구하기
	public double getAverage(int score1, int score2) {
		double average = 0.0;
		average = (double) (score1 + score2) / 2;
		return average;
	}
	
	public double getAverage(int score1, int score2, int score3) {
		double average = 0.0;
		average = (double) (score1 + score2 + score3) / 3;
		return average;
	}
	
	// 메소드 오버로딩
	public double getAverage(int[] scores) {
		double average = 0.0;
//		int sum = 0.0;
//		for(int i = 0; i <= scores.length; i++) {
//			sum += scores[i];
//		}
//		average = (double) sum / scores.length;
//		return average;
		
		// 합계
		int sum = 0;
		for (int i : scores) {		// foreach문
			sum += i;				// sum = sum + i;
		}
		
		// 평균
		average = (double) sum / scores.length;
		return average;
		
	}

}
