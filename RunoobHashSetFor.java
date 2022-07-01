import java.util.HashSet;

public class RunoobHashSetFor {
    public static void main(String[] args) {
    HashSet<String> sites = new HashSet<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");
        sites.add("Runoob");     
        for (String i : sites) {
            System.out.println(i);
        }
    }
}