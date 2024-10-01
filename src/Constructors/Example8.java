package Constructors;

public class Example8 {
	// method overloading
				
				public static void Travel(String bus) {
					System.out.println("travelling by bus");
					
				}
				public static void Travel(long car) {
					System.out.println("travelling by car");
				}
				public static void Travel(int bike) {
					System.out.println("Travelling by bike");
				}
				// constructor overloading
				String bus;
				long car;
				String bike;
				 
				 public Example8(String bus ,long car,String bike) {
					 this.bus=bus;
					 this.car=car;
					 this.bike=bike;
					
					 
					 
					 System.out.println("bus :" + this.bus);
					 System.out.println("car :" + this.car);
					 System.out.println("bike :" + this.bike);
					 System.out.println();
				 }
				 public Example8(String bus, long car) {
					 
					 this.bus=bus;
					 this.car=car;
					
					 
					 
					 System.out.println("bus :" + this.bus);
					 System.out.println("car :" + this.car);
					 System.out.println();
					 
				 }
				 public static void main(String[] args) {
					 Example8 Example1 = new Example8("pallavelugu", 4121l, "fz");
					 Example8 Example2 = new Example8("dolphin", 2939l);
					Example8.Travel("metro express");
					Example8.Travel(44755l);
				Example8.Travel(2);
			}
					

}
