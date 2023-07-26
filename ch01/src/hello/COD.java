package hello;

public class COD {

	public static void main(String[] args) {

		
//		System.out.println("후문우물 "+cod(6.0, 4.1, 0.67));
//		System.out.println("선동호 "+cod(9.4, 4.1, 0.67));
//		System.out.println("미술대하천수"+cod(10.6, 4.1, 0.67));
		System.out.println("100ml당 가격 " + (cost(190,60, 41900)*100) + "원/100ml");
	}

	
	//물의 COD값 반환해주는 메서드 
	private static double cod(double a, double b, double f) {
		
		double COD = (a-b) * f * 0.2 * 10;
		
		return COD;
		
	}
	
	private static double cost(double ml, double gaet_su, double total_cost) {
		
		double _100ml_cost = total_cost / (ml * gaet_su); 
		
		return _100ml_cost;
		
	}

}
