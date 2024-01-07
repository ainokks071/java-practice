package ch06;


public class InitializationTest4 {

	public static void main(String[] args) {
		//초기화순서 : static변수 초기화 -> 객체생성 후 -> 인스턴스변수 초기화.
		/* 1. static변수 b = 0(자동초기화) -> b = 20 (명시적 초기화) 
		 * 2. main()로 넘어와서, b = 20출력.
		 * 3. new -> 객체 생성하면서, a = 0(자동 초기화) -> a = 10이 됨. (명시적 초기화)
		 * 4. 생성자 호출하면서, 20zz, a = 10출력 -> a = 5출력(생성자를 이용한 초기화)
		 * 5. 결론 : 생성자가 중요하네 ㅋㅋ
		 * */
		System.out.println(Initialization.b);
		
		//객체 생성 한번 
		new Initialization();
		
		//객체 생성 두 번 -> static변수는 고정되어있음!!!!!!!!!!!!!!!!인스턴스변수만 새로운 객체에 새롭게 생성!! 
		new Initialization();
	
		
	}

}
class Initialization {

	static int b = 20;
	
	int a = 10;
	
	Initialization() {
		System.out.println(b + "zz");
		System.out.println(this.a); //10
		this.a = 5; 
		System.out.println(this.a); //5
	}
}

