package B7;

public class Circle implements GeometricObject{
	protected double radius =1.0;
	
	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}
	@Override
	public double getPerimerter() {
		return 2*radius*Math.PI;
	}

	@Override
	public double getArea() {
		return Math.pow(radius, 2)*Math.PI;
	}
	
}