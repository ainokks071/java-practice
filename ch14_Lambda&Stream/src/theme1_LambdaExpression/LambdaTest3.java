package theme1_LambdaExpression;

@FunctionalInterface
interface MyFunction3 {
	void run();
}


public class LambdaTest3 {

	public static void main(String[] args) {
						 //람다식은 익명 객체, 내부클래스의 한 종류 !
		MyFunction3 f1 = () -> System.out.println("f1.run()");
		f1.run();
		
		MyFunction3 f2 = new MyFunction3() {
			
			//오버라이딩 규칙 : 조상 인터페이스 구현 시, 메서드의 접근제어자는 좁힐 수 없다 ! public이 안전 
			@Override
			public void run() {
				System.out.println("f2.run()");
				
			}
		};
		
		f2.run();
		
		MyFunction3 f3 = getMyFunction3();
		f3.run();
		
		excute(()->System.out.println("f4.run()"));
		
	}
	
	//동일한 클래스 내, 메인메서드 밖, 새로운 메서드 정의 시, static 메서드로 작성 !
	
	//람다식을 반환하는 메서드 작성 
	static MyFunction3 getMyFunction3() {
		return () -> System.out.println("f3.run()");
	}
	
	//람다식을 매개변수로 받는 메서드 작성
	static void excute(MyFunction3 f) {
		f.run();
		
	}
	
}