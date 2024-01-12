package interfaceTest;
public class InterFaceUnUsalTest1 {
	public static void main(String[] args) {
		A a = new A();
//	 	1. A가 B를 사용하다가,
		a.methodA(new B());
//		2. C를 사용하게 되었다.
		a.methodA(new C());
	}
}

class A {
	void methodA(B b) {
		b.methodB();
	}
//  3. 추가된 메서드 !!(A는 변경이 필수적)
	void methodA(C c) {
		c.methodC();
	}
}

class B { 
	public void methodB() {
		System.out.println("methodB");
	}
}

class C { 
	public void methodC() {
		System.out.println("methodC");
	}
}