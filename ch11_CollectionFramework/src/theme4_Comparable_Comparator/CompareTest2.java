package theme4_Comparable_Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareTest2 {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("abc", "aaa", "bbb", "ddd", "zmd");
		
//		Comparator는 함수형 인터페이스 !!
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2); //오름차순정렬. --> 내림차순 정렬은? : o2.compareTo(o1) !! : 이것이 정렬 기준 제공한다는 것 !
			}
			
		});
		
		Collections.sort(list, (o1, o2) -> o1.compareTo(o2));
		Collections.sort(list, (o1, o2) -> o2.compareTo(o1));
		Collections.sort(list, (o1, o2) -> +1);
		Collections.sort(list, (o1, o2) -> -1);
		
//		Collections.sort(list); //기본 오름차순정렬 : list 안에 String 존재 ! <--Comparable 구현한 클래스 !
		
		
		System.out.println(list);
	}
}