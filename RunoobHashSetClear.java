import java.util.HashSet;

public class RunoobHashSetClear {
    public static void main(String[] args) {
    HashSet<String> sites = new HashSet<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");
        sites.add("Runoob");     // �ظ���Ԫ�ز��ᱻ���
        sites.clear();  
        System.out.println(sites);
    }
}