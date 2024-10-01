package Constructors;

public class Example9 {
	
		String title;
		String author;      // constructor overloading
		int year;
		
		public Example9(String title , String author,int year) { /// three arguments
			this.title=title;
			this.author=author;
			this.year=year;
			
			
			System.out.println("title:"+this.title);
			System.out.println("author :"+this.author);
			System.out.println("year :"+this.year);
			System.out.println();
			
			
			
		}
		public Example9(String title , String author) { ///two arguments
			this.title=title;
			this.author=author;
			this.year=1990;
			

			System.out.println("title:"+this.title);
			System.out.println("author :"+this.author);
			System.out.println("year :"+this.year);
			System.out.println();
		}
		
	     /// method overloading
		public static void book(String title) {
			System.out.println("book name");
		}

public static void book(int year) {
	System.out.println("book released in which year");
}
public static void main(String[] args) {
	Example9 example1=new Example9("Richdad", "robert", 1984);
	Example9 example2=new Example9("how to win your friends", "grols");
	Example9.book("rich dad");
	Example9.book(2000);
}
}
