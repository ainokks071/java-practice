package object;

public class ObjectTest3 {

	
	//주제 : 모든 class의 최고조상인 Object클래스! -> equals(), hashCode(), toString()에 대해 알아보자. 
	public static void main(String[] args) {
		
		//String클래스 iv를 같은 값으로 초기화. -> 같고 다름 비교.
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		//String클래스의 equals()와 hashCode()는 이미, 오버라이딩 되어있다! -> iv값 같으면 hashCode값도 같다.
		System.out.println(str1.equals(str2)); //true
		System.out.println(str2.hashCode() == str1.hashCode()); //true
		
		System.out.println(str1.hashCode()); 
		System.out.println(str2.hashCode());
		
		
		
		
		

	}

}


