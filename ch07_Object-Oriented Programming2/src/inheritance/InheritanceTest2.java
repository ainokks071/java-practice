package inheritance;

public class InheritanceTest2 {

	public static void main(String[] args) {
		
		SmartTv2.a = 10;
		System.out.println(SmartTv2.a);
		
		SmartTv2.num();
		System.out.println(SmartTv2.a);
		
		
		
		
		SmartTv2 stv = new SmartTv2();
		
		/* 최상위 클래스인 Object클래스의 toString()사용.
		 * 
		System.out.println(stv.toString()); //stv 객체의 주소값 반환.
		System.out.println(stv); //객체의 주소값 반환. //둘 다 동일! 편한거사용.
		SmartTv stv2 = new SmartTv();
		System.out.println(stv2); //다른 주소!
		*/
		
		
		stv.ch = 10;
		stv.chUp();
		System.out.println(stv.ch);

		stv.displayCaption("ㅎㅇ");
		stv.caption = true;
		stv.displayCaption("ㅎㅇ");

	}

}

class SmartTv2 extends Tv2 {
	
	boolean caption;
	
	
	void displayCaption(String text) {
		if(this.caption) {
			System.out.println(text);
		}
				
	}
}


class Tv2 {
	
	static int a;
	boolean power;
	int ch;
	
	static void num() {
		a = 20;
	}
	
	void power() {
		this.power = true;
	}
	
	void chUp(){
		this.ch = this.ch + 1;
	}
	
	void chDown() {
		this.ch = this.ch - 1;
	}
	
	
}
