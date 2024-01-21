package theme2_Iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratorTest3 {

	public static void main(String[] args) {
		
		Map map = new HashMap();
		map.put(1, "가");
		map.put(2, "가");
		map.put(3, "다");
		map.put(4, "라");
		map.put(5, "마");
		
		Iterator it = map.entrySet().iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		it = map.keySet().iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		it = map.values().iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
