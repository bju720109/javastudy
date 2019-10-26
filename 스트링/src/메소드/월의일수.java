package 메소드;

import java.util.Scanner;

public class 월의일수 {
	static void getLastYear(int m) {
		int[] Month1 = new int[] { 1, 3, 5, 7, 8, 10, 12 };
		int[] Month2 = new int[] { 4, 6, 9, 11 };

		boolean isPrint = false;

		for (int i = 0; i < Month1.length; i++) {
			if (Month1[i] == m) {
				System.out.println(31);
				isPrint = true;
			}
		}

		for (int i = 0; i < Month2.length; i++) {
			if (Month2[i] == m) {
				System.out.println(30);
				isPrint = true;
			}
		}
		if (isPrint == false) {
			System.out.println(28);
		}
	}

	public static void main(String[] args) {
		System.out.println("숫자 입력");
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();

		getLastYear(input);
	}
}
