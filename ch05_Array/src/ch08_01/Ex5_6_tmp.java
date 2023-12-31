package ch08_01;

import java.util.Arrays;

public class Ex5_6_tmp {

//	String클래스 = char[] + 메서드
//	String 클래스의 주요 메서드
	
//	char charAt(int index)
//	String substring(int from, int to)
//	int length()
//	char[] toCharArray()
//	boolean equals(Object obj)
	
	public static void main(String[] args) {
		
		String str = "안녕하세요";
		
		char ch = str.charAt(3);
		System.out.println(ch); //세
		
		String str2 = str.substring(0, 3); //안 녕 하 
		System.out.println(str2);
		
		String str3 = str.substring(1, str.length()); //녕 하 세 요  
		System.out.println(str3);
		
		String str4 = str.substring(1); //녕 하 세 요  
		System.out.println(str4);
		
		char[] arr = str.toCharArray();
		System.out.println(Arrays.toString(arr)); //[안, 녕, 하, 세, 요]
		System.out.println(arr.length); //5
		System.out.println(arr[2]); //하 
		
		System.out.println(str.equals("안녕하세"));
		
		
	}
}
