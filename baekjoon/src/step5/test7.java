package step5;

import java.util.Scanner;

public class test7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("몇번 반복할건가요");

		// 입력받은 값 만큼 배열 생성
		double[] num = new double[sc.nextInt()];

		// 합계
		double sum = 0;

		// 입력받은 값 만큼 반복
		for (int i = 0; i < num.length; i++) {
			System.out.println("정수입력하시오");
			num[i] = sc.nextInt();
			sum += num[i];
		}

		double average = (sum / num.length);// 80이 나온다.

		int count = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] >= average) {
				++count;
			}
		}
		System.out.println("총점 : " + sum);
		System.out.println("평균" + average);
		System.out.println("평균 넘는 사람 퍼센트" + 100 / num.length * count);

	}
}
