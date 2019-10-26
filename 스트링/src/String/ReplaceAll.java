package String;

public class ReplaceAll {
	public static void main(String[] args) {
		String str = "aba bbb abb ddd abc fff";

		// ab�� �����ϴ� ���� ����
		String str1 = str.replaceAll("ab.", "ABC");
		System.out.println(str1); // ABC bbb ABC ddd ABC fff

		// b�� �ΰ��� ���� ����
		String str2 = str.replaceAll("b{2}", "Z");
		System.out.println(str2); // aba Zb aZ ddd abc fff

		// d �Ǵ� f �� ���� ����
		String str3 = str.replaceAll("[df]", "Z");
		System.out.println(str3); // aba bbb abb ZZZ abc ZZZ
	}
}
