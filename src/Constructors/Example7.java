package Constructors;

public class Example7 {
	String title;
	String author;      // constructor overloading
	int year;
	
	public Example7(String title , String author,int year) { /// three arguments
		this.title=title;
		this.author=author;
		this.year=year;
		
		
		System.out.println("title:"+this.title);
		System.out.println("author :"+this.author);
		System.out.println("year :"+this.year);
		System.out.println();
		
		
		
	}
	public Example7(String title , String author) { ///two arguments
		this.title=title;
		this.author=author;
		this.year=1990;
		

		System.out.println("title:"+this.title);
		System.out.println("author :"+this.author);
		System.out.println("year :"+this.year);
		System.out.println();
	}
	
     /// method overloading
	
	public static void unlockThephone(String password) {
		System.out.println("Phone unlocked via password..");
		System.out.println();
	}
		
	
	public static void unlockThePhone(int pin) {
		System.out.println("phone unlocked with pin..");
		System.out.println();
		
	}
	public static void unlockThePhone(long pattern) {
		System.out.println("phone unlocked with pattern....");
		System.out.println();
	}
public static void main(String[] args) {
	Example7 example1=new Example7("Richdadpoordad", "robert", 1975);
	Example7 example2=new Example7("Donna Tartt", "goldfinch");
    Example7.unlockThePhone(224);
    Example7.unlockThePhone(154887874l);
    Example7.unlockThephone("22547");
 
}

}
