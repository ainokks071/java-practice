package object;

/*  import java.lang.* : java.lang패키지는 자동 import. */


//주제 : 모든 class의 최고조상인 Object클래스! -> equals(), hashCode(), toString()에 대해 알아보자. 
public class ObjectTest2 {

	public static void main(String[] args) {
		
		Object2 ob1 = new Object2(15);
		Object2 ob2 = new Object2(15);
		
		if(ob1.equals(ob2)) {
			System.out.println("ob1과 ob2는 같은 값입니다.");
		} else {
			System.out.println("ob1과 ob2는 다른 값입니다.");						
		}
		
	}

}

class Object2 {
	
	int a;
	
	//생성자.
	Object2(int a) {
		this.a = a;
	}
 	
	//생략된 11가지 메서드 존재 ! -> equals() 오버라이딩 !
	public boolean equals(Object obj) {
		
		
//		1. 문제점 : instanceof 사용 x
//		return ((Object2)obj).a == this.a;
		
//		2. 	
//		if(obj instanceof Object2) {
//			return ((Object2)obj).a == this.a;
//		} else {
//			return false;
//		}
		
//		3.
//		if(obj instanceof Object2) {
//				
//			if(this.a == ((Object2)obj).a) {
//				return true; 				
//			} else {
//				return false;				
//			}
//			
//		} else {
//			return false;				
//		}
		
		//4.
		if(!(obj instanceof Object2)) {
			return false;
		}
		
		return this.a == ((Object2)obj).a;

	}

}

