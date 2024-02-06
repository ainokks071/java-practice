package theme1_LambdaExpression;


public class LambdaTest1 {

	public static void main(String[] args) {
//		람다식 = 익명객체 !! (자바에서 메서드는 반드시 클래스 안에 있어야함 !!)
//		 Object obj1 = (a, b) -> a > b ? a : b; 함수형 인터페이스 ?? -> 단 하나의 추상메서드만 갖고있는 인터페이스.
//		 리모콘을 사용하기 위해, 함수형 인터페이스 타입으로 참조한다!!(핵심..)
//		 익명 객체 : 클래스의 선언(클래스의 내용물 ex.메서드)과 객체 생성을 동시에.
		
		 Object obj = new Object() {
			 int max(int a, int b) {
				 return a > b ? a : b;
			 }
		 };
		 
//		 Object obj1 = (a, b) -> a > b ? a : b;
		 
//		 obj.max(3,5); obj 리모콘에는 max() 버튼이 없어서 호출 불가능.
		
//		1. 익명객체로 // 인터페이스 구현 -> 오버라이딩 -> 접근제어자 좁힐 수 없다..
		MyFunction myFunction = new MyFunction() {
			public int max(int a, int b) {
				return a > b ? a : b;
			}
		};
//		
//		int value = myFunction.max(3, 5);
//		System.out.println(value);
		
		
//		람다식 = 익명 객체 <- 객체(람다식)를 다루기 위한 타입은 함수형 인터페이스 타입으로 한다 !
		
//		2. 람다식으로 
		MyFunction myFunction2 = (a, b) -> a > b ? a : b;
		
		int value = myFunction2.max(10, 15);
		System.out.println(value);
		
//		Collections.sort
	}

}

//애너테이션 붙이면 -> 함수형 인터페이스는 단 하나의 추상메서드를 가져야한다. 두개 적으면 에러 남.
@FunctionalInterface
interface MyFunction {
	public abstract int max(int a, int b);
}
