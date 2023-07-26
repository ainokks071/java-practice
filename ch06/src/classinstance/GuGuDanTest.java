package classinstance;

import java.util.Scanner;

public class GuGuDanTest {

	public static void main(String[] args) {

		
		
		System.out.println("구구단 단수 2~9단을 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int dan = scanner.nextInt();
		
		GuGuDan gugudan = new GuGuDan();
		gugudan.gugu(dan);
	}
	
}

class GuGuDan {
	
	void gugu(int dan) {

	if(dan >= 2 && dan <= 9) {
		System.out.println("<" + dan + "단>");
		for(int j = 1; j < 10; j++) {
				System.out.println(dan + " * " + j + " = " + (dan * j));
			}
		
	} else {
		
		System.out.println("경고!! 2~9단을 입력해주세요.");
		
	}
			
	}
	
}



