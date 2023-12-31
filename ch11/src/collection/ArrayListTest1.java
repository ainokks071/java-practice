package collection;

import java.util.Collection; //Collection은 인터페이스
import java.util.Collections; //Collections는 컬렉션 다루는 클래스
import java.util.List;
import java.util.ArrayList; //java.util패키지의 ArrayList클래스를 이용하겠다!!

//ArrayList를 사용해보자.
public class ArrayListTest1 {
int[] arr; Object[] ob;

	public static void main(String[] args) {
		
		//1) 생성자 : 길이가 10인 ArrayList 객체생성 ! (Object[] 멤버변수존재)
		ArrayList list1 = new ArrayList(10);
		
		int a;//기본자료형 '정수 값' 
		double d;//기본자료형 '실수 값'
		Integer b;//참조자료형 '주소 값'
		String c;//참조자료형 '주소 값'
		
		//2) ArrayList객체에 list1참조변수로 접근하여, add() 메서드 호출 ! 순서대로 저장 !!
		// add()메서드에 의하여 객체들이 Object[] 배열에 차례대로 저장. 
		// ArrayList에는 객체만 저장가능! (최고조상 Object, 다형성)
		list1.add(new Integer(5));
		// autoboxing에 의해 자동으로 기본형->참조형으로 자동변환.
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);
		// list1 : [5, 4, 2, 0, 1, 3]
		System.out.println(list1); 
		System.out.println(list1.get(5)); // 인덱스[5]에 저장된 객체를 반환 : Integer 3
		System.out.println(list1.size()); // 저장된 객체의 갯수를 반환 : 6
		
		
		
		//3) ArrayList객체에 list1참조변수로 접근하여, subList() 메서드 호출 ! -> List로 반환.
		List subList = list1.subList(1, 4); //[1], [2], [3]  (1 <= x < 4)
		
		//4) 생성자의 매개변수 : Collection(부모)! -> List(자식) 인스턴스 받아줄 수 있음! (다형성) 
		ArrayList list2 = new ArrayList(subList); //List는읽기전용?
		// list2 : [4, 2, 0]
		print(list1, list2);
		
		//5) Collections클래스 : 컬렉션 다루기 위한 메서드 제공(Math클래스처럼, 유틸클래스.). sort()메서드 : 오름차순 정렬(사용만 잘하자..)
		Collections.sort(list1);
		Collections.sort(list2);
		
		print(list1, list2);

		
		
		//6)  ArrayList객체에 list1참조변수로 접근하여, containsAll() 메서드 호출 ! (list1에 list2가 모두 포함되어있니??) -> boolean으로 반환.
		System.out.println(list1.containsAll(list2));
		
		//7) ArrayList객체에 list2참조변수로 접근하여, add() 메서드 호출 ! 마지막 부터, 순서대로 저장.
		list2.add("B");
		list2.add("C");
		//add(int, Object) 메서드 호출 ! 인덱스[3]에 A추가!!
		//3번에 A 넣으면 뒤에있는애들 오른쪽으로 한칸씩 밀린다.
		list2.add(3, "A"); 
		

		
		print(list1, list2);
		//set(int, Object) 메서드 호출 ! 인덱스[3]의 객체를 AA로 변경!!
		//3번을 AA로 "변경"하는 것이므로, 밀리지않는다.		
		list2.set(3, "AA");
		print(list1, list2);
		
		
		//8)indexOf()메서드를 사용해보자 : list1에서 지정된 "객체"의 위치를 인덱스로 알려줌.
		list1.add(0, "1"); //인덱스[0]에 String(문자열) 1 추가. --> Integer(정수) 1과 구분 되겠지!!
		print(list1, list2);
		System.out.println("인덱스 ["+list1.indexOf("1")+"]"); //list1에서, 해당하는 객체를 찾아, 인덱스로 반환!! 없으면 -1반환. //[0]
		System.out.println("인덱스 ["+list1.indexOf(1)+"]"); //list1에서, 해당하는 객체를 찾아, 인덱스로 반환!! 없으면 -1반환. //[2]
		System.out.println("인덱스 ["+list1.indexOf(5)+"]"); //list1에서, 해당하는 객체를 찾아, 인덱스로 반환!! 없으면 -1반환. //[6]

		// list1 : ["1", 0, 1, 2, 3, 4, 5]
		// list2 : [0, 2, 4, "AA", "B", "C"]
		
		
		//9)remove() 메서드를 사용해보자. -> "index로 객체 삭제" or "객체 명시"해서 삭제
		//맨 오른쪽 요소가 아닌 다른 요소를 삭제한다면 -> 빈공간을 메꾸기위해 왼쪽으로 이동!(배열복사 관여)
		//맨 오른쪽 요소를 삭제한다면 -> 배열복사 X, 밀리는현상 X
//		list1.remove(0); //[0] : "1" 삭제. //매개변수 : index로삭제 !
//		list1.remove("1");//"1" 삭제. //매개변수 : 객체(Object) 명시해서 삭제 !
//		list1.remove(2); //[2] : Integer 1 삭제. //index로 삭제 
//		list1.remove(new Integer(1)); // Integer 1 삭제. //객체 명시해서 삭제.

		
		//10)retainAll() 메서드를 사용해보자. : list2와 겹치는 부분만 남기고 모두 삭제.(교집합개념)		
		list1.retainAll(list2);
		print(list1, list2);
		// list1 : [0, 2, 4]
		// list2 : [0, 2, 4, "AA", "B", "C"]

		
		//11) remove() 메서드를 사용해서, list1과 겹치는 부분을 list2에서 삭제해보자.(차집합개념)
		//list2 - list1
		//list1 : 0, 2, 4
		//list2 : 0, 2, 4, AA, B, C -> AA, B, C
//		
//		//방법1) 차집합.
//		list2.removeAll(list1);
//		print(list1, list2);

		
		
		//방법2) remove()메서드를 사용할 때, 뒤에서부터 삭제하는 것이 좋다.
		for(int i = list2.size()-1; i >= 0; i-- ) {
			
			if(list1.contains(list2.get(i))) {
				list2.remove(i);
			}
			
		}
		
		print(list1, list2);
		
	}

	
	
	public static void print(ArrayList list1, ArrayList list2) {
		
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println();
	}

}

//public class ArrayList { //머릿속으로 상상.
//	
//	
//	Object[] myArray; //멤버배열
//
//	MyArrayList(int initialCapacity) {
//
//		myArray = new Object[i];
//
//	}
//	
//	int i;
//	boolean add(Object o) {
//		if(o instanceof Student) {
//			myArray[i] = (Student)o;
//			i = i+1;
//			return true;
//		} else {			
//			return false;
//		}
//	}