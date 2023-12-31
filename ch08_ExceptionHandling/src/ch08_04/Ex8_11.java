package ch08_04;

import java.io.File;


/*
 * 1. jvm으로부터 문자열을 받는다.
 * 2-1. 문자열이 null or 빈문자열일 수도 있다.
 * 2-2. 문자열이 제대로 올 수 있다.
 * 3. 메서드를 작성한다.
 *  - 문자열을 받아서, 그 문자열로 파일 객체를 생성한다. -> 빈문자열일 경우, 제목없음.txt
 *  - 파일객체에 접근해서 실제 파일을 생성한다.
 *  - 파일객체를 호출한 쪽으로 보낸다.
 * 4. 메인메서드는 파일의 이름을 출력한다.
 * */
public class Ex8_11 {

	public static void main(String[] args) {
		
		String fileName = null;
		
		try {
			fileName = args[0];
			File file = makeFile(fileName);
			System.out.println(file.getName() + " 파일이 생성되었습니다.");
			
		} catch (Exception e) {
			
			try {
				File file = makeFile("");
				System.out.println(file.getName() + " 파일이 생성되었습니다.");
			} catch (Exception e1) {
				
			}
			
		}
	}
	
	static File makeFile(String fileName) throws Exception {
		
		File file = null;
		
		if(fileName == null || fileName.equals("")) {
			fileName = "제목없음.txt";
			file = new File(fileName);
			file.createNewFile();
			
			return file;
			
		}
		
		file = new File(fileName);
		file.createNewFile();
		
		return file;
	}
	
	
}
