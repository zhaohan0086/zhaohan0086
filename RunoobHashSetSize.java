import java.util.HashSet;

public class RunoobHashSetSize {
    public static void main(String[] args) {
    HashSet<String> sites = new HashSet<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");
        sites.add("Runoob");    
        System.out.println(sites.size());  
    }
}