package collections;

import java.util.ArrayList;

public class Arraylist {
	public void method1() {

		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Praveen");
		arrayList.add("Saketh");
		arrayList.add("rajesh");
		arrayList.add("rahul");
		arrayList.add("omkar");
		arrayList.add("teja");
		arrayList.add("arya");
		
		System.out.println(arrayList);
		arrayList.add(4, "rakesh");
		System.out.println(arrayList);
//		arrayList.clear();
//		System.out.println(arrayList);
		System.out.println(arrayList.get(5));
		System.out.println(arrayList.lastIndexOf("omkar"));
		System.out.println(arrayList.isEmpty());
		System.out.println(arrayList.clone());
		arrayList.remove(4);
		System.out.println(arrayList);
		arrayList.remove("teja");
		System.out.println(arrayList);
		arrayList.set(5, "srikar");
		System.out.println(arrayList);
		System.out.println(arrayList.size());
		arrayList.trimToSize();
		System.out.println(arrayList);
		
	for (String string : arrayList) {
		System.out.println(string);
		}
	}
	
public static void main(String[] args) {
	Arraylist arraylist = new Arraylist();
	arraylist.method1();
}
}
