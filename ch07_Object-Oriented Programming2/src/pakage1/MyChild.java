package pakage1;

import pakage2.MyParent;

public class MyChild extends MyParent {
	
	//상속받은 멤버변수들!!
//	private   int prv; : 상속받았어도, (클래스, 패키지) 달라서, 접근X
//	          int dft; : 상속받았어도, (패키지) 달라서, 접근X
	
//	protected int prt; : 상속받았기 때문에, 접근O
//	public    int pbl; : 사용O
	
	// 결론1) 상속해준 부모클래스가 다른패키지에 있다면? public, protected변수 사용 가능!!
	// 결론2) 상속해준 부모클래스가 동일패키지에 있다면? public, protected, default변수 사용 가능!!

	int dft2;
	
	MyChild () {}
	
	MyChild (int prv, int dft, int prt, int pbl, int dft2) {
		super(prv,dft,prt,pbl);
		this.dft2 = dft2;
	}
	
	void printMembers1() {
//		System.out.println(super.prv); MyParent 클래스 에서만 사용가능.
//		System.out.println(super.dft); pakage2 패키지 에서만 사용가능.
		// 부모가 protected변수로 선언했으면 자식에서 무조건 가져다 쓸 수 있다!!
		super.prt = 10;
		System.out.print(super.prt + " "); //pakage2 패키지 + pakage1의 상속받은 MyChild클래스에서만 사용가능. 
		System.out.print(super.pbl + " ");
		System.out.println(this.dft2);
	}
	

}
