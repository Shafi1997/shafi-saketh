package reverseString;

public class Example1 {
	public static void main(String[] args) {  
	      String originalString = "Saketh yallanki";  
	      String reversedString = "";  
	      for (int i = originalString.length() - 1; i >= 0; i--) {  
	         reversedString += originalString.charAt(i);  
	      }  
	      System.out.println("Original String: " + originalString);  
	      System.out.println("Reversed String: " + reversedString);  
	   }  

}
