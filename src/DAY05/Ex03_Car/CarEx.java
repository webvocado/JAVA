package DAY05.Ex03_Car;

public class CarEx {
	public static void main(String[] args) {
		// 객체 생성
		Car car = new Car();
		
		System.out.println(car.model); // null 값
		car.setModel("토마스"); // 값 수정
		System.out.println(car.getModel()); // 값 가져오기

		System.out.println(car.getSpeed()); // 값 가져오기
		car.setSpeed(60); // 값 60으로 수정
		System.out.println(car.getSpeed()); // 값 가져오기

		System.out.println("--------------------------");
		
		// 객체 생성
		Car car2 = new Car();
		car2.model = "볼보";
		// car2.speed = 200;
		// private 으로 지정한 변수는 외부에서 접근 불가능
		car2.setSpeed(200);
		System.out.println("model : " + car2.getModel());
		System.out.println("speed : " + car2.getSpeed());
		
		car.setSpeed(-50); // 속도는 음수가 불가능
		System.out.println("speed : " + car.getSpeed());
		
		car.setSpeed(400); // 300 초과 불가능
		System.out.println("speed : " + car.getSpeed());
		
		car.setSpeed(200); 
		System.out.println("speed : " + car.getSpeed());
		
	}
}
