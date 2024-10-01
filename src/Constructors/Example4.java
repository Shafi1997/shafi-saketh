package Constructors;

public class Example4 {
	String title;
	String author;
	int year;
	
	public Example4(String title , String author,int year) {
		this.title=title;
		this.author=author;
		this.year=year;
		
		
		System.out.println("title:"+this.title);
		System.out.println("author :"+this.author);
		System.out.println("year :"+this.year);
		System.out.println();
		
		
		
	}
	public Example4(String title , String author) {
		this.title=title;
		this.author=author;
		this.year=1990;
		

		System.out.println("title:"+this.title);
		System.out.println("author :"+this.author);
		System.out.println("year :"+this.year);
		System.out.println();
	}
public static void main(String[] args) {
	Example4 example1=new Example4("Richdad", "robert", 1975);
	Example4 example2=new Example4("Donna Tartt", "goldfinch");
}
}
