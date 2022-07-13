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
	    stringBox.add(new String("����̳�"));
	 
	    System.out.printf("����ֵΪ :%d\n\n", integerBox.get());
	    System.out.printf("�ַ���Ϊ :%s\n", stringBox.get());
	}
}