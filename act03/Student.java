
public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name=name;
		this.ban=ban;
		this.no=no;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	public int getTotal() {
		return kor+eng+math;
	}
	public float getAverage() {
		double min=(kor+eng+math)/3f;
		return ((int)(min*10+0.5f))/10f;
	}
	public String info() {
		return name+", "+ban+", "+no+", "+kor+", "+eng+", "+math+", "+getTotal()+", "+getAverage();
	}

	public static void main(String[] args) {
		Student s=new Student("ȫ�浿",1,1,100,60,76);
		
		System.out.println(s.info());
	}

}
