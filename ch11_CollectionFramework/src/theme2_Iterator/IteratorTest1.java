package theme2_Iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class IteratorTest1 {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
//		1. iterator 객체 얻기
		Iterator it = list.iterator();
		
//		2. 읽기
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
//		iterator는 1회용이라, 객체 새로 얻어와야 함!
		it = list.iterator();
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		for(int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			System.out.println(obj);
		}
		
		
//		만약, 위의 ArrayList를 HashSet으로 바꿔도, 읽어오는 코드는 동일 !
		Set set = new HashSet();
		set.add(0);
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		
		Iterator it2 = set.iterator();
		while (it2.hasNext()) {
			Object obj = it2.next();
			System.out.println(obj);
		}
		
//		ArrayList 특이적 읽는 코드라, HashSet에는 적용 X -> get()메서드가 set에는 없다 !!!!
//		for(int i = 0; i < set.size(); i++) {
//			Object obj = set.get(i);
//			System.out.println(obj);
//		}

		
		

	}

}
