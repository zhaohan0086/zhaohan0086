import java.util.HashMap;

public class RunoobHashMapClear {
    public static void main(String[] args) {
        HashMap<Integer, String> Sites = new HashMap<Integer, String>();
        Sites.put(1, "Google");
        Sites.put(2, "Runoob");
        Sites.put(3, "Taobao");
        Sites.put(4, "Zhihu");
        Sites.clear();
        System.out.println(Sites);
    }
}