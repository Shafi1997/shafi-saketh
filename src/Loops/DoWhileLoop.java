package Loops;

public class DoWhileLoop {
	public static void method1(boolean a) {
		do {
			System.out.println(a);
		} while (a);
		

	}
	public static void methos2(int a,int b) {
		do {
			System.out.println((a+b));
			System.out.println((a-b));
			
		} while (a==b);
	}
public static void main(String[] args) {
	method1(false);
	methos2(10, 1);
	}

}
