import java.util.Arrays;

public class circle {
	
	public double radius=1.0;
	public String color="red";
	
	public circle() {
		super();
	}

	public circle(double radius, String color) {
		super();
		this.radius = radius;
		this.color = color;
	}

	public circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea() {
		return Math.PI * getRadius() * getRadius();
	}

	@Override
	public String toString() {
		return "circle [radius=" + radius + ", color=" + color + "]";
	}
	
	public static void main(String[] args) {
		circle[] circles = { new cylinder(12.34), new cylinder(12.34, 10.0), new cylinder(12.34, 10.0, "blue") };
		System.out.println(Arrays.toString(circles));
	}
	
	

}
