package theme1_ArrayList;

import java.util.ArrayList;
import java.util.Collections;




public class ArrayListTest1 {

	public static void main(String[] args) {
//		기본길이(용량, capacity)가 10인 ArrayList를 생성 
		ArrayList list1 = new ArrayList(10);
		
//		ArrayList는 객체만 저장 가능(Object[] ) 오토박싱 필요 
//		autoboxing : 기본형 -> 참조형으로 자동 변환
		list1.add(5);
//		list1.add(new Integer(4));
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);
		
		
//		1<= x <4 : [4, 2, 0] // subList의 반환타입인 List는 읽기전용? 추가, 삭제 되는데?
//		읽기전용 이므로, new ArrayList 해줘야...
						     // 생성자 ArrayList(Collection c)를 사용하여 새로운 ArrayList 생성.			
		ArrayList list2 = new ArrayList(list1.subList(1, 4)); 
		print(list1, list2);
		
//		Collections클래스 : 컬렉션을 다루는데 유용한 메서드 제공
//		기본은 오름차순 정렬 
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		
//		list1에 list2 포함 ?
		System.out.println(list1.containsAll(list2));
		
//		맨 마지막에 추가
		list2.add("B");
		list2.add("C");
//		인덱스3에 추가, 그 뒤의 객체들은 한칸씩 뒤로 이동하겠지.
		list2.add(3, "A");
		print(list1, list2);
		
//		변경
		list2.set(3, "AA");
		print(list1, list2);
		
		
//		indextof
		list1.add(0, "1");
		print(list1, list2);
		System.out.println("숫자 1의 위치 : " + list1.indexOf(1) + ", 문자열 1의 위치 : " + list1.indexOf("1"));
		list1.remove("1");
		print(list1, list2);
		
//	 	remove : 인덱스 or 객체로 지우기.
//		인덱스가 0번째 지우기. -> 앞으로 한칸씩 이동하겠네.
//		list1.remove(0);
//		값이 0인 객체 지우기
//		list1.remove(new Integer(0));
		
//		retainall : 교집합만 남기고 지우기.
		list1.retainAll(list2);
		print(list1, list2);

	
		
		
		
	}

	private static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : " + list1 + ", list2 : " + list2);
	}

}
