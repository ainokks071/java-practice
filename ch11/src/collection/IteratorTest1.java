package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


//iterator() 메서드는 Collection 인터페이스. -> List, Set
public class IteratorTest1 {

	public static void main(String[] args) {

		//만약, ArrayList를 HashSet으로 변경해야한다면?
		
		Collection list1 = new HashSet();
		
//		ArrayList list1 = new ArrayList();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		list1.add("4");
		list1.add("5");
		
		// #1. Iterator로 읽어오기. -> ArrayList를 HashSet으로 변경해도 아래의 코드 사용가능!!(표준화)
		Iterator iterator = list1.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
//		iterator는 1회용이므로, 다시 객체 생성 해줘야함!!
//		iterator = list1.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
		// #2. 고전적인 방법으로 읽어오기. -> ArrayList를 HashSet으로 변경하면 아래의 코드는 사용불가!! get()메서드 없어서.
//		for(int i = 0; i < list1.size(); i++) {
//			System.out.println(list1.get(i));
//		}
		
		
	}

}
