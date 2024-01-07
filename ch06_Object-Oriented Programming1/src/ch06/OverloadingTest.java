package ch06;

public class OverloadingTest {

	public static void main(String[] args) {
		//The method add(int, long) is ambiguous(모호하다) for the type Overloading 
		//add(5, 5); 
		
		Overloading overloading = new Overloading();
		
		//두 수를 넘겨주면, 더해서 반환.
		System.out.println(overloading.add(10, 20));
		
		
		//배열을 넘겨주면, 총합을 해서 반환.
		int[] arr = new int[3];
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		System.out.println(overloading.add(arr));
		
		
	}

//	static void add(int i, long j) {
//	}
//	static void add(long i, int j) {		
//	}

}

class Overloading {

	//메서드 오버로딩 구현 
	int add(int a, int b) {
		
		int sum = a+b;
		
		return sum;
	}
	
	
	int add(int[] arr) {
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			sum += arr[i];
		}
		
		return sum;
	}
	
	
}
