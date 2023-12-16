package B9;

public class Test9{
	public static void main(String[]args) {
		Rectangle hcn = new Rectangle("do", 10, 10);
		Triangle tg = new Triangle("den", 5, 5);
		if(hcn instanceof Rectangle )
			System.out.println("HCN la doi tuong duoc tao ra tu lop Rectangle");
		 else 
			System.out.println("HCN khong phai la doi tuong duoc tao ra tu lop Rectangle");
		
	}
}