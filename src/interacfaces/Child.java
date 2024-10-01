package interacfaces;

public class Child implements Father,Mother{

	@Override
	public void moneyforplot() {
		System.out.println("10lakhs");		
	}

	@Override
	public void moneyforbike() {
		System.out.println("1lakh");
		
	}
public static void main(String[] args) {
	Child Child = new Child();
	Child.moneyforbike();
	Child.moneyforplot();
}
}
