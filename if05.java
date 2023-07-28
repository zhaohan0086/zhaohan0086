import java.util.Scanner;

public class if05{
	public static void main(String[] args) {
		Scanner myScanner1 = new Scanner(System.in);
		System.out.println("请输入月份1-12");
		int month1 = myScanner1.nextInt();
		if(month1 >=1 && month1 <=12) {
		if(month1 >= 4 && month1 <=10) {
			System.out.println("请输入阶段人群");
			String people = myScanner1.next();
			if(people.equals("成人")) {
				System.out.println(60);
			}else if(people.equals("儿童")) {
				System.out.println("半价");
			}else{
				System.out.println("三分之一");
			}
		}else if(month1 < 4 && month1 >= 1){
			System.out.println("请输入阶段人群");
			String people = myScanner1.next();
			if(people.equals("成人")) {
				System.out.println(40);
			}else {
				System.out.println(20);
			}
		}else {
			System.out.println("输入有误请重新输入");
		}
	} 
		
}
}