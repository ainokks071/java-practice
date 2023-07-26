package classinstance;

public class Ex6_5 {

	public static void main(String[] args) {
	
		
		Tv[] tvArr = new Tv[5];
		
		//방법1
		for(int i = 0; i < tvArr.length; i++) {
			
			tvArr[i] = new Tv();
		}
		
		//방법2
		tvArr[0] = new Tv();
		tvArr[1] = new Tv();
		tvArr[2] = new Tv();
		tvArr[3] = new Tv();
		tvArr[4] = new Tv();
	
		}
		
	}



