import java.util.HashMap;
public class RunoobHashMapForeach{
	public static void main(String[] args) {
		HashMap<Integer,String> Sites = new HashMap<Integer,String> ();
		Sites.put(1,"google");
		Sites.put(2,"runoob");
		Sites.put(3, "taobao");
		Sites.put(4,"zhihu");
		for (Integer x :Sites.keySet()) {
			System.out.println("key:" + x +"value:" +Sites.get(x));
			
		}
		for (String z :Sites.values()) {
			System.out.print(z +",");
		}
		
	}
}