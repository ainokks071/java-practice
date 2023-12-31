package kr.tpc;

//잘 설계된 DTO, VO 
public class MemberVO {
	
	//1. 정보 은닉 -> 잘못된 데이터 필터링 ! (getter, setter 이용 )
	private String name;
	private int age;
	private String tel;
	private String addr;
	
	//2. 기본생성자 명시적으로 만들 것. + 오버로딩생성자(초기화 효율적으로 하기 위함)
	public MemberVO() {}
	
	public MemberVO(String name, int age, String tel, String addr) {
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.addr = addr;
	}
	
	//3. getter, setter 메서드 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		//메서드를 이용하면, 잘못된 데이터를 필터링이 가능하다 !
		if(age <=0 || age > 138) {
			this.age = 99;
		} else {
			this.age = age;			
		}
	}
	
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}

	//4.toString 객체가 지닌 전체 값을 문자열로 출력. -> 한꺼번에 보면 편하다(디버깅)
	@Override
	public String toString() {
		return "MemberVO [name=" + name + ", age=" + age + ", tel=" + tel + ", addr=" + addr + "]";
	}
	
	
	
	
	
	
	

}
