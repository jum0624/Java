class TV{
	private int size;
	
	public TV() {
		this.size = 0;
	}
	public TV(int size) {
		this.size = size;
	}
	public int getSize() {
		return size;
	}
}

class ColorTV extends TV{
	private int color;
	public ColorTV() {
		this.color = 0;
	}
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	public void printProperty() {
		System.out.print(super.getSize() + "��ġ " + color + "�÷�");
	
	}
}
public class ColorTVEx {

	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32,1024);
		myTV.printProperty();
	}

}
