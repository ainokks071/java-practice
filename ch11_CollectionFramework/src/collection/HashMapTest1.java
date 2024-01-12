package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapTest1 {

	public static void main(String[] args) {

		Map map = new HashMap();
		
		map.put("asdf", "1234");
		map.put("kimks071", "rlaqodwkd1@");
		System.out.println(map);
		map.put("asdf", "5678");
		System.out.println(map); //id : asdf pw : 5678 // id : qwer pw : 1234 //
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("ID를 입력해주세요.");
			String id = sc.nextLine();
			System.out.println("PassWord를 입력해주세요.");
			String pw = sc.nextLine();
			
			if(map.containsKey(id)) {
				
				if(map.get(id).equals(pw)) {
					
					System.out.println("로그인 성공!");
					
					break;
					
				} else {
					
					System.out.println("PassWord가 일치하지 않습니다. 다시 입력해주세요.");
					
//					continue;
				}
				
			} else {
				System.out.println("해당하는 ID가 존재하지 않습니다. 다시 입력해주세요.");
//				continue;
			}
			
		}
	}

}
