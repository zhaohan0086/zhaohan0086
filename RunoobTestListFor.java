//����LinkedList ��
import java.util.LinkedList;

public class RunoobTestListFor {
	public static void main(String[] args) {
		LinkedList<String> sites = new LinkedList<String>();
		sites.add("Google");
		sites.add("Runoob");
		sites.add("Taobao");
		sites.add("Weibo");
		for (int size = sites.size(), i = 0; i < size;i++) {
			System.out.println(sites.get(i));
		}

	}
}