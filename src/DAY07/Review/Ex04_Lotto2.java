package DAY07.Review;

public class Ex04_Lotto2 {

	public static void main(String[] args) {

		int arr[] = new int[6];
		int temp;

		for (int i = 0; i < 6; i++) {
			arr[i] = (int) (Math.random() * 45) + 1;
			
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) { // 중복제거
					i--;
					break;
				}
			}
		}

		// 오름차순
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		// Arrays.sort(arr); // 그냥 메소드 사용하기.. 개 쉬운거였음;;

		// 출력
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		

	}
}
