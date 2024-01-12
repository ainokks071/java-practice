package ch06;


public class CardTest2 {

	public static void main(String[] args) {
		
		System.out.println(new Card2().color+" "+Card2.width);
		
		
	}
	

}

class Card2 {
	
//	final은 상수이므로 반드시 초기화, 변할 수 없는 값.
	final static int width = 100;
	final static int height = 200;
	
	final String color ="red";
	final String shape ="diamond";
	
}