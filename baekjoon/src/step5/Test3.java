package step5;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개 입력해보세요");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		int total = num1 * num2 * num3;

		System.out.println("3개곱한 값은" + total);

//		 배열생성 후 배열에 한 글자씩 넣기.
//		char change = String.valueOf()

//		char value_char  = (char)total;
//		System.out.println(value_char);

		for (int i = 0; i < total; i++) {
			char[] ch = new char[(char) total];

		}
		// 나온 값 스트으로 변환 후 각각의 char 배열에 한글자씩 대입
		String temp = String.valueOf(num1 * num2 * num3);

		char[] arr1 = new char[temp.length()];
		for (int i = 0; i < temp.length(); i++) {
			arr1[i] = temp.charAt(i);
		}

		// 각각의 배열에 한 글짜씩 대입
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

		int count = 0;
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr1[i] == j) {
					count++;
				}
			}
			System.out.println(i + "과 같은 값은"+ count+"개");
		}
	}
}
