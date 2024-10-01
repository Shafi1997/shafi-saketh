package reverseswaping;

public class eee3 {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("before swapping the numbers"+a+"  "+b);
		
		a=a+b;//10+20=30
		b=a-b;//30-20=10
		a=a-b;//30-10=20
		System.out.println("after swapping the numbers"+a+"  "+b);
	}

}
