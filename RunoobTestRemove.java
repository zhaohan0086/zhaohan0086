import java.util.ArrayList;

public class RunoobTestRemove {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        sites.remove(3); // ɾ�����ĸ�Ԫ��
        System.out.println(sites);
    }
}