package step5;

import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] num = new double[3];
		System.out.println("국어 시험점수는?");
		num[0] = sc.nextInt();
		System.out.println("수학 시험점수는?");
		num[1] = sc.nextInt();
		System.out.println("영어 시험점수는?");
		num[2] = sc.nextInt();

		double max = num[0];

		// max값 구하기
		for (int i = 0; i < num.length; i++) {
			if (max < num[i]) {
				max = num[i];
			}
		}

		double aver = 0;// 평균구하기용

		// for문 이용해서 나머지 값 조작하기
		for (int i = 0; i < num.length; i++) {
			num[i] = num[i] / max * 100;// 0으로 출력됨.
			aver += num[i];
		}

		// 평균 구함
		double aver2 = aver / num.length;
		System.out.println("맥스값 " + max);
		System.out.println("평균값은 : " + aver2);
	}
}
