package reverseswaping;

import java.util.Scanner;

public class Findthelargestnuber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number:");
		int a=sc.nextInt();
		System.out.println("Enter Second Number:");
		int b=sc.nextInt();
		System.out.println("Enter Third Number:");
		int c=sc.nextInt();
		//using ternary operators
		int largest=c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println(largest+" is Largest Number");
		}
		

}
