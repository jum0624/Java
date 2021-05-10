import java.util.Scanner;
import java.util.InputMismatchException;

public class Song {
	
	public String title, artist, country; // 제목, 가수, 국적
	public int year; // 발표년도
	
	public Song() {}  //기본생성자
	
	public Song(int y, String c, String art, String t) { // 매개변수를 가진 생성자
		year = y;
		country = c;
		artist = art;
		title = t;
	}
	
	public void show() {
		System.out.println(year+"년, "+country+" 국적의 "+artist+"가 부른 \""+title+"\"");
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int year = 0;
		while(true) {
			try {
				year = sc.nextInt();
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시입력하세요."); //발생연도 문자열 입력시 예외처리
				sc.next();
			}
		}
		String country = sc.next();
		String artist = sc.next();
		String title = sc.nextLine();
		Song a = new Song(year,country,artist,title); // 객체 생성
		a.show(); //노래정보 출력
		
		sc.close();
		
	}

}
