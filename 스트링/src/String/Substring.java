package String;

public class Substring {
	public static void main(String args[]) {
		String str = "Java 개발자 양성을 통한 취업연계과정!!";
		
		// 문장의 길이 24
		int len = str.length();
		
		// back space만들기
		str = str.substring(0, len -1);
		System.out.println(str);
		
		String str1 = str.substring(0);
    	System.out.println(str1);
    	
//		String str1 = str.substring(5);
//		System.out.println(str1);
//
//		String str2 = str.substring(0, 6);
//		System.out.println(str2);
//
//		String str3 = str.substring(12, 15);
//		System.out.println(str3);
	}
}
