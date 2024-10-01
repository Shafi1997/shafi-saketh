package reverseswaping;

public class ex2 {
	public static void main(String[] args) {
		
		int a=50;
		int b=60;
		System.out.println("before swapping the numbers:"+a+" "+b);
		
		a=a+b;//50+60=110		
		b=a-b;//110-60=50
		a=a-b;//110-50=60
		
		System.out.println("after swapping the numbers :"+a+"  "+b);
	}

}
