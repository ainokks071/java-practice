package innerclass;

public class InnerClassTest1 {

	public static void main(String[] args) {
		 B b = new B();
		 b.methodB();
	}

}

class A {
	int i =100;
	B b = new B();

}

class B {
	// B클래스는 A클래스를 사용하고있다.	
	// B클래스에서 A클래스를 사용하려면 A객체를 생성해야만 한다.	
	// 이제, B클래스를 A클래스의 내부 클래스로 변경해보자.
	void methodB() {
		A a = new A();
		System.out.println(a.i);
	}
}

class C {
	B b = new B();
}
