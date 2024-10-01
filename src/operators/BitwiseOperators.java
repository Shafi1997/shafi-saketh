package operators;

public class BitwiseOperators {
	public static void method1(int a ,int b) {
		if (a>b &a!=b) {
			System.out.println("it is raining");
			
		}else {
				System.out.println("rain has stopped");
			}
		}
		public static void method2(int a, int b) {
			if (a>b | a!=b) {
				System.out.println("i am going to movie");
				
			}else {
				System.out.println("i am not going to movie");
				
			}

		}
public static void main(String[] args) {
	method1(2, 10);
	method2(10, 50);
}
	}


