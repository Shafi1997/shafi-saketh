package ControlStatements;

public class ElseIF {
	public static void method1(double a, double b) {
		if (a>b) {
			System.out.println("hello from if block");
			
		}else if (a<b) {
			System.out.println("hello from else if block");
			
		} else {
			System.out.println("hello from else block");

		}
		
	}
public static void main(String[] args) {
	method1(25.6, 25.9);
}
}
