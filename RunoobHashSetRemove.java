import java.util.HashSet;

public class RunoobHashSetRemove {
    public static void main(String[] args) {
    HashSet<String> sites = new HashSet<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");
        sites.add("Runoob");    
        sites.remove("Taobao");  
        System.out.println(sites);
    }
}