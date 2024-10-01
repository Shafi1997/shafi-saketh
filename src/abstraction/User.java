package abstraction;

public class User {
	public static Instagram output() {
		Instagram Instagram = new Instagram2();
		return Instagram;
	}
	public static void main(String[] args) {
		Instagram Instagram = output();
		Instagram.sendaRequest();
		Instagram.uploadAstory();
		Instagram.uploadApost();
	}
}

