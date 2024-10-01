package interacfaces;

public class Dad implements Phone{
	
@Override
public void ringtone() {
System.out.println("rock songs");
	
}
public static void main(String[] args) {
Dad Dad = new Dad();
Dad.ringtone();
}
}
