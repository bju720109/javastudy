package ¸Þ¼Òµå;

public class MethodExam3 {
	static int nextint(int bound) {
		double num = Math.random();// 0.0 <= X <1.0
		System.out.println(num);
		int result = (int) (num * bound);// 0.0<= X < 10
		return result;
	}

	public static void main(String[] args) {
		int num = nextint(10);
		System.out.println(num);
	}
}
