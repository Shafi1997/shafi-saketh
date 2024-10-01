package interaces;

public class Teamlead extends Manager {
@Override
public void Work() {
	System.out.println("should complete all the tasks");
	
}
public static void main(String[] args) {
	Teamlead Teamlead = new Teamlead();
	Teamlead.Work();
}
}
