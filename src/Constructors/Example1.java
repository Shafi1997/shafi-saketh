package Constructors;

public class Example1 {
	// default constructor
	public Example1() {
		System.out.println("today is raining");
		
	}
	public Example1 (int a, int b) {    // parameterised
		System.out.println((a+b));
		System.out.println((a-b));
		System.out.println((a*b));
	}
	
	
public static void main(String[] args) {
	 new Example1();
	 Example1 example2=new Example1(20, 40);
	
}
}
