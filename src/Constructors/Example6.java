package Constructors;

public class Example6 {

			// method overloading
			public static int payment(int cash) {
				return cash;
			}
			public static void payment(long card) {
				System.out.println("paid through card");
				
			}
			public void payment(String UPI) {
				System.out.println("paid with UPI");
			}
			public static void netbanking(String username, String paassword) {
				System.out.println("paid with netbanking");
			}
			// constructor overloading
			 int cash;
			 long card;
			 String UPI;
			 String netbanking;
			 
			 public Example6(int cash,long card,String UPI,String netbanking) {
				 this.cash=cash;
				 this.card=card;
				 this.UPI=UPI;
				 this.netbanking=netbanking;
				 
				 
				 System.out.println("cash :" + this.cash);
				 System.out.println("card :" + this.card);
				 System.out.println("UPI :" + this.UPI);
				 System.out.println("netbanking :" + this.netbanking);
				 System.out.println();
			 }
			 public Example6(int cash,long card,String UPI) {
				 
				 this.cash=cash;
				 this.card=card;
				 this.UPI=UPI;
				 
				 
				 System.out.println("cash :" + this.cash);
				 System.out.println("card :" + this.card);
				 System.out.println("UPI :" + this.UPI);
				 System.out.println();
				 
				 
			 }
			 public static void main(String[] args) {
				 Example6 Example1 = new Example6(5020, 454144641l, "suresh@ybl", "sakethpassword");
				 Example6 Example2 = new Example6(5000,622222222l, "ramesh@ybl");
				System.out.println(payment(50020));
				payment(541115l);
				Example2.payment("saketh@ybl");
				Example2.netbanking("rajesh", "password");
			
		}
				
			}

