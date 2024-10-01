package operators;

public class TernaryOperators {
		
		public void method() {
		String kk = 10>5? "true":"false";
		System.out.println(kk);
		}
		
		public void method1(int age) {
			String dd = age<=18?"Eligible for vote": "Not eligible for vote";
			System.out.println(dd);
			
			int i = age!=20?18:34;
			System.out.println(i);
			
			String ss = age>=18?"Eligible for vote": "Not eligible for vote";
			System.out.println(ss);
		}
		
		
		public static void main(String[] args) {
			TernaryOperators to = new TernaryOperators();
			to.method();
			to.method1(0);
				

		}

	


}
