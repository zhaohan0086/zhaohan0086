import java.util.HashMap;

public class RunoobHashMapPut {
    public static void main(String[] args) {
        // ���� HashMap ���� Sites
        HashMap<Integer, String> Sites = new HashMap<Integer, String>();
        // ��Ӽ�ֵ��
        Sites.put(1, "Google");
        Sites.put(2, "Runoob");
        Sites.put(3, "Taobao");
        Sites.put(4, "Zhihu");
        System.out.println(Sites);
    }
}