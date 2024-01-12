package collection;

import java.util.ArrayList;

public class ArrayListTest3 {
		
	public static void main(String[] args) {
		//11) remove() 메서드를 사용해서, list1과 겹치는 부분을 list2에서 삭제해보자.(차집합개념)
		//list2 - list1
		//list1 : C, AA, 4
		//list2 : 0, 2, 4, AA, B, C
		

		ArrayList list1 = new ArrayList(1);
		list1.add("C");
		list1.add("AA");
		list1.add(4);
		list1.add(9);
		list1.add("ㅋ");
		ArrayList list2 = new ArrayList();
		list2.add(0);
		list2.add(2);
		list2.add(4);
		list2.add("AA");
		list2.add("B");
		list2.add("C");
		
		
		
		System.out.println("list1 : " + list1); //list1 : [C, AA, 4, 9, ㅋ]
		System.out.println("list2 : " + list2); //list2 : [0, 2, 4, AA, B, C]
		
		
		
		
		
		
		
//		list2.removeAll(list1);
//
//		System.out.println("list1 : " + list1); //list1 : [C, AA, 4, 9, ㅋ]
//		System.out.println("list2 : " + list2); //list2 : [0, 2, B]
		
		
		
		
		
//		//검사 할 때 왜 오른쪽에서부터 검사하는지 잘 생각해봐라!!
//		for(int i = list2.size()-1; i >= 0; i--) {
//		if(list1.contains(list2.get(i))) {
//			list2.remove(i); //remove()메서드를 쓰니까 !!
//		} 
//		}
//		System.out.println("list1 : " + list1); //list1 : [C, AA, 4, 9, ㅋ]
//		System.out.println("list2 : " + list2); //list2 : [0, 2, B]
		
		
	}


}

