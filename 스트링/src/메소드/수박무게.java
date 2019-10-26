package 메소드;

import java.util.Scanner;

public class 수박무게 {
	static void checkGrade(int n) {
		if(n >= 10) {
			System.out.println("1등급");
		} else if(n >= 7) {
			System.out.println("2등급");
		} else if(n >= 4){
			System.out.println("3등급");
		} else {
			System.out.println("4등급");
		}
			
	}
	
	public static void main(String[] args) {
		System.out.println("숫자 입력");
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		checkGrade(input);
	}
}

	/*static void print(int count, char ch) {
		for (int i = 0; i < count; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
*/