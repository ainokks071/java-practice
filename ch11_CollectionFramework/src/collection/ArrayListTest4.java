package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest4 {
		
	public static void main(String[] args) {
		/*
		 * 1. 등록된 영화 list1 중 삭제할 영화 선택 list1 : [0, 1, 2, 3]
		 * 
		 * 2. 삭제된 영화 list2에 담기. list2 : [2]
		 * 
		 * 3. list1 - list2 : list1.removeAll(list2);
		 * 
		 * 4. 결과 // list1 : [0, 1, 3] list2 : [2]
		 * 
		 * 
		 *  - 기존 lis1에서 삭제된 list2 -> "list3" : 이건 안되나본데?
		 * */
		
		
		ArrayList list1 = new ArrayList(); //기존 list1
		list1.add("0");
		list1.add("1");
		list1.add("2");
		list1.add("3");
		
//		ArrayList list3 = new ArrayList(); //기존 list1
//		Object ob = list1.clone();
//		System.out.println("ob" + ob);
		
		
		System.out.println("아래 번호 중 삭제할 번호 하나를 입력하세요.");
		System.out.println(list1); //기존 list1
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		
//		ArrayList list3 = new ArrayList(); //기존 - 삭제 list3
		
		 
		
		
		
		ArrayList list2 = new ArrayList(); //삭제된 list2
		if(num == 0) {
			list2.add(list1.get(num)); 
		} else if(num == 1) {
			list2.add(list1.get(num)); 
		} else if(num == 2) {			
			list2.add(list1.get(num)); 
		} else if(num == 3) {
			list2.add(list1.get(num)); 
		}
			System.out.println(list2 + "를 삭제하셨습니다.");
		
		if(list1.removeAll(list2)) {
			//list1에 변화 생김!
			System.out.println("남아있는 번호는 : " + list1);
			System.out.println("삭제된 번호는 : " + list2);
		}
		
		list1.addAll(list2);
		System.out.println(list1); 
		System.out.println(list2); 		
	}


}

