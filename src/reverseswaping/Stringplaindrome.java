package reverseswaping;

public class Stringplaindrome {
	public static void main(String[] args) {
		String input ="sai";
		int len=input.length();
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+input.charAt(i);
//			System.out.println(i);
		}
		System.out.println("reverse String value : "+rev);
		
		if(rev.equals(input))
			
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("NOT Palindrome");
		}
	}

}
