package �޼ҵ�;

import java.util.Scanner;

public class ���ڹ��� {
	static void checkGrade(int n) {
		if(n >= 10) {
			System.out.println("1���");
		} else if(n >= 7) {
			System.out.println("2���");
		} else if(n >= 4){
			System.out.println("3���");
		} else {
			System.out.println("4���");
		}
			
	}
	
	public static void main(String[] args) {
		System.out.println("���� �Է�");
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