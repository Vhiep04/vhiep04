package B9;
public class Triangle extends Shape {
	private int base;
	private int height;
	public Triangle() {
		super();
	}
	public Triangle(String color, int base, int height) {
		super(color);
		this.base = base;
		this.height = height;
	}

	@Override
	public double getArea() {
		
		return (1.0/2)*base*height;
	}
	@Override
	public String toString() {
		return super.toString()+ " Base: "+base+", Height: "+ height;
	}
}