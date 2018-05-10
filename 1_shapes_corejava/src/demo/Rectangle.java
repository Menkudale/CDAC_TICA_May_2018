package demo;

public class Rectangle extends Shape {

	private int length;
	private int breadth;

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
		this.calculateArea();
	}

	public int getBreadth() {
		return breadth;
	}

	public int getLength() {
		return length;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void calculateArea() {
		this.area = this.length * this.breadth;
	}

}
