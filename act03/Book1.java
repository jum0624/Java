
public class Book1 {
	String title;
	String author;
	void show() {
		System.out.println(title+" "+author);
	}
	public Book1() {
		this("","");
		System.out.println("������ ȣ���");
	}
	public Book1(String title) {
		this(title,"���ڹ̻�");
	}
	public Book1(String title, String author) {
		this.title=title; this.author=author;
	}

	public static void main(String[] args) {
		Book1 littlePrince=new Book1("�����","�������丮");
		Book1 loveStory=new Book1("������");
		Book1 emptyBook=new Book1();
		Book1 bible=new Book1("bible");
		
		bible.show();
	}

}
