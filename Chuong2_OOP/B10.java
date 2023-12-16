package chuong2_NgoVanHiep;
import java.util.Scanner;
public class B10 {
	public static void main(String[] args) {
		double a,b;
		Scanner s = new Scanner(System.in);
		System.out.print("Nhap a = ");
		a = s.nextDouble();
		System.out.print("Nhap b = ");
		b = s.nextDouble();
		System.out.println("Chu vi hcn = " + (a*2+b*2));
		System.out.println("Dien tich hcn = " + (a*b));
	}
}
