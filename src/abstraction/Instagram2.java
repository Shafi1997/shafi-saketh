package abstraction;

public class Instagram2 extends Instagram {

	@Override
	public void sendaRequest() {
		System.out.println("request sent");
	}

	@Override
	public void uploadApost() {
		System.out.println("post uploaded sucesfully");

	}

	@Override
	public void uploadAstory() {
		System.out.println("story uploaded");

	}

}
