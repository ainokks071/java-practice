package polymorphism1;

public class PolymorphismTest {

	public static void main(String[] args) {
		
		//다형성의 정의! : 자식인스턴스를 부모타입으로 참조할 수 있다!
		Tv t9 = new SmartTv();
		Tv t10 = new AnalogTv();
		
		//리모컨(참조변수) 기능 5개, 객체(인스턴스) 기능 5개 
		Tv t1 = new Tv();
		//에러 : 자식클래스 타입의 참조변수로, 부모인스턴스를 참조할 수 없다.  java.lang.ClassCastException
		//부모 -> 자식으로.
//		SmartTv smt3  = (SmartTv)t1;
		
		//리모컨(참조변수) 기능 7개, 객체(인스턴스) 기능 5개 
//		SmartTv smt1 = new Tv(); 에러 : 자식클래스 타입의 참조변수로, 부모인스턴스를 참조할 수 없다.
		
		//리모컨(참조변수) 기능 7개, 객체(인스턴스) 기능 7개 
		SmartTv smt2 = new SmartTv();
		//가능 : 부모클래스 타입의 참조변수로, 자식인스턴스를 참조할 수 있다.
		//자식 -> 부모로.
		Tv t3 = (Tv)smt2;
		
		//리모컨(참조변수) 기능 5개, 객체(인스턴스) 기능 7개 
		Tv t2 = new SmartTv(); //가능! : 부모클래스 타입의 참조변수로, 자식인스턴스를 참조할 수 있다.
		//부모 -> 자식으로.
		SmartTv smt4 = (SmartTv)t2;
		

		//따라서, 리모컨(참조변수)의 기능이 객체(인스턴스)의 기능의 갯수보다 같거나 적어야한다. 
	}

}

class Tv {
	//5
	boolean power;
	int channel;
	
	void power() {
		
		power = !power;
	}
	
	void channelUp() {
		
		++channel;
	}
	
	void channelDown() {
		
		--channel;
	}
}

class SmartTv extends Tv{
	
	String caption;
	
	void caption() {
		System.out.println("자막");
	}
}

class AnalogTv extends Tv{
	
	String babo;
	
	void caption2342() {
		System.out.println("자막");
	}
}
