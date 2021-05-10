import java.util.Scanner;
import java.util.InputMismatchException;

public class Song {
	
	public String title, artist, country; // ����, ����, ����
	public int year; // ��ǥ�⵵
	
	public Song() {}  //�⺻������
	
	public Song(int y, String c, String art, String t) { // �Ű������� ���� ������
		year = y;
		country = c;
		artist = art;
		title = t;
	}
	
	public void show() {
		System.out.println(year+"��, "+country+" ������ "+artist+"�� �θ� \""+title+"\"");
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
				System.out.println("������ �ƴմϴ�. �ٽ��Է��ϼ���."); //�߻����� ���ڿ� �Է½� ����ó��
				sc.next();
			}
		}
		String country = sc.next();
		String artist = sc.next();
		String title = sc.nextLine();
		Song a = new Song(year,country,artist,title); // ��ü ����
		a.show(); //�뷡���� ���
		
		sc.close();
		
	}

}
