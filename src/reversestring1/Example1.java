package reversestring1;

public class Example1 {
	public static void main(String[] args) {
		String orginalString ="Sakethyallanki";
		String reversedString="";
		for(int i=orginalString.length()-1;i>=0;i--) {
			reversedString +=orginalString.charAt(i);
			
		}
		   System.out.println("Original String: " + orginalString);  
		      System.out.println("Reversed String: " + reversedString);
	}
	

}
