package String;

public class Sub1 {
	public static void main(String[] args) {
		//                0123456789   
		String nowDate = "20150926";
		
		String y = nowDate.substring(0, 4);
		String m = nowDate.substring(4, 6);
		String d = nowDate.substring(6, 8);
		nowDate = y + "-" + m + "-" + d;
		// 코드 작성
		System.out.println(nowDate); // => [출력결과] 2015-09-26
		String inputDate = "2015-09-26";
		// 코드 작성
		System.out.println(inputDate); // => [출력결과] 2015년 09월 26일
	}

}
