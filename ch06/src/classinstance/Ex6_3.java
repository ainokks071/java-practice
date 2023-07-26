package classinstance;

public class Ex6_3 {

	public static void main(String[] args) {
		
		Tv t1;
//		System.out.println(t1); 에러 

		Tv t2 = new Tv(); //객체 생성 !
		System.out.println(t2); //객체의 주소.
		System.out.println(t2.color); //String은 참조형 변수! 의 기본값 = null
		
		Tv[] tvArr = new Tv[5]; //배열 생성 !
		System.out.println(tvArr); //배열의 주소. //아직 객체 생성 안함!!
		System.out.println(tvArr[0]); //null -> Tv는 참조형 변수 -> 참조형의 기본값 = null

		tvArr[0] = new Tv(); //객체 생성 !
		System.out.println(tvArr[0]); //객체의 주소.
	}

}


