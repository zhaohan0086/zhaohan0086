import java.util.HashMap;

public class RunoobHashMapString {
    public static void main(String[] args) {
        // ���� HashMap ���� Sites
        HashMap<String, String> Sites = new HashMap<String, String>();
        // ��Ӽ�ֵ��
        Sites.put("one", "Google");
        Sites.put("two", "Runoob");
        Sites.put("three", "Taobao");
        Sites.put("four", "Zhihu");
        System.out.println(Sites);
    }
}