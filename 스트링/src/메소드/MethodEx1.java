package ¸Þ¼Òµå;

import java.util.Random;

public class MethodEx1 {
	static void print(int count, char ch) {
		for (int i = 0; i < count; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

	static void print2(int count, char ch) {
		String result = "";
		for (int i = 0; i < count; i++) {
			for (int j = 0; j <= i; j++) {
			//	System.out.print('*');
				result = result + ch;
			}
			// System.out.println();
			result = result + "\n";
		}
		return result;
	}
	public static void main(String[] args) {
		print(5, '@');
		print(7, '#');
		
		Random ran = new Random();
		int num = ran.nextInt(10);
		System.out.println(num);
		
	}
//
//	public static void printStar(int count, char ch) {
//		for (int i = 1; i <= count; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(ch);
//			}
//			System.out.println();
//		}
//	}

}