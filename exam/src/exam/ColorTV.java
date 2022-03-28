package exam;

public class ColorTV extends TV {

	protected ColorTV(int size, int color) {
		super(size, color);
	}
	
	public void printProperty() {
		System.out.println(super.getSize()+"인치"+super.getColor()+"컬러");
	}
}
