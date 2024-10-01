package Multilevelinheritance;

public class son extends father {
	
	public static void Property1() {
		System.out.println("i have 0 acres of land");
	}

public static void main(String[] args) {
	son son =new son();
	son.Property2();
}
}
