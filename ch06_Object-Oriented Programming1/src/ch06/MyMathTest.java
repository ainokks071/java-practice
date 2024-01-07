package ch06;

public class MyMathTest {

	public static void main(String[] args) {

		
		My4Math math = new My4Math();
		double result1 = math.add(5,3);
		double result2 = math.subtract(5,3);
		double result3 = math.multiply(5,3);
		double result4 = math.divide(5,3);
		double result5 = math.max(5,100);
		double result6 = math.diff(1,99);
		
		System.out.println("두 수의 합 = " + result1);
		System.out.println("두 수의 차 = " + result2);
		System.out.println("두 수의 곱 = " + result3);
		System.out.println("두 수의 나눗셈 = " + result4);
		System.out.println("두 개의 수 중 더 큰 수 = " + math.max(99,100));
		System.out.println("두 개의 수 차이의 절댓값 = " + result6);

	}

}

class My4Math {

	//두 수 중에서, 더 큰 값 반환해주는 메서드 
	double max(double i, double j) {
		//메서드 내 지역변수는 일단 초기화 해라? 안해도 되네?
//		double max;
		
//		if(i > j) {
//			max = i;
//		} else {
//			max = j;
//		}
		
//		max = i > j ? i : j;
		
		//한 줄로 끝나네. 
		return i > j ? i : j; //더 작은 수 출력하려면 i, j 순서 바꾸면 됨.
	}
	
	//두 수를 전달받아, 그 차이값을 절대값으로 반환해주는 메서드 (diff, abs 두 개의 메서드 이용!)
	
	double diff(double x, double y) {
//		
//		if(x > y) 
//			return (x-y);
//		else
//			return -(x-y);
//		
		return abs(x-y);
	}
	
	double  abs(double x) {
		
		if(x>0)
			return x;
		else
			return -x;
		
	}
	
	
	double add(double x, double y) {

		double result = x + y;
		
		return result;
	}


	double subtract(double x, double y) {
		return x - y;
	}

	double multiply(double x, double y) {
		return x * y;
	}
	double divide(double x, double y) {
		return x / y;
	}
	
	
	
	
}
