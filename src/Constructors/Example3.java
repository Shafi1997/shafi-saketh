package Constructors;

public class Example3 {
	
	String name;
	int age;
	double tenth;
	double inter;
	double degree;
	double pg;
	
	public Example3(String name,int age, double tenth, double inter,double degree , double pg){
		this.name=name;
		this.age=age;
		this.tenth=tenth;
		this.inter=inter;
		this.degree=degree;
		this.pg=pg;
		
		System.out.println("name :"+this.name);
		System.out.println("age :"+this.age);
		System.out.println("tenth :"+this.tenth);
		System.out.println("inter :"+this.inter);
		System.out.println("degree :"+this.degree);
		System.out.println("pg :"+this.pg);
		System.out.println();
		
	}
public Example3(String name,int age, double tenth, double inter,double degree) {
	this.name=name;
	this.age=age;
	this.tenth=tenth;
	this.inter=inter;
	this.degree=degree;
	
	System.out.println("name :"+this.name);
	System.out.println("age :"+this.age);
	System.out.println("tenth :"+this.tenth);
	System.out.println("inter :"+this.inter);
	System.out.println("degree :"+this.degree);
	System.out.println();
}
public Example3(String name,int age, double tenth, double inter) {
	this.name=name;
	this.age=age;
	this.tenth=tenth;
	this.inter=inter;
	
	System.out.println("name :"+this.name);
	System.out.println("age :"+this.age);
	System.out.println("tenth :"+this.tenth);
	System.out.println("inter :"+this.inter);
	System.out.println();
}
public Example3(String name,int age, double tenth) {
	this.name=name;
	this.age=age;
	this.tenth=tenth;
	System.out.println("name :"+this.name);
	System.out.println("age :"+this.age);
	System.out.println("tenth :"+this.tenth);
	System.out.println();
}
public static void main(String[] args) {
	Example3 example3=new Example3("ramu", 25, 89.6, 94.63, 78.03, 55.6);
	Example3 example32=new Example3("saketh", 24, 93.30, 87.2, 78.6);
	Example3 example33=new Example3("chotu", 25, 75.36, 79.63);
	Example3 example34=new Example3("rajesh", 44, 65.00);
}
}
