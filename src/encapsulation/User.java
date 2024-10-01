package encapsulation;

public class User {

	private String name;
	private long phno;
	private String email;
	private String password;
	private String address;
	
    
	//sourcre-->generate getters and setters.
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
public static void main(String[] args) {
	User user = new User();
	user.setName("saketh");
	user.setPhno(7277723222l);
	user.setEmail("sakethyallanki1008@gmail.com");
	user.setPassword("12345752");
	user.setAddress("leh");
	System.out.println();
	
	System.out.println(user.getName());
	System.out.println(user.getPhno());
	System.out.println(user.getEmail());
	System.out.println(user.getPassword());
	System.out.println(user.getAddress());
	
	
	User user2 = new User();
	user.setName("ramesh");
	user.setPhno(8985714061l);
	user.setEmail("rajeshyallanki1007@gmail.com");
	user.setPassword("55584115");
	user.setAddress("eturnagram");
	System.out.println();
	
	System.out.println(user.getName());
	System.out.println(user.getPhno());
	System.out.println(user.getEmail());
	System.out.println(user.getPassword());
	System.out.println(user.getAddress());
	
	
	
}
}
