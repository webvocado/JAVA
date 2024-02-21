package DAY04;

public class Ex01_Array {

	public static void main(String[] args) {
		// 배열 선언
		// - 자료형 변수명[];
		int arr[]; // 여기에 값이 있는 것이 아니라 참조값을 가져오는 것. (레퍼런스)

		// 배열 생성
		// - 변수명 = new 자료형[개수];
		arr = new int[5];

		// 배열 요소에 접근
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		// 16진수로 되어 있는 요소를 가져와준다. (ex) #FF125번지에 있는 값을 가져온다. C언어의 포인터와 유사한 개념이다.)

		// 배열의 길이 : 배열 요소의 개수 = 배열.length
		int N = arr.length;
		System.out.println("배열의 길이 : " + arr.length);

		for (int i = 0; i < N; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

}
