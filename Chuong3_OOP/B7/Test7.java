package B7;

public class Test7 {
	public static void main(String[]args) {
		Circle c= new Circle(2.5);
		System.out.println("Dien tich dinh tron: "+c.getArea());
		ResizableCircle rc= new ResizableCircle();
		rc.resize(2);
		System.out.println("dien tich hinh tron sau khi thay doi: " + rc.getArea());
	}
}