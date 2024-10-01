package collections;

import java.util.HashSet;

public class HashSet1 {
	public static void method1() {
		HashSet<String>HashSet=new HashSet<>();
		HashSet.add("america");
		HashSet.add("london");
		HashSet.add("Uk");
		HashSet.add("canada");
		HashSet.add("austrila");
		HashSet.add("ireland");
		HashSet.add("london");
		System.out.println(HashSet);
		System.out.println(HashSet.size());
		System.out.println(HashSet.clone());
		//HashSet.clear();
		//System.out.println(HashSet);
		System.out.println(HashSet.isEmpty());
		System.out.println(HashSet.remove("canada"));
		System.out.println(HashSet);
		
		
	}
	public static void main(String[] args) {
		method1();
	}

}
