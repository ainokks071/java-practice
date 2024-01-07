package ch06;

import java.util.Scanner;

public class LikeCountTest {

	public static void main(String[] args) {
		
		//상황 : 회원0이 글을 남김. 회원1과 회원2가 좋아요를 누름.
		
		
		Article[] articleArr = new Article[3];
		articleArr[0] = new Article();
		articleArr[1] = new Article();
		articleArr[2] = new Article();
		
		articleArr[0].title = "글1";
		articleArr[1].title = "글2";
		articleArr[2].title = "글3";
		
		User[] userArr = new User[3];
		userArr[0] = new User();
		userArr[1] = new User();
		userArr[2] = new User();
		
		userArr[0].id = "회원1";
		userArr[1].id = "회원2";
		userArr[2].id = "회원3";
	
		//회원1로 로그인 된 상태!!
		//1을 누르면 회원1의 글에 좋아요를 누름. 2를 누르면 회원2의 글에 좋아요를 누름. 3을 누르면 회원3의 글에 좋아요를 누름.
		while(true) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			
			if(a==1) {
				Article.like(a, userArr, articleArr);			
			} else if(a==-1) {
				Article.hate(a, userArr, articleArr);
			}	

			if(Article.countArr[0] == 10 || Article.countArr[1] == 10 || Article.countArr[0] == 10 ) 
			break;
			
		}

	}

}

class Article {
	
	static int[] countArr = new int[3];
	
	String title;
	
	static void like(int a, User[] userArr, Article[] articleArr) {
		
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		
		if(b==1) {
			countArr[b]++;
			
			System.out.println(
					userArr[0].id + "님께서 " + userArr[b].id + "님의 " + articleArr[b].title + "에 좋아요를 눌러 조회수 : " + countArr[b]);	
			
		} else if(b==2) {
			
			System.out.println(
					userArr[0].id + "님께서 " + userArr[b].id + "님의 " + articleArr[b].title + "에 좋아요를 눌러 조회수 : " + countArr[b]);	
			
		}	
		
	}


	static void hate(int a, User[] userArr, Article[] articleArr) {
		
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		
		if(b==1) {
			countArr[b]--;
			
			System.out.println(
					userArr[0].id + "님께서 " + userArr[b].id + "님의 " + articleArr[b].title + "에 싫어요를 눌러 조회수 : " + countArr[b]);	
			
		} else if(b==2) {
			
			System.out.println(
					userArr[0].id + "님께서 " + userArr[b].id + "님의 " + articleArr[b].title + "에 싫어요를 눌러 조회수 : " + countArr[b]);	
			
		}
		
		}
	
}

class User {
	
	String id;
}
