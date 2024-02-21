package DAY06.Ex03_PassingArgument;

import DAY05.Class.Pikachu;

public class CallByReference {
	
	public static void main(String[] args) {
		int arr[] = new int[5];
		Pikachu pikachu = new Pikachu();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i+1);
		}
		
		System.out.println("---------- main() 메소드 -----------");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(pikachu);
		
		// 레퍼런스에 의한 호출 : Call By Reference
		// - 참조 자료형을 전달하는 방식
		setArr( arr );
		setObject( pikachu );
		
		System.out.println("---------- set**() 메소드 호출 후 -----------");	
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println( pikachu ); // Pikachu 클래스에 toString() 사용
		
	}

	private static void setArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			// 10 20 30 40 50
			arr[i] = (i+1) * 10;
		}
		System.out.println("---------- setArr() 메소드 -----------");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	private static void setObject(Pikachu pikachu) {
		pikachu.energy = 1000;
		pikachu.type = "에스퍼";
		System.out.println("---------- setObject() 메소드 -----------");
		System.out.println(pikachu);
		System.out.println();
	}

}
