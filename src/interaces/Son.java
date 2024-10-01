package interaces;

public class Son implements Parent {

	@Override
	public void Moneyforcar() {
		System.out.println("bmw car");

	}

	public static void main(String[] args) {
		Son Son = new Son();
		Son.Moneyforcar();
	}
}
