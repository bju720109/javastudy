package String;

public class Sub1 {
	public static void main(String[] args) {
		//                0123456789   
		String nowDate = "20150926";
		
		String y = nowDate.substring(0, 4);
		String m = nowDate.substring(4, 6);
		String d = nowDate.substring(6, 8);
		nowDate = y + "-" + m + "-" + d;
		// �ڵ� �ۼ�
		System.out.println(nowDate); // => [��°��] 2015-09-26
		String inputDate = "2015-09-26";
		// �ڵ� �ۼ�
		System.out.println(inputDate); // => [��°��] 2015�� 09�� 26��
	}

}
