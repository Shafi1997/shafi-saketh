package collections;

import java.util.LinkedList;

public class Linkedlist {
	
	public void method1() {
		LinkedList<Integer> linkedList= new LinkedList<>();
		linkedList.add(100);
		linkedList.add(200);
		linkedList.add(300);
		linkedList.add(400);
		linkedList.add(500);
		linkedList.add(600);
		System.out.println(linkedList);
		linkedList.add(6, 700);
		System.out.println(linkedList);
		linkedList.addFirst(99);
		linkedList.addLast(800);
		System.out.println(linkedList);
		System.out.println(linkedList.contains(100));
		System.out.println(linkedList.element());
		System.out.println(linkedList.getFirst());
		System.out.println(linkedList.getLast());
		System.out.println(linkedList.indexOf(700));
		System.out.println(linkedList.offer(1000));
		System.out.println(linkedList);
		System.out.println(linkedList.peek());
		System.out.println(linkedList.peekFirst());
		System.out.println(linkedList.peekLast());
		System.out.println(linkedList.poll());
		System.out.println(linkedList);
		System.out.println(linkedList.pollFirst());
		System.out.println(linkedList);
		System.out.println(linkedList.pollLast());
		System.out.println(linkedList);
		System.out.println(linkedList.pop());
		linkedList.push(101);
		System.out.println(linkedList);
		System.out.println(linkedList.size());
		
	}
public static void main(String[] args) {
	Linkedlist linkedlist = new Linkedlist();
	linkedlist.method1();
}
}
