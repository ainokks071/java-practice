package tpcStudy;

import kr.tpc.BookDTO;

public class TPC10 {

	public static void main(String[] args) {

		//기본자료형
		//int, double, char, boolean
		int a;
		a = 10;
		
		//사용자정의자료형(참조자료형, 객체자료형)
		//책(BookDTO)이라는 자료형을 만들자. -> class를 이용해서.
		
		BookDTO b;
		b = new BookDTO();
		
		b.title = "자바 ";
		b.price = 17000;
		b.company = "영진출판사 ";
		b.page = 670;
		
		System.out.println(b.title + "  " + b.price + " " + b.company + " " + b.page);
	}

}
