package String;

public class IndexOf {
	public static void main(String[] args) {

		String str = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";

		int count = 0;
		int idx = 0;
		while (idx > -1) {
			idx = str.indexOf("Lorem", idx);
			if (idx != -1) {
				count++;
				System.out.println("Lorem 위치 : " + idx);
			}
			// 무한반복문이 되어버린 프로그램을 강제 종료하는 코딩
			if (idx == -1) {
				break;
			}
		}
	}
//		int str1Len = str1.length();
//		System.out.println("str1Len : " + str1Len);
//		String str2 = "자바 프로그래밍";
//		int str2Len = str2.length();
//		System.out.println("str2Len : " + str2Len);
//
//		int str3Len = "이렇게도 가능".length();
//		System.out.println("str3Len : " + str3Len);
}