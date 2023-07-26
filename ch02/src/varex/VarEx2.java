package varex;

public class VarEx2 {

	public static void main(String[] args) {
		
		//두 변수에 저장된 값 바꾸기
		int x = 10;
		int y = 20;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		System.out.println("======");
		
		int temp;
		temp = x;
		x = y;
		y = temp;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		System.out.println("======");

		//세 개의 변수에 저장된 값 바꾸기 (a=20, b=30, c=10)
		int a = 10;
		int b = 20;
		int c = 30;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
		System.out.println("======");
		
		int tem = a;
		a = b;
		b = c;
		c = tem;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
	}

}
