package pakage1;

import pakage2.MyParent;
//여기는 pakage1이다.
//pakage2의 MyParent클래스는 외부 패키지이다.
//public클래스 : pakage2의 MyParent클래스는 public클래스이므로, 여기 에서도 객체생성 가능!! 단, import문 필수!

public class MyChildTest {

/*정리
 * Pakage1(MyChildTest(main), MyChild extends MyParent(객체))
 * Pakage2(MyParent(객체))
 * 
 * protected 변수 : 부모 클래스에서 선언, (동일 패키지 또는 다른 패키지의) 자식 클래스에서 사용!!
 * 
 * 
 * */	
	
	/* MyParent클래스(pakage2)
	 * prv; dft; prt; pbl;
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		//MyParent클래스는 다른 패키지인 pakage2에 존재!!
		//부모 객체 생성 
		MyParent myParent1 = new MyParent();
//		myParent1.prv = 10; //접근X
//		myParent1.dft = 10; //접근X
//		myParent1.prt = 10; //접근X
		myParent1.pbl = 10; //접근O
//		myParent1.printMembers1(); //접근X : default메서드
		myParent1.printMembers2(); //접근O : public메서드 //0 0 0 10
						
		MyParent myParent2 = new MyParent(10, 10, 10, 10);
//		myParent2.printMembers1(); //접근X : default메서드
		myParent2.printMembers2(); //접근O : public메서드 //10 10 10 10
		
		
		//자식 객체 생성 : 동일한 pakage1에 존재!!
		MyChild myChild1 = new MyChild();
//		myChild1.prv = 10; //사용X, MyParent 클래스 에서만 사용가능.
//		myChild1.dft = 10; //사용X, pakage2 패키지 에서만 사용가능.
//		myChild1.prt = 10; //접근X pakage2 패키지 + pakage1의 상속받은 MyChild클래스에서만 사용가능. 
		myChild1.pbl = 10; //접근O
		myChild1.dft2 = 10; //접근O : default 변수 
		
		myChild1.printMembers1(); //10 10 10
		
		//상속받은 메서드호출
		myChild1.printMembers2(); //0 0 10 10
		
		MyChild myChild2 = new MyChild(10,10,10,10,10);
		myChild2.printMembers2(); // 10 10 10 10
		
		
		
	}

}
