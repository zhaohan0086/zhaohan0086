// ���� LinkedList ��
import java.util.LinkedList;

public class RunoobTestListGetfirst {
    public static void main(String[] args) {
        LinkedList<String> sites = new LinkedList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        // ʹ�� getFirst() ��ȡͷ��Ԫ��
        System.out.println(sites.getFirst());
    }
}