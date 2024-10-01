package reverse;

public class Stringrevrese {
	public static void main(String[] args) {
		String str="Sakethyallanki";
		String rever ="";
		char ch;
		
		for(int i=0; i<str.length(); i++) {
			ch =str.charAt(i);
			rever =ch + rever;
			
		}
		System.out.println("Reverse string=" +rever);
	}

}
