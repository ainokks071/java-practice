package ch08_02;

public class Ex8_null {

	private static String str;

	public static void main(String[] args) {
		
		str = null;
		
		try {
			
			str.equals("안녕하세요.");
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			str = "안녕";
			
			System.out.println(str);
			
		}
		
		System.out.println("zz");

	}
}
