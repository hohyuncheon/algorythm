package step6;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		test1 t = new test1();
		Scanner sc = new Scanner(System.in);
		System.out.println("몇번 입력할까요");
		// 배열 생성
		int[] array = new int[sc.nextInt()];
		for (int i = 0; i < array.length; i++) {
			System.out.println("정수를 입력");
			array[i] = sc.nextInt();
		}
		
		System.out.println(t.sum(array));// 공부필요.
	}

	public long sum(int[] a) {

		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}
