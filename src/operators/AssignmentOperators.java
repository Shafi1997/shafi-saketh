package operators;

public class AssignmentOperators {
		
		public void method(int i) {
			 i+=10;
			 System.out.println(i);
			 i-=20;
			 System.out.println(i);
			 i*=5;
			 System.out.println(i);
			 i/=2;
			 System.out.println(i);
			 i%=9;
			 System.out.println(i);
			 i^=7;
			 System.out.println(i);
			 
		 }

		public static void main(String[] args) {
			AssignmentOperators ww = new AssignmentOperators();
			ww.method(5);

		}

	


}
