package String;

public class Sub2 {
	public static void main(String[] args) {
		String str = "���ع��� ��λ��� ������ �⵵�� �ϴ����� �����ϻ� �츮���� ����";
		// �ڵ� �ۼ�
		int idx = 0;
		// ���ѹݺ�
		while(true) {
			idx = str.indexOf(" ", idx + 1);
			String s = str.substring(0, idx);
			System.out.println(s);

		}
	}
}