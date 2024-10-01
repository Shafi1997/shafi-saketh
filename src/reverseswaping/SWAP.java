package reverseswaping;

public class SWAP {
	public static void main(String[] args) {
		int a=20 ; int b=30;
		System.out.println("before swapping the numbers:"+a+"   "+b);
		
		a=a+b;  //20+30=50
		b=a-b; //50-30=20
		a=a-b;  //50-20=30
		System.out.println("after swapping the numbers:"+a+"   "+b);
		
	}
	
}
