import java.util.ArrayList;
import java.util.Iterator;
public class RunoobItHasnext {
	public static void main(String[] args) {
		ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");
        Iterator<String> it = sites.iterator();
        while (it.hasNext()) {
        	System.out.println(it.next());
        }
	}
}