// ���� LinkedList ��
import java.util.LinkedList;

public class RunoobTestListRemovelast {
    public static void main(String[] args) {
        LinkedList<String> sites = new LinkedList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        // ʹ�� removeLast() �Ƴ�β��Ԫ��
        sites.removeLast();
        System.out.println(sites);
    }
}