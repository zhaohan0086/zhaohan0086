import java.util.HashSet;

public class RunoobHashSetAdd {
    public static void main(String[] args) {
    HashSet<String> sites = new HashSet<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");
        sites.add("Runoob");  // �ظ���Ԫ�ز��ᱻ���
        System.out.println(sites);
    }
}