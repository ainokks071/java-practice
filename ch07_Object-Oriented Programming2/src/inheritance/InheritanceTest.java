package inheritance;

public class InheritanceTest {

	public static void main(String[] args) {
		
		SmartTv stv = new SmartTv(); //9개 
		System.out.println(stv.toString());
		System.out.println(stv.equals(stv));
		System.out.println(stv.hashCode());
		
		
		System.out.println(stv.x); //20
		System.out.println(stv.power); //20
		System.out.println(stv.caption); //20
		System.out.println(stv.ch); //20
		stv.power(); //20
		stv.chUp();
		stv.chDown();
		stv.print();
		stv.displayCaption(null);
		
		Tv t2 = new SmartTv(); //6개 
		System.out.println(t2.x);
		System.out.println(t2.power);
		System.out.println(t2.ch);
		t2.power();
		t2.chUp();
		t2.chDown();
		
		
		Tv t = (Tv)stv;
		System.out.println(t.x); //10
//		System.out.println(t.y);
		
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

//자식클래스
class SmartTv extends Tv {
	
	//자식에서 새롭게 추가된 x=20
	int x = 20;
	
	boolean caption;
	
	void print() {
		
		System.out.println(this.x);
		System.out.println(super.x);	
		
	}
	
	void displayCaption(String text) {
		
		if(this.caption) {
			System.out.println(text);
		}
		
	}

	@Override
	public String toString() {
		return "SmartTv [x=" + x + ", caption=" + caption + ", power=" + power + ", ch=" + ch + "]";
	}
	
	
}

//부모클래스 
class Tv extends Object {
	
	int x = 10;
	boolean power;
	int ch;
	
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
