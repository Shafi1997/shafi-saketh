package Multilevelinheritance;

public class Babydog extends Dog {

	public static void sleeping() {
		System.out.println("sleeping");
	}
	public static void main(String[] args) {
		eating();
		barking();
		sleeping();
	}
}
