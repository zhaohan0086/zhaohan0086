import java.util.LinkedList;

public class RunoobTestListAddlast {
    public static void main(String[] args) {
        LinkedList<String> sites = new LinkedList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        // ʹ�� addLast() ��β�����Ԫ��
        sites.addLast("Wiki");
        System.out.println(sites);
    }
}