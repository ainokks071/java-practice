package myex;

public class Ex6_20 {
	
	static int max(int[] arr) {
		  int max = 0;
		  for(int i = 0; i < arr.length; i++) {
			  if(max < arr[i]) {
				  max = arr[i];
			  }
		  }	
		return max;
	}

	public static void main(String[] args) {
		
		int[] arr = {1012321220, 923123929, 1221333342, 1812312212, 20001230};
		
		System.out.println(max(arr));

	}

}
