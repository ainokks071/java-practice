package ch08_04;

import java.io.File;
import java.io.IOException;

public class Ex8_12 {
//		File file = new File("파일.txt");
//		file.createNewFile();

	public static void main(String[] args) {
		try {
			File file = makeFile(args[0]);
			System.out.println(file.getName() + "파일이 성공적으로 생성.");
		} catch (Exception e) {
			System.out.println(e.getMessage() + "다시 입력해주세요.");  
		}
		
	}
	
//	파일 이름을 받아서 파일 생성하는 메서드 
//	파일 이름이 없다면 제목없음.txt로 파일 생성할 것.
//	예외떠넘길것. 
	static File makeFile(String fileName) throws Exception{
		
		if(fileName == null || fileName.equals("")) {
			throw new Exception("파일 이름이 유효하지 않습니다.");
		}
		
		File file = new File(fileName);
		file.createNewFile();
		
		return file;
	}

}
