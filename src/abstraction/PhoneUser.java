package abstraction;

public class PhoneUser {
	public  Phone unlock() {
		Phone Phone=new PhoneFunctionality();
		return Phone;
		
	}
public static void main(String[] args) {
	PhoneUser PhoneUser=new PhoneUser();
	Phone Phone = PhoneUser.unlock();
	Phone.Call();
	Phone.Message();
	Phone.Camera();
}
}
