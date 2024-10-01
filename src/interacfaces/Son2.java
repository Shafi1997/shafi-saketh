package interacfaces;

public class Son2 implements Phone {
@Override
public void ringtone() {
	System.out.println("kalapila v3");
}
public static void main(String[] args) {
	Son2 Son2=new Son2();
	Son2.ringtone();
		
}
}
