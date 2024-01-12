package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetTest2 {

	public static void main(String[] args) {
		
		//중복없는 로또번호! -> set 이용.
		Set set = new HashSet();
		
		for(int i = 0; set.size() < 6; i++) {
		set.add((int)((Math.random()*45)+1)); 
		}
		
		List list = new ArrayList(set); // Set -> List로 변환!(컬렉션 간의 변환)
		Collections.sort(list); //sort()메서드의 매개변수의 타입은 List이므로 Set 전달 X !! 
		
		System.out.println(list);
		
		
		
		//만약, 중복있는 로또??
//		ArrayList list = new ArrayList();
		
//		for(int i = 0; list.size() < 6; i++) {
//		list.add((int)((Math.random()*45)+1)); 
//		}
		
//		Collections.sort(list);
//		System.out.println(list);
		
		
		
		
	}

}
