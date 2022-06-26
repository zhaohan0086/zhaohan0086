import java.util.ArrayList;
public class RunoobTestForeach {
	public static void main(String[] args) {
		ArrayList<String> sites = new ArrayList<String>();
		sites.add("Google");
		sites.add("Runoob");
		sites.add("Weibo");
		sites.add("Taobo");
		for (String i : sites) {
			System.out.println(i);
		}
	}
}