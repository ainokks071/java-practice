package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class StackAndQueue1 {

	public static void main(String[] args) {
	
		ArrayList arrayList = new ArrayList();
		arrayList.add(0);
		arrayList.add(1);
		arrayList.add(2);
		System.out.println(arrayList);
		arrayList.remove(2);
		arrayList.remove(1);
		arrayList.remove(0);
		System.out.println(arrayList);
		
		LinkedList linkedList = new LinkedList();
		linkedList.add(0);
		linkedList.add(1);
		linkedList.add(2);
		System.out.println(linkedList);
		linkedList.remove(0);
		linkedList.remove(0);
		linkedList.remove(0);
		System.out.println(linkedList);
	}
}
