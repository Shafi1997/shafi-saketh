package operators;

public class UnaryOperator {
	public static void main(String[] args) {
		int i = 25;
		int j = 10;
		System.out.println(i); //25    //post prefix
		System.out.println(i++); //25
		System.out.println(--i); //25
		System.out.println(i); //25
		
		System.out.println(j); //10
		System.out.println(--j); //9  //prefix
		System.out.println(j--); //9
		System.out.println(j); //8
	}

}
