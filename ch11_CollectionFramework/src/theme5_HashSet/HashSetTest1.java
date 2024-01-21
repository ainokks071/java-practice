package theme5_HashSet;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;



public class HashSetTest1 {

	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("abc");
		set.add("abc");
		set.add(new Person("David", 10)); //p2
		set.add(new Person("David", 10)); //p1
		
		//add메서드 내부
		//p2.eqauls(p1);
		
		System.out.println(set);
	}

}

class Person {

	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	//set의 add메서드 내부에서, p1.equals(p2) 호출 : p1은 기존에 저장된 person객체, p2는 새롭게 추가할 person 객체 
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Person) { // 새롭게 추가할 person객체가 person 타입으로 형변환이 가능하다면,
			Person p2 = (Person)obj; // person타입으로 형변환을 해라.
			if(this.name.equals(p2.name) && this.age == p2.age) { //p1과 p2의 iv값을 비교해서
				return true; //그 값이 모두 같다면 true를 return
			}
		} 
		
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.name, this.age);
	}
	
	
	
}