package ch14_02;

@FunctionalInterface
interface MyFunction {
//	반환타입 x, 매개변수 x 추상메서드 
	void run();
}

public class Ex14_1 {

	public static MyFunction myFunction() {
		return () -> System.out.println("run3()");
	}
	
	public static void myFunction2(MyFunction myFunction) {
		myFunction.run();
	}
	
	public static void main(String[] args) {
		
		
		MyFunction f1 = () -> System.out.println("run1()");
		f1.run();
		
		MyFunction f2 = new MyFunction() {
			@Override
			public void run() {
				System.out.println("run2()");
			}
		};
		f2.run();

		MyFunction f3 = myFunction();
		f3.run();
		
		myFunction2(() -> System.out.println("run4()"));
		
	}

}
