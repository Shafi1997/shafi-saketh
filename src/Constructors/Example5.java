package Constructors;

public class Example5 {
	String name;
	int age;
	     //constructor overloading
	
	public Example5(String name, int age) { // two arguments
		this.name=name;
		this.age=age;       
		
		System.out.println("name:"+this.name);
		System.out.println("age :"+this.age);
	}
public  Example5(String name) {  // one argument
	this.name=name;
	this.age=26;
	
	System.out.println("name:"+this.name);
	System.out.println("age :"+this.age);
	System.out.println();
	
}
    //   method over loading
	public static void Example1(String name) {
		System.out.println("ramesh...........");
		System.out.println();
		
		
	}
	public static void Example2(String name) {
     System.out.println("yogesh...............");	
     System.out.println();
}
public static void main(String[] args) {
	Example5 example1=new Example5("praveen",29);
	Example5 example2=new Example5("jagdeesh");
	Example1("ramesh");
	Example2("yogesh");
}
}
