package ch08_04;

import java.io.File;
import java.io.IOException;

public class Ex8_11 {
//		File file = new File("파일.txt");
//		file.createNewFile();

	public static void main(String[] args) {
		
		String fileName = "";
		
		try {
			File file = makeFile(fileName);
			System.out.println(file.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}
	
	
//	파일 이름을 받아서 파일 생성하는 메서드 
//	파일 이름이 없다면 제목없음.txt로 파일 생성할 것.
//	예외떠넘길것.
	static File makeFile(String fileName) throws Exception{
		
		if(fileName == null || fileName.equals("")) {
			fileName = "제목없음.txt";
			File file = new File(fileName);
			file.createNewFile();
			
			return file;
		}
		
		File file = new File(fileName);
		file.createNewFile();
		
		return file;
	}

}
