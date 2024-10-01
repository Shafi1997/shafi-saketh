package varibles;

public class demo4 {
	public void method1() {
		System.out.println("iam non static");
		
	}
public static void method2() {
	System.out.println("i am static");
	demo4 demo4=new demo4();
	demo4.method1();
	
	
}
public void method3() {
	method2();
	System.out.println("i am non static");
	
}
public static void method4() {
	demo4 demo4 =new demo4();
	demo4.method3();
	System.out.println("i am static");
	
}
public static void main(String[] args) {
	method4();
}
}
