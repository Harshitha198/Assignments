
public class cylinder extends circle {

	double height = 1.0;
	double volume = 1.0;

	public cylinder() {
		super();
	}

	public cylinder(double radius) {
		super(radius);
	}

	public cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}

	public cylinder(double radius, double height, String color) {
		super(radius, color);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getVolume() {
		return Math.PI * getRadius() * getRadius() * getHeight();
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	@Override
	public String toString() {
		return "\nCylinder [getVolume()=" + getVolume() + ", getColor()=" + getColor() + ", getArea()=" + getArea()
				+ "]";
	}
}
