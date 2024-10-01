package ControlStatements;

import java.util.Scanner;

public class SwitchStament {
	public static void method1() {
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter the vehicle");
		String vehicle = scanner.next();
		
		switch (vehicle) {
		case "car":
			System.out.println("pay 400");
			break;
		case "jcb":
			System.out.println("pay 2000");
			break;
		case "Bus":
			System.out.println("pay 190");
             break;
		default:
			System.out.println("no vehicle enterd");
		}
		
	}
public static void main(String[] args) {
	method1();
}
}
