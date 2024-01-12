package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest1 {

	public static void main(String[] args) {
		
		Object[] ob = {"1", 1, "2", "2", "3", "3", "4", "4"};
		
		HashSet set = new HashSet();
		
		for(int i = 0; i < ob.length; i++) {
			set.add(ob[i]);
		}
		
		System.out.println(set);
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
