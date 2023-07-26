package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest2 {
		
	public static void main(String[] args) {
		
		//ArrayList에 객체들을 담은 후, 하나씩 삭제해보자.
		
		ArrayList list = new ArrayList(10000);
		System.out.println(list.size()); //저장된 객체 수 : 0개.
		System.out.println(list); //[]
		list.add(1); //[0]
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6); //[5]
		System.out.println(list.size()); //저장된 객체 수 : 6개.
		System.out.println(list); //[1, 2, 3, 4, 5, 6]
		
		list.remove(0);
		System.out.println(list.size()); //저장된 객체 수 : 5개.
		System.out.println(list); //[2, 3, 4, 5, 6]
		
		// 생각1) 왼쪽부터 지워본다.
		
//		for(int i = 0; i < list.size(); i++) {
//		list.remove(i); //i : 0, 1, 2, 3, 4
//		}
//		<수행순서>
//		//[3, 4, 5, 6]
//		//[3, 5, 6]
//		//[3, 5]
//		System.out.println("왼쪽부터 삭제한 결과 : " + list); //[3, 5] 
		//======> why? : 왼쪽부터 지우면, 지워진 빈 자리를 오른쪽에서 자동으로 메꿈!! (배 열 복 사)

		// 생각2) 오른쪽부터 지워본다.

		for(int i = list.size()-1; i >= 0; i--) {
//			System.out.println(list.size()); size가 줄어든다!
			list.remove(i); //4, 3, 2, 1, 0
		}
			//<수행순서>
			//[2, 3, 4, 5]
			//[2, 3, 4]
			//[2, 3]
			//[2]
			//[]
		
		System.out.println("오른쪽부터 삭제한 결과 : " + list); //[]



		
		
	}


}

