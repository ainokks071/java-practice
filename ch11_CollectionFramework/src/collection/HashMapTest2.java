package collection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest2 {
	//참가자명단, 참가자와 점수 따로 출력, 총점, 평균, 최고점, 최저점 출력!!
	public static void main(String[] args) {

		Map map = new HashMap();
		map.put("김자바", 100);
		map.put("이자바", 100);
		map.put("강자바", 80);
		map.put("안자바", 90);
		
		Set set = map.keySet();
		System.out.println("참가자 명단 : " + set);
		
		//map에 저장된 (key, value) 읽어오기!! -> Map인터페이스 내부에 Entry인터페이스 있다.
		set = map.entrySet();
		System.out.println("날 것의 데이타 : " + set);
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			Entry e = (Entry)itr.next();
			System.out.println("이름 : " + e.getKey() + ", 점수 : " + e.getValue());
		}
		//
		
		Collection c = map.values();
		itr = c.iterator();
		
		int sum = 0;
		while(itr.hasNext()) {
			sum += (int)itr.next();
		}
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + sum/(float)set.size());
		
		System.out.println("최고점 : " + Collections.max(c));
		System.out.println("최저점 : " + Collections.min(c));
		
	}

}
