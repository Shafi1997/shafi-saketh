package interacfaces;

public class Daughter implements Phone {
	
@Override
public void ringtone() {
		System.out.println("Crazy Frog");
}
public static void main(String[] args) {
	 Daughter Daughter=new Daughter();
	 Daughter.ringtone();
}
 
    
 
}
