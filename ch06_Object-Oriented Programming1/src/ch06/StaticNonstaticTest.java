package ch06;

public class StaticNonstaticTest {

	public static void main(String[] args) {
//		1. static변수에 접근
		StaticNonstatic.a = 10;
		StaticNonstatic.b = 20;
//		2. static메서드 호출
		StaticNonstatic.add1(10, 20);
		StaticNonstatic.add2(10, 20);
		
//		3. non-static변수에 접근
		StaticNonstatic sn = new StaticNonstatic();
		sn.x = 10;
		sn.y = 20;
//		4. non-static메서드 호출
		sn.add3();
		sn.add4();
		
	}
	
}

class StaticNonstatic {
	//static 변수 
	static int a;
	static int b;
	
	//인스턴스 변수 
	int x;
	int y;
	
	//static 메서드1
	static int add1(int p, int q) {
		//같은 클래스 안에서,
		//static메서드는 static 변수 직접 사용 가능.
		a = 10;
		b = 20;
		
		//static메서드는 인스턴스변수 사용 불가능
		//x = 10;
		//y = 20;
		return a+b+p+q;
	}
	
	//static 메서드2
	static int add2(int a, int b) {
		//같은 클래스 안에서,
		//static메서드는 다른 static 메서드 호출 가능
		int p = add1(a, b);
		
		//static메서드는 인스턴스메서드 호출 불가능
		//int a = add3();
		return p; 
	}
	
	//인스턴스 메서드1
	int add3() {
		//같은 클래스 안에서,
        //인스턴스 메서드는 인스턴스 변수 사용 가능.
		this.x = 10;
		this.y = 20;
		
		//인스턴스 메서드는 static 변수 사용 가능.
		a = 10;
		b = 20;
		return this.x + this.y + a + b;
	}
	
	//인스턴스 메서드2
	int add4() {
		//같은 클래스 안에서,
        //인스턴스 메서드는 다른 인스턴스 메서드 직접 호출 가능 
		int a = add3();
		
		//인스턴스 메서드는 다른 static메서드도 직접 호출 가능
		int b = add1(10, 20);
		int c = add2(10, 20);
		
		return a+b+c;
	}
}
