public class SearchlastString {
	public static void main(String[] args) {
		String strOrig ="Hello world ,Hello Runoob";
		int lastIndex = strOrig.lastIndexOf("Runoob");
		if(lastIndex == -1) {
			System.out.println("û���ҵ��ַ���");
		}else {
			System.out.println("Runoob �ַ��������ֵ�λ�ã�"+lastIndex);
		}
	}
}