import java.util.ArrayList;

public class RunoobTestSet {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        sites.set(2, "Wiki"); // ��һ������Ϊ����λ�ã��ڶ���ΪҪ�޸ĵ�ֵ
        System.out.println(sites);
    }
}