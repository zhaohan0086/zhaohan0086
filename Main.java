public class Main {
	public static void main(String args[]) {
		String str = "this is java";
		System.out.println(removeCharAt(str,3));
	}
	public static String removeCharAt(String s,int pos) {
		return s.substring(0,pos) +s.substring(pos+1);
	}
}