package exam;

public class IPTV extends ColorTV {
	String address;
	protected IPTV(int size, int color,String address) {
		super(size, color);
		this.address=address;
	}
	public void printProperty() {
		System.out.println("나의 IPTV는"+this.address+super.getSize()+"인치"+super.getColor()+"컬러");
	}
}
