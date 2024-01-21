package theme1_LambdaExpression;

@FunctionalInterface
interface MyFunction2 {
	public abstract int max(int a, int b);
}


public class LambdaTest2 {

	public static void main(String[] args) {
		
		//1. 람다식 작성
		MyFunction2 myFunction2 = (a, b) -> {
			if(a > b) {
				return a;
			} else {
				return b;
			}
		};
		
		//2. 람다식 호출
		int max = myFunction2.max(5, 19);
		System.out.println(max); //19
		
		//5. 람다식을 매개변수로 받는 메서드 호출 
		RambdaUse rambdaUse = new RambdaUse();
		max = rambdaUse.methodA(myFunction2);
		System.out.println(max); //5
		
		//6. 람다식을 반환하는 메서드 호출
		MyFunction2 myFunction22 = rambdaUse.methodB();
		max = myFunction22.max(5, 6);
		System.out.println(max); //6
		
		
	}
	
	
}

//메서드를 클래스로 따로 빼거나, 동일한 클래스 내부의 static메서드로 작성
class RambdaUse {
	
	//3. 람다식을 매개변수로 받는 메서드 작성
	int methodA(MyFunction2 myFunction2) {
		return myFunction2.max(1, 5);
	}
	
	//4. 람다식을 반환하는 메서드 작성
	MyFunction2 methodB() {
		return (a, b) -> {
			if(a > b) {
				return a;
			} else {
				return b;
			}
		};
	}
	
}


