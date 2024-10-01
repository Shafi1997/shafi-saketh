package Constructors;

public class Example2 {
	///parameterised
	String car;
	String model;
	long year;
	String dealer;
	
	public Example2(String c, String m , long y , String d) {
		this.car=c;
		this.model=m;
		this.year=y;
		this.dealer=d;
		
		System.out.println("car :"+this.car);
		System.out.println("model :"+this.model);
		System.out.println("year :"+this.year);
		System.out.println("dealer :"+this.dealer);
		
				
		
	}
	public static void main(String[] args) {
		Example2 example2=new Example2("bmw" , "5series" , 2020l , "kun");
	}
	

}
