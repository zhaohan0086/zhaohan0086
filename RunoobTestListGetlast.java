// ���� LinkedList ��
import java.util.LinkedList;

public class RunoobTestListGetlast {
    public static void main(String[] args) {
        LinkedList<String> sites = new LinkedList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        // ʹ�� getLast() ��ȡβ��Ԫ��
        System.out.println(sites.getLast());
    }
}