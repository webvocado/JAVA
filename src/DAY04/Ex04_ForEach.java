package DAY04;

import java.util.Iterator;

public class Ex04_ForEach {

	public static void main(String[] args) {
		
		/*
		 	for ( 자료형 반복요소 : 배열 or 컬렉션 ) {
		 		반복 실행할 문장;
		 	}
		 */
		
		// 배열 선언 및 초기화
		String[] week = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
		
		// foreach : ctrl + space
		// - for ( 자료형 반복요소명 : 배열명 ) { 반복 실행할 문장; }
		// : 배열 또는 컬렉션의 모든 요소를 순회(순서대로 반복)하는 반복문
		for (String day : week) {
			System.out.print(day + " ");		// day : arr[i]
		}
		System.out.println();
		
		// 기본 for 문
		// for 문은 증감식을 i+=2 이런식으로 바꿀 수 있다 
		// foreach문은 조건을 바꿀 수 없다
		for (int i = 0; i < week.length; i++) {
			System.out.print(week[i] + " ");
		}
		System.out.println();
		
	}

}
