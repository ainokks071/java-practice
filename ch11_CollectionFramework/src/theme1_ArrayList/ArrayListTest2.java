package theme1_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest2 {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
//		앞에서부터 지우면 다 지우지 못함.
//		[0,1,2,3,4] -> [1,2,3,4] -> [1,3,4] -> [1, 3]
		for(int i =0; i < list.size(); i++) {
			list.remove(i);
		}
}
}
