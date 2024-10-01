package abstraction;

public class PhoneFunctionality implements Phone {

	@Override
	public void Call() {
  System.out.println("call to dad");
		
	}

	@Override
	public void Message() {
		System.out.println("message sent to mother");
		
	}

	@Override
	public void Camera() {
		System.out.println("take pitcures");
		
	}

}
