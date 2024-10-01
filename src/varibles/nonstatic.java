package varibles;

public class nonstatic {
	public void city() {
		System.out.println("hyderbad");
		
	}
	public void state() {
		System.out.println("telengana");
		
	}
public static void main(String[] args) {
	nonstatic state = new nonstatic();
	state.state();
} 
}
