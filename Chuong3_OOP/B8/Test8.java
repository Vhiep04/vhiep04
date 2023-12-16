package B8;

public class Test8 {
	public static void main(String[]args) {
		Rectangle hcn =new Rectangle("do", 10, 10);
		Triangle tg = new Triangle("den", 5, 5);
		System.out.println("Dien tich tam giac la: "+ tg.getArea());
		System.out.println("Dien tich hcn la: "+ hcn.getArea());
	}
}