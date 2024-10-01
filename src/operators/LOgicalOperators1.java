package operators;

public class LOgicalOperators1 {
	public static void method1 (int a, int b, int c) {
		System.out.println(a < b && a <c);

	}
	public static void method2(int a, int b, int c) {
		System.out.println(a < b || a < c);
		
	}
public static void main(String[] args) {
	method1(10, 15, 20);
	method2(10, 20, 2);
}
}
