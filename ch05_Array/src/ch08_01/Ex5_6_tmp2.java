package ch08_01;

public class Ex5_6_tmp2 {

//	가위 바위 보 랜덤으로 10번 내기.
	public static void main(String[] args) {
		
		String[] arr = {"가위", "바위", "보"};
		
		for(int i = 0; i < 10; i++) {
			int n = (int)(Math.random()*3);
			System.out.println(arr[n]);
		}
	}
}
