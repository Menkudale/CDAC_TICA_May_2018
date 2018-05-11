package demo;

public class Circle extends Shape {

	private double radius;

	public Circle(double radius) {
		this.radius = radius;
		this.calculateArea();
	}

	public void calculateArea() {
		this.area = 3.14 * this.radius * this.radius;
	}

}
