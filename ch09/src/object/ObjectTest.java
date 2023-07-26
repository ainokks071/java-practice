package object;

/*  import java.lang.* : java.lang패키지는 자동 import. */


//주제 : 모든 class의 최고조상인 Object클래스! -> equals(), hashCode(), toString()에 대해 알아보자. 
public class ObjectTest {

	public static void main(String[] args) {
		
		//여기서, Object클래스의 멤버 이용하자. !
		Object1 ob1 = new Object1(10);
		Object1 ob2 = new Object1(10);
		
		//1)
		System.out.println(ob1.equals(ob2)); //false
		//2)
		if(ob1.equals(ob2)) 
			System.out.println("ob1과 ob2는 같은 객체입니다.");
		else 
			System.out.println("ob1과 ob2는 다른 객체입니다.");
		
		
		//3)
		if(ob1.hashCode() == ob2.hashCode()) 
			System.out.println("ob1과 ob2는 같은 객체입니다.");
		else 
			System.out.println("ob1과 ob2는 다른 객체입니다.");
	
		System.out.println(ob1.hashCode());
		System.out.println(ob2.hashCode());
		
	}

}

class Object1 /*extends Object : 모든 클래스의 최고 조상클래스. 자동으로 상속!!!!! */{
	
	int a;
	
	//생성자.
	Object1(int a) {
		this.a = a;
	}
 	
	//Object클래스의 생략된(by 상속) 11가지 메서드 존재 !
	
	void method() {
		
	}
	
}

