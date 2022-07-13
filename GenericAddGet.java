public class GenericAddGet<T> {
	private T t;
	public void add(T t) {
		this.t=t;
	}
	public T get() {
		return t;
	}
	public static void main(String[] args) {
		GenericAddGet<Integer> integerBox = new GenericAddGet<Integer>();
		GenericAddGet<String> stringBox = new GenericAddGet<String>();
	 
	    integerBox.add(new Integer(10));
	    stringBox.add(new String("菜鸟教程"));
	 
	    System.out.printf("整型值为 :%d\n\n", integerBox.get());
	    System.out.printf("字符串为 :%s\n", stringBox.get());
	}
}