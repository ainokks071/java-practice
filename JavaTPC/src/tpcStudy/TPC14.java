package tpcStudy;

import kr.tpc.MemberVO;

public class TPC14 {

	public static void main(String[] args) {

		MemberVO m = new MemberVO();
		
//		직접 접근 불가 ! m.name = "홍길동 ";
		
		m.setName("홍길동");
		m.setAge(50);
		m.setTel("010-1111-11111");
		m.setAddr("서울 ");
		
		System.out.println(m.getName() + " " + m.getAge() + " " + m.getTel() + " " + m.getAddr());
	}

}
