package 단항이항삼항연산자;

public class 비트연산자 {
		public static void main(String[] args) {
			// 비트 논리 연산자
			 byte and1 = 1;
			 byte and2 = 1;
			 System.out.println(and1 & and2);

			 and1 = 0;
			 System.out.println(and1 & and2);

			 byte or1 = 1;
			 byte or2 = 0;
			 System.out.println(or1 | or2);

			 or1 = 0;
			 System.out.println(or1 | or2);
			 byte xor1 = 1;
			 byte xor2 = 1;
			 System.out.println(xor1 ^ xor2);

			 xor1 = 0;
			 System.out.println(xor1 ^ xor2);
			 // 비트 이동 연산자
			 byte b = 10; // 00001010
			 // 00101000
			 System.out.println(b << 2);

			 byte b2 = 10; // 00001010
			 // 00000010
			 System.out.println(b2 >> 2);
		}
}
