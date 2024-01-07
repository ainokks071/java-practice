package ch06;

public class StaticAndInstanceTest {

	/*
	 * 1. 소스파일(StaticAndInstance.java) 저장(컴파일) -> 클래스파일(StaticAndInstance.class)
	 * 2. 메모리(RAM)에 클래스파일 로드! -> 이제부터 CPU가 접근 가능!
	 * 3. 클래스파일이 메모리에 올라오면, 선언한 클래스변수 이미 생성!!
	 * 4. 프로그램 실행 -> main메서드 호출! -> 객체 생성.
	 * 4. 따라서, 객체 생성 전에 접근 후, 클래스변수 초기화 가능!!(클래스 메서드도 아무때나 호출 가능!)
	 * 
	 * 
	 * <클래스변수> 언제사용? : 한 클래스의 모든 인스턴스들이 공통적인 값을 유지해야 할 때 static변수 사용!
	 * - 모든 인스턴스들이 한 공간에서 공유하는 공유변수(인스턴스변수는 인스턴스 각각 독립적인 저장공간이 존재함.)
	 * - 프로그램 시작도 전에 이미 생성되어있음.
	 * - 따라서, 객체 생성 전에도 아무때나 접근 가능.
	 * 
	 * <클래스메서드> 언제사용? : 클래스메서드 내에서 인스턴스변수, 인스턴스메서드 사용하지 않을 때, static메서드 사용!
	 * - 아무때나 접근 가능.
	 * - 클래스메서드 내에서 인스턴스 변수 절대 사용 못함..!!
	 * - 클래스메서드 내에서 객체 생성 후 인스턴스 변수에 접근하는 건 가능하네??? --> iv는 객체 생성하면 무조건 사용가능하구나..

	 *  */
	
	public static void main(String[] args) {
		//객체 생성하기도 전에, 클래스에 접근 후 static변수의 초기화 가능!!
		StaticAndInstance.a = 10;
		StaticAndInstance.b = 879878729;
	
		StaticTest.test();
		
		System.out.println(StaticAndInstance.b);
		
		//static메서드도 객체 생성 전에, 사용 가능!!
		System.out.println(StaticAndInstance.add3(34, StaticAndInstance.b)); //34. 879878729 전달.
		
		//객체생성하면 이제서야 인스턴스변수 생성!!
		StaticAndInstance test = new StaticAndInstance(10 ,20);
		System.out.println("인스턴스메서드 add1메서드 : " + test.add1()); //30
		System.out.println("클래스메서드 add3메서드 : " + StaticAndInstance.add3(test.x, test.y)); //30
		System.out.println("클래스메서드 add3메서드 : " + StaticAndInstance.add3(StaticAndInstance.a, test.y)); //30
		System.out.println("인스턴스메서드 add2메서드 : " + test.add2()); //320	
		
		System.out.println("zz"+ StaticAndInstance.countPlus());
	}
	
}

class StaticAndInstance {
	
	//클래스 변수 
	static int a;
	static int b = 8989;
	static int count;
	
	//인스턴스 변수 
	int x = 99;
	int y;
	
	StaticAndInstance() {	}
	
	//생성자.
	StaticAndInstance(int x, int y) {
		this.x = x;
		this.y = y;
	}
		
	//인스턴스메서드1 
	int add1() {
		return this.x + this.y;
	}

	//인스턴스메서드2 내에서 인스턴스변수인 x 사용 가능!!
	int add2() {
		this.x = 300;
		return this.x + this.y;
	}
	
	//클래스메서드 
	static int add3(int a, int b) {
	//this.x = 10; -> 클래스메서드 내에서 인스턴스변수인 x 사용 불가!!(따로따로 논다. )
		
		new StaticAndInstance().x = 10; //이건 또 되네..?
		a++;
		return a+b;
	}
	
	
	static int countPlus() {
		int count = StaticAndInstance.count + 1;
		return count;
	}
	
}

class StaticTest {

	static void test() {
	new StaticAndInstance().x = 10;
	}
	
}