package classinstance;


public class InitializationTest3 {

	public static void main(String[] args) {
			
		System.out.println(Nansu.num); // num = 0
		Nansu.num = 10;
		System.out.println(Nansu.num); // num = 10
		
		System.out.println(Nansu.arr[0]);

	}

}
/*실행 순서
 * 1. num = 0, arr 생성, sysout"ㅎㅇ", arr 초기화 
 * 2. num출력, num = 10 출력, 배열출력 */

class Nansu {
	
	static int num;
	
	static int[] arr = new int[10];
	
	static //static블럭 : static변수 초기화.
	{
		System.out.println("ㅎㅇ");
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = (int)(Math.random()*10) + 1;
			
		}
	}
	

}

