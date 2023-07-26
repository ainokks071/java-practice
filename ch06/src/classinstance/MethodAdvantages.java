package classinstance;

public class MethodAdvantages {

	public static void main(String[] args) {

		//정수 배열 10칸 <- 임의의 수 저장. 출력 2번.

		int[] arr = new int[10];

		for(int i = 0; i < 10; i++) {
		arrSave(arr);
		arrPrint(arr);
		}
		
	}

	//배열 초기화 메소드!!
	static void arrSave(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10);
		}
	}
	
	//배열 출력 메소드!!
	static void arrPrint(int[] arr) {

		for(int i = 0; i < arr.length; i++) {
			System.err.print(arr[i] + " ");
		}
		System.out.println();

	}

}



