package classinstance;

import java.util.Scanner;

public class Ex6_1 {

	public static void main(String[] args) {
		
		System.out.println("Tv를 켜시겠습니까? 맞으면 0번, 틀리면 1번을 눌러주세요 ");
		Scanner sc = new Scanner(System.in);
		int power = sc.nextInt();
	
		Tv tv = new Tv();
		tv.power(power);
		
		System.out.println("현재 전원은 " + Tv.power + "이며, " + "현재 채널은 " + Tv.ch + "번 입니다.");
		
		System.out.println("채널을 변경하시겠습니까? 올리려면 +, 내리려면 -를 눌러주세요 ");
		sc.nextLine();
		String ch = sc.nextLine();
		tv.chModify(ch);

		System.out.println("채널이 변경되었습니가. 현재 채널은 " + Tv.ch + "번 입니다.");
		
//		
//		System.out.println(new Tv().color); //null
//		Tv t2 = new Tv();
//		Tv t3 = new Tv();
//		Tv t4 = new Tv();
//		Tv t5 = new Tv();
//		System.out.println(new Tv()); 
//		System.out.println(new Tv()); 
//		System.out.println(new Tv()); 
//		System.out.println(new Tv()); //객체의 주소.
		
		
	}

}


