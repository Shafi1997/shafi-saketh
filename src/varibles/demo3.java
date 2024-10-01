package varibles;

public class demo3 {
	static int i=10;  //static variable
	String string="dubai";  // global variable
	
	public void method1() {
		int a=100; // local  variable
         System.out.println(a);
         System.out.println(i);
         System.out.println(string);
		
	}
public static void method2() {
	System.out.println(i);
	demo3 demo3=new demo3();
	System.out.println(demo3.string);
	
}
public static void main(String[] args) {
	demo3 demo3=new demo3();
	demo3.method1();
	method2();
}
}
