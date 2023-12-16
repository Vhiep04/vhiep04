package B7;

public class ResizableCircle extends Cirle implements Resizable{
	public ResizableCircle() {
	}
	public ResizableCircle(double radius) {
		super(radius);		
	}
	@Override
	public void resize(int percent) {
		this.radius=percent;
	}
}