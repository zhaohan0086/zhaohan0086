import java.util.LinkedList;

public class RunoobTestListAddfirst {
    public static void main(String[] args) {
        LinkedList<String> sites = new LinkedList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        // ʹ�� addFirst() ��ͷ�����Ԫ��
        sites.addFirst("Wiki");
        System.out.println(sites);
    }
}