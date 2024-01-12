package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListTest1 {

	public static void main(String[] args) {
	
		
		
		LinkedList linkedList1 = new LinkedList();
		
		ArrayList arrayList1 = new ArrayList();
		
		for(int i = 0; i < 10000; i++) {
			linkedList1.add(i);
			arrayList1.add(i);
		}
		
		System.out.println(linkedList1.get(9999)); //읽어오는 속도 느리다.
		linkedList1.remove(5000); //중간 데이터 추가/삭제하는 속도 빠르다. 
		
		System.out.println(arrayList1.get(9999)); //읽어오는 속도 빠르다.
		arrayList1.remove(5000); //중간 데이터 추가/삭제하는 속도 느리다.(배열복사)
		
		
		
		
//		System.out.println(list1.get(0));
//		list1.remove(0);
//		System.out.println(list1.get(0));
		
		//왼쪽에서부터 하나씩 지워보자. --> 얘도 ArrayList랑 똑같네..
		

//		for(int i = 0; i < list1.size(); i++) {
//		list1.remove(i);
//		}
//		
//		System.out.println(list1);
		
	}

}
